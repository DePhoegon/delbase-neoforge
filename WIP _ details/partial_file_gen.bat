@echo off
REM node delbase_json_aid.js [baseblock] [type] [custom/builtin 0/1] [use custom Location 0/1]
REM 0 = block name
REM 1 = type_name - 0 for none
REM 2 = Template usage = 0 for Built in, 1 for Custom
REM 3 = Custom Location usage = 0 for Normal, 1 for Custom Location
REM 4 = Texture Count 1-3
REM 5 = Mod ID, 0 - Minecraft, 1 - Bridge Mod, 2 left ModID (delbase), 3 right ModID (configured - bop)
REM 6 = TextureName1 // Top
REM 7 = TextureName2 // Side
REM 8 = TextureName3 // Inside side (columns only, stairs use) unused mostly except for woodtypes, refactor needed to open it up to more blocks
REM if 1 texture count, then TextureName2 and TextureName3 are copies of TextureName1
REM if 2 texture count, then TextureName3 is a copy of TextureName1
REM number of textures should match number used

node .\delbase_json_aid.js raw_exposed copper 1 1 1 2 raw_exposed_block
node .\delbase_json_aid.js raw_weathered copper 1 1 1 2 raw_weathered_block
node .\delbase_json_aid.js raw_oxidized copper 1 1 1 2 raw_oxidized_block
node .\delbase_json_aid.js raw_waxed copper 1 1 1 2 raw_waxed_block
node .\delbase_json_aid.js raw_waxed_exposed copper 1 1 1 2 raw_waxed_exposed_block
node .\delbase_json_aid.js raw_waxed_weathered copper 1 1 1 2 raw_waxed_weathered_block
node .\delbase_json_aid.js raw_waxed_oxidized copper 1 1 1 2 raw_waxed_oxidized_block
node .\delbase_json_aid.js waxed copper 1 1 1 2 waxed_copper_block
node .\delbase_json_aid.js waxed_exposed copper 1 1 1 2 waxed_exposed_copper_block
node .\delbase_json_aid.js waxed_weathered copper 1 1 1 2 waxed_weathered_copper_block
node .\delbase_json_aid.js waxed_oxidized copper 1 1 1 2 waxed_oxidized_copper_block
node .\delbase_json_aid.js chiseled copper 1 1 1 2 chiseled_copper_block
node .\delbase_json_aid.js chiseled_exposed copper 1 1 1 2 chiseled_exposed_copper_block
node .\delbase_json_aid.js chiseled_weathered copper 1 1 1 2 chiseled_weathered_copper_block
node .\delbase_json_aid.js chiseled_oxidized copper 1 1 1 2 chiseled_oxidized_copper_block
node .\delbase_json_aid.js chiseled_waxed copper 1 1 1 2 chiseled_waxed_copper_block
node .\delbase_json_aid.js chiseled_waxed_exposed copper 1 1 1 2 chiseled_waxed_exposed_copper_block
node .\delbase_json_aid.js chiseled_waxed_weathered copper 1 1 1 2 chiseled_waxed_weathered_copper_block
node .\delbase_json_aid.js chiseled_waxed_oxidized copper 1 1 1 2 chiseled_waxed_oxidized_copper_block
node .\delbase_json_aid.js copper_bulb 0 1 1 1 2 copper_bulb_block
node .\delbase_json_aid.js exposed_copper_bulb 0 1 1 1 2 exposed_copper_bulb_block
node .\delbase_json_aid.js weathered_copper_bulb 0 1 1 1 2 weathered_copper_bulb_block
node .\delbase_json_aid.js oxidized_copper_bulb 0 1 1 1 2 oxidized_copper_bulb_block
node .\delbase_json_aid.js waxed_copper_bulb 0 1 1 1 2 waxed_copper_bulb_block
node .\delbase_json_aid.js waxed_exposed_copper_bulb 0 1 1 1 2 waxed_exposed_copper_bulb_block
node .\delbase_json_aid.js waxed_weathered_copper_bulb 0 1 1 1 2 waxed_weathered_copper_bulb_block
node .\delbase_json_aid.js waxed_oxidized_copper_bulb 0 1 1 1 2 waxed_oxidized_copper_bulb_block
node .\delbase_json_aid.js cut copper 1 1 1 2 cut_copper_block
node .\delbase_json_aid.js cut_exposed copper 1 1 1 2 cut_exposed_copper_block
node .\delbase_json_aid.js cut_weathered copper 1 1 1 2 cut_weathered_copper_block
node .\delbase_json_aid.js cut_oxidized copper 1 1 1 2 cut_oxidized_copper_block
node .\delbase_json_aid.js cut_waxed copper 1 1 1 2 cut_waxed_copper_block
node .\delbase_json_aid.js cut_waxed_exposed copper 1 1 1 2 cut_waxed_exposed_copper_block
node .\delbase_json_aid.js cut_waxed_weathered copper 1 1 1 2 cut_waxed_weathered_copper_block
node .\delbase_json_aid.js cut_waxed_oxidized copper 1 1 1 2 cut_waxed_oxidized_copper_block
node .\delbase_json_aid.js chiseled_tuff 0 1 1 2 2 chiseled_tuff_top chiseled_tuff
node .\delbase_json_aid.js chiseled_tuff_bricks 0 1 1 2 2 chiseled_tuff_bricks_top chiseled_tuff_bricks
node .\delbase_json_aid.js exposed copper 1 1 1 2 exposed_copper_block
node .\delbase_json_aid.js chiseled_waxed copper 1 1 1 2 chiseled_waxed_exposed_copper_block