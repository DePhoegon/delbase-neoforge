// NodeJS
// Intended for Support mods making Slabs, Stairs, Walls, Fences, fence gates, from a singular block from either MC, or another mod.
// Creates Blockstates, Model files, Item files 
// ver. 2.0 (fixed minor problems, and one overlooked variable that was missing)
// ver. 2.5 (fixed accidental missing '/' & accidental included '/', fixed & addreseed cases where one or two textures are used.)
// ver. 3.0 - Fixed all the outputs to be what was expected.  (and supply template files to go with this if asked)
var fs = require('fs');
const { resolve } = require('path');
const path = require('path');

var baseDrive = 'D:/' // Set This block of variables as needed
var baseFolder = baseDrive+'MC_JSONS';
var bridgeModID = 'delbridgebop'; // ModID of the mod intended be the namespace of the model jsons
var baseModID = 'minecraft';
var leftModID = 'delbase'; //ModID of one of the Mods the Bridge connects
var rightModID = 'biomesoplenty'; //ModID of the other Mod the bridge connects
var customModModelTemplateID = 'delbase'; // ModID of the custom Templates

var blockState = '/assets/blockstates'; // Local file structure, 
var models = '/assets/models';
var baseModelFiles = '/block';
var fenceModelFiles = baseModelFiles+'/fence';
var fenceGateModelFiles = baseModelFiles+'/fence_gate';
var slabModelFiles = baseModelFiles+'/slab';
var wallModelFiles = baseModelFiles+'/wall'; 
var stairModelFiles = baseModelFiles+'/stair'; 
var itemModelFiles = models+'/item';
var lootTableFiles = '/loot_tables/blocks';

var useCustomTemplate = false; // Boolean section
var useCustomModelFolders = false;
var useWoodCycle = false;
var useWallTwist = false; // Setup to be used, but not triggerable
var useColumnStair = false; // Setup to be used, but not triggerable.  woodlikes will use columnStairs (and default to the top/bottom texture if not provided)

var templateFencePost = 'block/fence_post'; // Minecraft Locations for model Templates (defaults)
var templateFenceSide = 'block/fence_side';
var templateFenceInventory = 'block/fence_inventory';
var templateFenceGate = 'block/template_fence_gate';
var templateFenceGateOpen = 'block/template_fence_gate_open';
var templateFenceGateWall = 'block/template_fence_gate_wall';
var templateFenceGateWallOpen = 'block/template_fence_gate_wall_open';
var templateWallInventory = 'block/wall_inventory'
var templateWallWallPost = 'block/template_wall_post';
var templateWallSide = 'block/template_wall_side';
var templateWallSideTall = 'block/template_wall_side_tall';
var templateStair = 'block/stairs';
var templateInnerStair = 'block/inner_stairs';
var templateOuterStair = 'block/outer_stairs';
var templateSlab = 'block/slab'; 
var templateSlabTop = 'block/slab_top';
var templateWholeBlock = 'block/cube_bottom_top'; // typical cubes
var templateSlabDouble = templateWholeBlock;

var customFencePost = 'block/template/fence_post'; // Custom template section, need to already be made
var customFenceSide = 'block/template/fence_side';
var customFenceGate = 'block/template/fence_gate';
var customFenceGateOpen = 'block/template/fence_gate_open';
var customFenceGateWall = 'block/template/fence_gate_wall';
var customFenceGateWallOpen = 'block/template/fence_gate_wall_open';
var customFenceInventory = 'block/template/fence_inventory';
var customFenceSideWoodTweak = 'block/template/fence_side_wood_tweak'; // No plans to use yet
var customStairs = 'block/template/stairs';
var customStairsColumn = 'block/template/stairs_column'; // Column uses a seperate (from the horizontal) texture from the vertical inside bits
var customInnerStair = 'block/template/inner_stairs';
var customInnerStairColumn = 'block/template/inner_stairs_column';// Column uses a seperate (from the horizontal) texture from the vertical inside bits
var customouterStairs = 'block/template/outer_stairs';
var customouterStairsColumn = 'block/template/outer_stairs_column';// Column uses a seperate (from the horizontal) texture from the vertical inside bits
var customWallPost = 'block/template/wall_post';
var customWallSide = 'block/template/wall_side';
var customWallSideTwist = 'block/template/wall_side_twist'; // Turns texture 90' on side
var customWallSideTall = 'block/template/wall_side_tall';
var customWallSideTallTwist = 'block/template/wall_side_tall_twist';// Turns texture 90' on side
var customWallInventory = 'block/template/wall_inventory';
var baseTextureTag = 'texture'; // fences only
var customTextureUpDownTag = baseTextureTag; // fences only
var customTextureSideTag = 'postside'; // fences only

var blockName; // On Call Variables
var textureOne; // Top/bottom 
var textureTwo; // Sides(outsides)
var textureThree; // Insides - Sides (Stairs, Column use only) [currently only woodlikes use this]
var textureModID; // assigned in code & called to write in files.
var textureUseCount;

const myArgs = process.argv.slice(2);
keystart(myArgs);
async function setVariables(Args) {
    let rawName;
    let typeName;
    rawName = Args[0];
    typeName = Args[1];
    if (rawName == 'help') {
        errorout('Input as node fivemodeltypes \'name of block\' \'Use Custom template (0 - false/1 - true)\' \'Use Custom Model File Location(0 - false/1 - true)\' \'texture count(1-3)\' \'ModID of the textures location (0 - Minecraft/1 - Bridge ModID/2 - Left ModID/3 - Right ModID)[set inside file]\' \'texture name 1\' \'texture name 2(optional)\' \'texture name 3(optional)\'\nExample\nnode ./fiveModelTypes base_block_name 1 1 3 2 texture_log_top log_texture_side log_texture_inside_side\n\nUse of Custom Templates requires prior setup. can easily be used without custom templates\n\n Use 0 on texture 2 & 3 to default it to texture 1\nExample\nnode ./fiveModelTypes base_block_name 1 1 3 2 texutre_name 0 0')
    }
    blockName = rawName;
    if (typeName != 0) { 
        if (typeName == 'woodtype') {
            useWoodCycle = true;
        } else { blockName = blockName + '_' + typeName; }
    }
    if (Args[2] == 0 || Args[2] == 1) {
        if (Args[2] == 0) { useCustomTemplate = false; } else { useCustomTemplate = true; }
    } else {
        errorout('wrong selection of custom or built in templates for model files.')
    }
    // Use Custom Model File Location (0 = false//1 = true)
    if (Args[3] == 0 || Args[3] == 1) {
        if (Args[3] == 0) { useCustomModelFolders = false; } else { useCustomModelFolders = true; }
    } else {
        errorout('Invalid selection of custom or built in(For Minecraft) folder structure')
    }
    textureUseCount = Args[4];
    if (textureUseCount < 1) { errorout('number of textures claimed less than 1') }
    var num = Args[5];
    if (num == 0) { textureModID = baseModID; }
    if (num == 1) { textureModID = bridgeModID; }
    if (num == 2) { textureModID = leftModID; }
    if (num == 3) { textureModID = rightModID; }
    if (num < 0 || num > 3) {errorout('missing/invalid selection for texture modID');}
    if (Args[6] != null){ 
        textureOne = Args[6];
        textureTwo = textureOne;
        textureThree = textureOne;
    } else { errorout('no valid texture given') }
    if (Args[7] != 0) { if (textureUseCount > 1) { textureTwo = Args[7] } }
    if (Args[8] != 0) { if (textureUseCount > 2) { textureThree = Args[8] } }
}
function errorout(extmsg) {
    console.log(extmsg);
    process.exit();
}
function fileOut(fileOut, message, newfile) {
    if (newfile) { fs.openSync(fileOut, 'w'); }
    fs.appendFileSync(fileOut, message+'\n');
}
function keystart(argums){
    setVariables(argums).then(blockStates(useCustomModelFolders)).then(fenceModels(useCustomTemplate, useCustomModelFolders)).then(slabModels(useCustomModelFolders)).then(wallModels(useCustomTemplate, useCustomModelFolders)).then(stairModels(useCustomTemplate, useCustomModelFolders)).then(lootTable());
}
function blockStates(useCustomtmpath) {
    let blockPath;
    let foldPath = path.join(baseFolder, blockState);
    fs.mkdirSync(foldPath, { recursive: true });
    blockPath = 'block/';
    if (useWoodCycle) { 
        bsAid(foldPath, blockName+'_wood', useCustomtmpath, blockPath);
        bsAid(foldPath, blockName+'_log', useCustomtmpath, blockPath);
        bsAid(foldPath, 'stripped_'+blockName+'_wood', useCustomtmpath, blockPath);
        bsAid(foldPath, 'stripped_'+blockName+'_log', useCustomtmpath, blockPath);
    } else { bsAid(foldPath, blockName, useCustomtmpath, blockPath); }
}
function bsAid(folderPath, bName, usePathCustom, bPath) {
    let bPathTmp = bPath;
    if (useCustomModelFolders) { bPathTmp = slabModelFiles.slice(1); }
    bsSlab(path.join(folderPath, bName+'_slab.json'), bPathTmp, bName)
    if (usePathCustom) { bPathTmp = fenceModelFiles.slice(1); }
    bsFence(path.join(folderPath, bName+'_fence.json'), bPathTmp, bName)
    if (usePathCustom) { bPathTmp = fenceGateModelFiles.slice(1); }
    bsFenceGate(path.join(folderPath, bName+'_fence_gate.json'), bPathTmp, bName)
    if (usePathCustom) { bPathTmp = wallModelFiles.slice(1); }
    bsWall(path.join(folderPath, bName+'_wall.json'), bPathTmp, bName)
    if (usePathCustom) { bPathTmp = stairModelFiles.slice(1); }
    bsStairStart(path.join(folderPath, bName+'_stair.json'), bPathTmp, bName)
}
function bsFence(fileLocation, filePath, bName) {
    let post = filePath+'/'+bName+'_fence_post';
    let side = filePath+'/'+bName+'_fence_side';
    let uvlock = '\"uvlock\": true';
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"multipart\": [', false);
    fileOut(fileLocation, '{', false);
    fileOut(fileLocation, '\"apply\": {', false);
    fileOut(fileLocation, '\"model\": \"'+textureModID+':'+post+'\"', false);
    fileOut(fileLocation, '}', false);
    fileOut(fileLocation, '},', false);
    bsFenceAid(fileLocation, textureModID, side, 'north', uvlock, 0, false);
    bsFenceAid(fileLocation, textureModID, side, 'east', uvlock, 90, false);
    bsFenceAid(fileLocation, textureModID, side, 'south', uvlock, 180, false);
    bsFenceAid(fileLocation, textureModID, side, 'west', uvlock, 270, true);
    fileOut(fileLocation, ']', false);
    fileOut(fileLocation, '}', false);
}
function bsFenceAid(fLocation, modID, model, direct, uv, y, last) {
    let bracket;
    if(last) { bracket = '}' } else { bracket = '},' }
    fileOut(fLocation, '{', false);
    fileOut(fLocation, '\"when\": {', false);
    fileOut(fLocation, '\"'+direct+'\": \"true\"', false);
    fileOut(fLocation, '},', false);
    fileOut(fLocation, '\"apply\": {', false);
    fileOut(fLocation, '\"model\": \"'+modID+':'+model+'\",', false);
    if(y != 0) { fileOut(fLocation, '\"y\": '+y+',', false); }
    fileOut(fLocation, uv, false);
    fileOut(fLocation, '}', false);
    fileOut(fLocation, bracket, false);
}
function bsFenceGate(fileLocation, filePath, bName) {
    let gate = filePath+'/'+bName+'_fence_gate';
    let gateOpen = gate+'_open';
    let gateWall = gate+'_wall';
    let gateWallOpen = gateWall+'_open';
    let fEast = 'facing=east';
    let fWest = 'facing=west';
    let fNorth = 'facing=north';
    let fSouth = 'facing=south';
    let iWall = 'in_wall=true';
    let oWall = 'in_wall=false';
    let wOpen = 'open=true';
    let wClose = 'open=false';
    let uvlock = '\"uvlock\": true,';
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"variants\": {', false);
    fileOut(fileLocation, '\"'+fEast+','+oWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gate, uvlock, 270, false);
    fileOut(fileLocation, '\"'+fEast+','+oWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateOpen, uvlock, 270, false);
    fileOut(fileLocation, '\"'+fEast+','+iWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWall, uvlock, 270, false);
    fileOut(fileLocation, '\"'+fEast+','+iWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWallOpen, uvlock, 270, false);
    fileOut(fileLocation, '\"'+fNorth+','+oWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gate, uvlock, 180, false);
    fileOut(fileLocation, '\"'+fNorth+','+oWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateOpen, uvlock, 180, false);
    fileOut(fileLocation, '\"'+fNorth+','+iWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWall, uvlock, 180, false);
    fileOut(fileLocation, '\"'+fNorth+','+iWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWallOpen, uvlock, 180, false);
    fileOut(fileLocation, '\"'+fSouth+','+oWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gate, uvlock, 0, false);
    fileOut(fileLocation, '\"'+fSouth+','+oWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateOpen, uvlock, 0, false);
    fileOut(fileLocation, '\"'+fSouth+','+iWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWall, uvlock, 0, false);
    fileOut(fileLocation, '\"'+fSouth+','+iWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWallOpen, uvlock, 0, false);
    fileOut(fileLocation, '\"'+fWest+','+oWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gate, uvlock, 90, false);
    fileOut(fileLocation, '\"'+fWest+','+oWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateOpen, uvlock, 90, false);
    fileOut(fileLocation, '\"'+fWest+','+iWall+','+wClose+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWall, uvlock, 90, false);
    fileOut(fileLocation, '\"'+fWest+','+iWall+','+wOpen+'\": {', false);
    bsFenceGateAid(fileLocation, textureModID, gateWallOpen, uvlock, 90, true);
    fileOut(fileLocation, '}', false);
    fileOut(fileLocation, '}', false);
}
function bsFenceGateAid(fLocation, modID, model, uv, y, last) {
    let bracket;
    if (last) { bracket = '}' } else { bracket = '},'  }
    fileOut(fLocation, uv, false);
    if (y != 0) { fileOut(fLocation, '\"y\": '+y+',', false); }
    fileOut(fLocation, '\"model\": \"'+modID+':'+model+'\"', false);
    fileOut(fLocation, bracket, false);
}
function bsWall(fileLocation, filePath, bName) {
    let uvlock = '\"uvlock\": true';
    let fmodel = filePath+'/'+bName;
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"multipart\": [', false);
    bsWallAid(fileLocation, textureModID, 'up', 'true', fmodel+'_wall_post', uvlock, 0, false, false);
    bsWallAid(fileLocation, textureModID, 'north', 'low', fmodel+'_wall_side', uvlock, 0, false, true);
    bsWallAid(fileLocation, textureModID, 'east', 'low', fmodel+'_wall_side', uvlock, 90, false, true);
    bsWallAid(fileLocation, textureModID, 'south', 'low', fmodel+'_wall_side', uvlock, 180, false, true);
    bsWallAid(fileLocation, textureModID, 'west', 'low', fmodel+'_wall_side', uvlock, 270, false, true);
    bsWallAid(fileLocation, textureModID, 'north', 'tall', fmodel+'_wall_side_tall', uvlock, 0, false, true);
    bsWallAid(fileLocation, textureModID, 'east', 'tall', fmodel+'_wall_side_tall', uvlock, 90, false, true);
    bsWallAid(fileLocation, textureModID, 'south', 'tall', fmodel+'_wall_side_tall', uvlock, 180, false, true);
    bsWallAid(fileLocation, textureModID, 'west', 'tall', fmodel+'_wall_side_tall', uvlock, 270, true, true);
}
function bsWallAid(fLocation, ModID, fkey, fvalue, model, uv, y, last, useUV){
    let close;
    if (last) { close = '\n}\n}\n]\n}' } else { close = '\n}\n},' }
    fileOut(fLocation, '{', false);
    fileOut(fLocation, '\"when\": {', false);
    fileOut(fLocation, '\"'+fkey+'\": \"'+fvalue+'\"\n},', false);
    fileOut(fLocation, '\"apply\": {', false);
    if (useUV) {
        fileOut(fLocation, '\"model\": \"'+ModID+':'+model+'\",', false);
        if (y > 0) { fileOut(fLocation, '\"y\": '+y+','); }
        fileOut(fLocation, uv+close, false); 
    } else { fileOut(fLocation, '\"model\": \"'+ModID+':'+model+'\"'+close, false); }
}
function bsSlab(fileLocation, filePath, bName) {
    let psName = filePath+'/'+bName+'_slab';
    let pdName = filePath+'/'+bName+'_slab_double';
    let ptName = filePath+'/'+bName+'_slab_top';
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"variants\": {', false);
    fileOut(fileLocation, '\"type=bottom\": {', false);
    fileOut(fileLocation, '\"model\": \"'+textureModID+':'+psName+'\"\n},', false);
    fileOut(fileLocation, '\"type=double\": {', false);
    fileOut(fileLocation, '\"model\": \"'+textureModID+':'+pdName+'\"\n},', false);
    fileOut(fileLocation, '\"type=top\": {', false);
    fileOut(fileLocation, '\"model\": \"'+textureModID+':'+ptName+'\"\n}\n}\n}', false);
}
function bsStairStart(fileLocation, filePath, bName) {
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"variants\": {');
    bsStairAidSplitOne(fileLocation, textureModID, filePath+'/', bName);
}
function bsStairAidSplitOne(fLocation, ModID, filePath, bName) {
    bsStairAidSplitTwo(fLocation, ModID, 'east', filePath, bName);
    bsStairAidSplitTwo(fLocation, ModID, 'north', filePath, bName);
    bsStairAidSplitTwo(fLocation, ModID, 'south', filePath, bName);
    bsStairAidSplitTwo(fLocation, ModID, 'west', filePath, bName);
}
function bsStairAidSplitTwo(fLocation, ModID, face, filePath, bName) {
    bsStairAidSPlitThree(fLocation, ModID, face, 'bottom', filePath, bName);
    bsStairAidSPlitThree(fLocation, ModID, face, 'top', filePath, bName);
}
function bsStairAidSPlitThree(fLocation, ModID, face, half, filePath, bName) {
    bsStairAid(fLocation, ModID, face, half, 'inner_left', filePath, bName);
    bsStairAid(fLocation, ModID, face, half, 'inner_right', filePath, bName);
    bsStairAid(fLocation, ModID, face, half, 'outer_left', filePath, bName);
    bsStairAid(fLocation, ModID, face, half, 'outer_right', filePath, bName);
    bsStairAid(fLocation, ModID, face, half, 'straight', filePath, bName);
}
function bsStairAid(fLocation, ModID, face, half, shape, filePath, bName) {
    let modBName;
    if (shape == 'straight') { modBName = bName+'_stair' } else { modBName = bName+'_stair_'+shape.slice(0,5); }
    let more = true;
    fileOut(fLocation, '\"facing='+face+',half='+half+',shape='+shape+'\": {', false);
    if (face == 'east') {
        if (shape == 'inner_right' || shape == 'outer_right' || shape == 'straight') {
            if (half == 'bottom') {
                fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\"\n},', false);
                more = false;
            }
        }
        if (more) {
            fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\",', false);
            if (half == 'top') { 
                fileOut(fLocation, '\"x\": 180,', false);
                if (shape == 'inner_right' || shape == 'outer_right') { fileOut(fLocation, '\"y\": 90,', false); } 
            } else {
                if (shape == 'inner_left' || shape == 'outer_left') { fileOut(fLocation, '\"y\": 270,', false); }
            }
            fileOut(fLocation, '\"uvlock\": true\n},')
        }
    }
    if (face == 'north') {
        fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\",', false);
        if (half == 'top') {
            fileOut(fLocation, '\"x\": 180,', false); 
            if (shape == 'inner_left' || shape == 'outer_left' || shape == 'straight') { fileOut(fLocation, '\"y\": 270,', false); }
        } else {
            if (shape == 'outer_left' || shape == 'inner_left') { fileOut(fLocation, '\"y\": 180,', false); } else { fileOut(fLocation, '\"y\": 270,', false); }
        }
        fileOut(fLocation, '\"uvlock\": true\n},')
    }
    if (face == 'south') {
        if (half == 'bottom') {
            if (shape == 'outer_left' || shape == 'inner_left') {
                fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\"\n},', false);
                more = false;
            }
        }
        if (more){
            fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\",', false);
            if (half == 'top') {
                fileOut(fLocation, '\"x\": 180,', false);
                if (shape == 'outer_left' || shape == 'inner_left') { fileOut(fLocation, '\"y\": 90,', false); } else { fileOut(fLocation, '\"y\": 180,', false); }
            } else { fileOut(fLocation, '\"y\": 90,', false); }
            fileOut(fLocation, '\"uvlock\": true\n},')
        }
    }
    if (face == 'west') {
        fileOut(fLocation, '\"model\": \"'+ModID+':'+filePath+modBName+'\",', false);
        if (half == 'bottom') {
            if (shape == 'outer_left' || shape == 'inner_left') { fileOut(fLocation, '\"y\": 90,', false); } else { fileOut(fLocation, '\"y\": 180,', false); }
        } else {
            fileOut(fLocation, '\"x\": 180,', false);
            if (shape == 'inner_right' || shape == 'outer_right') { fileOut(fLocation, '\"y\": 270,', false); } else { fileOut(fLocation, '\"y\": 180,', false); }
            if (shape == 'straight') { more = false; }
        }
        if (more) { fileOut(fLocation, '\"uvlock\": true\n},') } else { fileOut(fLocation, '\"uvlock\": true\n}\n}\n}') }
    }
}
function fenceModels(customTemplateLocation, customModelLocation){
    let fold;
    let foldg;
    if (customModelLocation) { 
        fold = path.join(baseFolder, models, fenceModelFiles);
        foldg = path.join(baseFolder, models, fenceGateModelFiles);
        fs.mkdirSync(foldg, { recursive: true });
    } else { 
        fold = path.join(baseFolder, models, baseModelFiles);
        foldg = fold;
    }
    fs.mkdirSync(fold, { recursive: true });
    if (useWoodCycle) {
        fmAid(customTemplateLocation, customModelLocation, fold, foldg, blockName+'_wood')
        fmAid(customTemplateLocation, customModelLocation, fold, foldg, blockName+'_log')
        fmAid(customTemplateLocation, customModelLocation, fold, foldg, 'stripped_'+blockName+'_wood')
        fmAid(customTemplateLocation, customModelLocation, fold, foldg, 'stripped_'+blockName+'_log')
    } else { fmAid(customTemplateLocation, customModelLocation, fold, foldg, blockName) }
}
function fmAid(customTemplateLocation, customModelLocation, fmodel, fgmodel, bName) {
    let iFold = path.join(baseFolder, itemModelFiles);
    fs.mkdirSync(iFold, { recursive: true });
    fmFencePost(fmodel, customTemplateLocation, bName);
    fmFenceSide(fmodel, customTemplateLocation, bName);
    fmFenceInventory(fmodel, customTemplateLocation, bName);
    fmFenceGate(fgmodel, customTemplateLocation, bName);
    fmFenceGateOpen(fgmodel, customTemplateLocation, bName);
    fmFenceGateWall(fgmodel, customTemplateLocation, bName);
    fmFenceGateWallOpen(fgmodel, customTemplateLocation, bName);    
    fmFenceItems(iFold, customModelLocation, bName);
}
function fmFencePost(folder, iscustomtemplate, bName){
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_post.json')
    if (iscustomtemplate) {
        template = customFencePost;
        templatemod = customModModelTemplateID;
    } else {
        template = templateFencePost;
        templatemod = baseModID;
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceSide(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_side.json')
    if (iscustomtemplate) { 
        template = customFenceSide;
        templatemod = customModModelTemplateID;
    } else {
        template = templateFenceSide;
        templatemod = baseModID;
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceInventory(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_inventory.json')
    if (iscustomtemplate) {
        template = customFenceInventory;
        templatemod = customModModelTemplateID;
    } else {
        template = templateFenceInventory;
        templatemod = baseModID;
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceGate(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_gate.json')
    if (iscustomtemplate) {
        template = customFenceGate;
        templatemod = customModModelTemplateID; 
    } else {
        template = templateFenceGate;
        templatemod = baseModID; 
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceGateOpen(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_gate_open.json')
    if (iscustomtemplate) {
        template = customFenceGateOpen;
        templatemod = customModModelTemplateID;
    } else {
        template = templateFenceGateOpen;
        templatemod = baseModID;
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceGateWall(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_gate_wall.json')
    if (iscustomtemplate) {
        template = customFenceGateWall;
        templatemod = customModModelTemplateID;
    } else { 
        template = templateFenceGateWall;
        templatemod = baseModID; 
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceGateWallOpen(folder, iscustomtemplate, bName) {
    let template;
    let templatemod;
    let json = path.join(folder, bName+'_fence_gate_wall_open.json')
    if (iscustomtemplate) { 
        template = customFenceGateWallOpen;
        templatemod = customModModelTemplateID;
    } else { 
        template = templateFenceGateWallOpen;
        templatemod = baseModID; 
    }
    fileOut(json, '{', true);
    fileOut(json, '\"parent\": \"'+templatemod+':'+template+'\",');
    fmFenceAid(textureUseCount, iscustomtemplate, json, textureModID);
}
function fmFenceItems(folder, iscustomLocation, bName) {
    let modelLocation;
    let modelgLocation;
    if (iscustomLocation) { 
        modelLocation = fenceModelFiles;
        modelgLocation = fenceGateModelFiles;
    } else { 
        modelLocation = baseModelFiles; 
        modelgLocation = modelLocation;
    }
    itemAid(path.join(folder, bName+'_fence.json'), modelLocation, 'fence_inventory', bName);
    itemAid(path.join(folder, bName+'_fence_gate.json'), modelgLocation, 'fence_gate', bName);
}
function itemAid(file, modelLocation, type, bName) {
    //used by all item models
    let model = modelLocation.slice(1);
    fileOut(file, '{', true);
    fileOut(file, '\"parent\": \"'+textureModID+':'+model+'/'+bName+'_'+type+'\"', false);
    fileOut(file, '}', false);
}
function fmFenceAid(texturecount, isCustom, file, mod) {
    fileOut(file, '\"textures\": {', false)
    if (isCustom) {
        if (texturecount > 1) {
            fileOut(file, '\"'+customTextureUpDownTag+'\": \"'+mod+':'+'block/'+textureOne+'\",', false)
            fileOut(file, '\"'+customTextureSideTag+'\": \"'+mod+':'+'block/'+textureTwo+'\"', false)
        } else {
            fileOut(file, '\"'+customTextureUpDownTag+'\": \"'+mod+':'+'block/'+textureOne+'\"', false)
        }
    } else {
        fileOut(file, '\"'+baseTextureTag+'\": \"'+mod+':'+'block/'+textureOne+'\"', false)
    }
    fileOut(file, '}\n}', false)
}
function slabModels(customModelLocation) {
    let fold;
    let texture = 'block/';
    if (customModelLocation) { fold = slabModelFiles } else { fold = baseModelFiles }
    fs.mkdirSync(fold, { recursive: true });
    if (useWoodCycle) {
        smModelAid(fold, blockName+'_wood', texture, customModelLocation);
        smModelAid(fold, blockName+'_log', texture, customModelLocation);
        smModelAid(fold, 'stripped_'+blockName+'_wood', texture, customModelLocation);
        smModelAid(fold, 'stripped_'+blockName+'_log', texture, customModelLocation);
    } else { smModelAid(fold, blockName, texture, customModelLocation); }

}
function smModelAid(foldLocation, fBaseName, tLocation, iscustomLocation) {
    let iFold = path.join(baseFolder, itemModelFiles);
    let fLocation = path.join(baseFolder, models, foldLocation)
    fs.mkdirSync(fLocation, { recursive: true });
    slbmTextureAid(path.join(fLocation+'/'+fBaseName+'_slab.json'), tLocation, baseModID, templateSlab);
    slbmTextureAid(path.join(fLocation+'/'+fBaseName+'_slab_double.json'), tLocation, baseModID, templateSlabDouble);
    slbmTextureAid(path.join(fLocation+'/'+fBaseName+'_slab_top.json'), tLocation, baseModID, templateSlabTop);
    slbmSlabItems(iFold, iscustomLocation, fBaseName);
}
function slbmTextureAid(fileLocation, bPath, baseMod, template) {
    fileOut(fileLocation, '{', true);
    fileOut(fileLocation, '\"parent\": \"'+baseMod+':'+template+'\",', false);
    fileOut(fileLocation, '\"textures\": {', false)
    fileOut(fileLocation, '\"bottom\": \"'+textureModID+':'+bPath+textureOne+'\",', false);
    fileOut(fileLocation, '\"top\": \"'+textureModID+':'+bPath+textureOne+'\",', false);
    fileOut(fileLocation, '\"side\": \"'+textureModID+':'+bPath+textureTwo+'\"\n}', false);
    fileOut(fileLocation, '}', false);
}
function slbmSlabItems(folder, iscustomLocation, bName) {
    let modelLocation;
    if (iscustomLocation) { modelLocation = slabModelFiles; } else { modelLocation = baseModelFiles; }
    itemAid(path.join(folder, bName+'_slab.json'), modelLocation, 'slab', bName)
}
function wallModels(customTemplateLocation, customModelLocation){
    let tname1 = 'wall';
    let tname2;
    let flocate;
    if (customModelLocation) { flocate = path.join(baseFolder, models, wallModelFiles) } else { flocate = path.join(baseFolder, models, baseModelFiles); }
    if (customTemplateLocation) { tname2 = 'top'; } else { tname2 = null; }
    fs.mkdirSync(flocate, { recursive: true });
    if (useWoodCycle) {
        wmAid(flocate, customTemplateLocation, blockName+'_wood', tname1, tname2, textureOne, textureTwo, customModelLocation);
        wmAid(flocate, customTemplateLocation, blockName+'_log', tname1, tname2, textureOne, textureTwo, customModelLocation);
        wmAid(flocate, customTemplateLocation,'stripped_'+blockName+'_wood', tname1, tname2, textureOne, textureTwo, customModelLocation);
        wmAid(flocate, customTemplateLocation, 'stripped_'+blockName+'_log', tname1, tname2, textureOne, textureTwo, customModelLocation);
    } else { wmAid(flocate, customTemplateLocation, blockName, tname1, tname2, textureOne, textureTwo, customModelLocation); }
}
function wmAid(fLocation, iscustomtemplate, bName, tag1, tag2, tName1, tName2, iscustomLocation) {
    let iFold = path.join(baseFolder, itemModelFiles);
    let btpath = 'block/';
    let template;
    if (iscustomtemplate) { template = customModModelTemplateID+':'; } else { baseModID+':'; }
    wmInventory(path.join(fLocation, bName+'_wall_inventory.json'), template, tag1, tag2, tName1, tName2, btpath);
    wmPost(path.join(fLocation, bName+'_wall_post.json'), template, tag1, tag2, tName1, tName2, btpath);
    wmWallSide(path.join(fLocation, bName+'_wall_side.json'), template, tag1, tag2, tName1, tName2, btpath);
    wmWallSideTall(path.join(fLocation, bName+'_wall_side_tall.json'), template, tag1, tag2, tName1, tName2, btpath);
    wmItems(iFold, iscustomLocation, bName);
}
function wmInventory(file, templateMod, tag1, tag2, tName1, tName2, bPath) {
    let parent;
    if (tag2 != null) { parent = templateMod+customWallInventory; } else { parent = templateMod+templateWallInventory; }
    wmTextureAid(file, tName1, tName2, tag1, tag2, bPath, parent);
}
function wmPost(file, templateMod, tag1, tag2, tName1, tName2, bPath) {
    let parent;
    if (tag2 != null) { parent = templateMod+customWallPost; } else { parent = templateMod+templateWallWallPost; }
    wmTextureAid(file, tName1, tName2, tag1, tag2, bPath, parent);
}
function wmWallSide(file, templateMod, tag1, tag2, tName1, tName2, bPath) {
    let parent;
    if (tag2 != null) { 
        if (useWallTwist) { 
            parent = templateMod+customWallSideTwist; 
        } else { 
            parent = templateMod+customWallSide; 
        } 
    } else { parent = templateMod+templateWallSide; }
    wmTextureAid(file, tName1, tName2, tag1, tag2, bPath, parent);
}
function wmWallSideTall(file, templateMod, tag1, tag2, tName1, tName2, bPath) {
    let parent;
    if (tag2 != null) { 
        if (useWallTwist) {
            parent = templateMod+customWallSideTallTwist;
        } else {
            parent = templateMod+customWallSideTall;
        } 
    } else { parent = templateMod+templateWallSideTall; }
    wmTextureAid(file, tName1, tName2, tag1, tag2, bPath, parent);
}
function wmTextureAid(file, texture1, texture2, tag1, tag2, bPath, parent) {
    fileOut(file, '{', true);
    fileOut(file, '\"parent\": \"'+parent+'\",', false)
    fileOut(file, '\"textures\": {', false);
    if(tag2 != null) {
        fileOut(file, '\"'+tag1+'\": \"'+textureModID+':'+bPath+texture1+'\",', false)
        fileOut(file, '\"'+tag2+'\": \"'+textureModID+':'+bPath+texture2+'\"\n}\n}', false)
    } else { fileOut(file, '\"'+tag1+'\": \"'+textureModID+':'+bPath+texture1+'\"\n}\n}', false) }
}
function wmItems(folder, iscustomLocation, bName) {
    let modelLocation;
    if (iscustomLocation) { modelLocation = wallModelFiles; } else { modelLocation = baseModelFiles; }
    itemAid(path.join(folder, bName+'_wall.json'), modelLocation, 'wall_inventory', bName)
}
function stairModels(customTemplateLocation, customModelLocation) {
    let t1 = 'bottom';
    let t2 = 'top';
    let t3 = 'side';
    let t4;
    let t5 = 'inside_base';
    let flocate;
    let column;
    if (useColumnStair) { column = true; } else { column = false; }
    if (customModelLocation) { flocate = path.join(baseFolder, models, stairModelFiles) } else { flocate = path.join(baseFolder, models, baseModelFiles); }
    if (customTemplateLocation) { t4 = 'inside'; } else { t4 = 'bob'; }
    fs.mkdirSync(flocate, { recursive: true });
    if (useWoodCycle) {
        column = true;
        smAid(flocate, customTemplateLocation, blockName+'_wood', t1, t2, t3, t4, t5, textureOne, textureTwo, textureThree, column, customModelLocation);
        smAid(flocate, customTemplateLocation, blockName+'_log', t1, t2, t3, t4, t5, textureOne, textureTwo, textureThree, column, customModelLocation);
        smAid(flocate, customTemplateLocation, 'stripped_'+blockName+'_wood', t1, t2, t3, t4, t5, textureOne, textureTwo, textureThree, column, customModelLocation);
        smAid(flocate, customTemplateLocation, 'stripped_'+blockName+'_log', t1, t2, t3, t4, t5, textureOne, textureTwo, textureThree, column, customModelLocation);
    } else { smAid(flocate, customTemplateLocation, blockName, t1, t2, t3, t4, t5, textureOne, textureTwo, textureThree, column, customModelLocation); }
}
function smAid(fLocation, iscustomtemplate, bName, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, column, iscustomLocation) {
    let iFold = path.join(baseFolder, itemModelFiles);
    let btpath = 'block/';
    let template;
    if (iscustomtemplate) { template = customModModelTemplateID+':'; } else { baseModID+':'; }
    smStair(path.join(fLocation, bName+'_stair.json'), template, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, btpath, column);
    smStairInner(path.join(fLocation, bName+'_stair_inner.json'), template, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, btpath, column);
    smStairOuter(path.join(fLocation, bName+'_stair_outer.json'), template, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, btpath, column);
    strItems(iFold, iscustomLocation, bName);
}
function smStair(file, templateMod, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, bPath, column) {
    if (tag4 != 'bob') { 
        if (column) {
            parent = templateMod+customStairsColumn;
        } else {
            parent = templateMod+customStairs;
        }
    } else { parent = templateMod+templateStair; }
    strmTextureAid(file, texture1, texture2, texture3, tag1, tag2, tag3, tag4, tag5, bPath, parent, column);
}
function smStairInner(file, templateMod, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, bPath, column) {
    let parent;
    if (tag4 != 'bob') { 
        if (column) {
            parent = templateMod+customInnerStairColumn;
        } else {
            parent = templateMod+customInnerStair;
        }
    } else { parent = templateMod+templateInnerStair; }
    strmTextureAid(file, texture1, texture2, texture3, tag1, tag2, tag3, tag4, tag5, bPath, parent, column);
}
function smStairOuter(file, templateMod, tag1, tag2, tag3, tag4, tag5, texture1, texture2, texture3, bPath, column) {
    let parent;
    if (tag4 != 'bob') { 
        if (column) {
            parent = templateMod+customouterStairsColumn;
        } else {
            parent = templateMod+customouterStairs;
        }
    } else { parent = templateMod+templateOuterStair; }
    strmTextureAid(file, texture1, texture2, texture3, tag1, tag2, tag3, tag4, tag5, bPath, parent, column);
}
function strmTextureAid(file, texture1, texture2, texture3, tag1, tag2, tag3, tag4, tag5, bPath, parent, column) {
    fileOut(file, '{', true);
    fileOut(file, '\"parent\": \"'+parent+'\",', false)
    fileOut(file, '\"textures\": {', false);
    fileOut(file, '\"'+tag1+'\": \"'+textureModID+':'+bPath+texture1+'\",', false)
    fileOut(file, '\"'+tag2+'\": \"'+textureModID+':'+bPath+texture1+'\",', false)
    if (tag4 != 'bob') {
        fileOut(file, '\"'+tag3+'\": \"'+textureModID+':'+bPath+texture2+'\",', false)
        if (column) {
            fileOut(file, '\"'+tag4+'\": \"'+textureModID+':'+bPath+texture3+'\",', false)
            fileOut(file, '\"'+tag5+'\": \"'+textureModID+':'+bPath+texture1+'\"\n}\n}', false)
        } else {
            fileOut(file, '\"'+tag4+'\": \"'+textureModID+':'+bPath+texture1+'\"\n}\n}', false)
        }
    } else { fileOut(file, '\"'+tag3+'\": \"'+textureModID+':'+bPath+texture3+'\"\n}\n}', false) }
}
function strItems(folder, iscustomLocation, bName) {
    let modelLocation;
    if (iscustomLocation) { modelLocation = stairModelFiles; } else { modelLocation = baseModelFiles; }
    itemAid(path.join(folder, bName+'_stair.json'), modelLocation, 'stair', bName)
}
function lootTable(){
    let fold = path.join(baseFolder, lootTableFiles);
    fs.mkdirSync(fold, { recursive: true })
    if (useWoodCycle) {
        ltAid(blockName+'_wood', fold)
        ltAid(blockName+'_log', fold)
        ltAid('stripped_'+blockName+'_wood', fold)
        ltAid('stripped_'+blockName+'_log', fold)
    } else { ltAid(blockName, fold); }
}
function ltAid(bName, fold){
    ltgenAid(path.join(fold, bName+'_fence.json'), bName+'_fence', false);
    ltgenAid(path.join(fold, bName+'_fence_gate.json'), bName+'_fence_gate', false);
    ltgenAid(path.join(fold, bName+'_wall.json'), bName+'_wall', false);
    ltgenAid(path.join(fold, bName+'_stair.json'), bName+'_stair', false);
    ltgenAid(path.join(fold, bName+'_slab.json'), bName+'_slab', true);
}
function ltgenAid(file, block, isSlab) {
    fileOut(file, '{', true);
    fileOut(file, '\"type\": \"minecraft:block\",', false);
    fileOut(file, '\"pools\": [\n{', false);
    fileOut(file, '\"rolls\": 1.0,', false);
    fileOut(file, '\"bonus_rolls\": 0.0,', false);
    fileOut(file, '\"entries\": [\n{', false);
    fileOut(file, '\"type\": \"minecraft:item\",', false);
    // slab split
    if (isSlab) {
        fileOut(file, '\"functions\": [\n{', false);
        fileOut(file, '\"function\": \"minecraft:set_count\",', false);
        fileOut(file, '\"conditions\": [\n{', false);
        fileOut(file, '\"condition\": \"minecraft:block_state_property\",', false);
        fileOut(file, '\"block\": \"'+textureModID+':'+block+'\",', false);
        fileOut(file, '\"properties\": {', false);
        fileOut(file, '\"type\": \"double\"\n}\n}\n],', false);
        fileOut(file, '\"count\": 2.0,', false);
        fileOut(file, '\"add\": false\n},\n{', false);
        fileOut(file, '\"function\": \"minecraft:explosion_decay\"\n}\n],', false);
        fileOut(file, '\"name\": \"'+textureModID+':'+block+'\"\n}\n]\n}\n]\n}', false);
    } else {
        fileOut(file, '\"name\": \"'+textureModID+':'+block+'\"\n}\n],', false);
        fileOut(file, '\"conditions\": [\n{', false);
        fileOut(file, '\"condition\": \"minecraft:survives_explosion\"\n}\n]\n\}\n]\n}', false);
    }
}