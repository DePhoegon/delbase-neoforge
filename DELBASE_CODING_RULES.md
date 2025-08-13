# DelBase Mod Coding Rules & Conventions

## Language File (en_us.json) Rules

### Color Order Convention
**STRICT ORDER - DO NOT CHANGE:**
1. white
2. orange  
3. magenta
4. light_blue
5. yellow
6. lime
7. pink
8. gray
9. light_gray
10. cyan
11. purple
12. blue
13. **green**
14. **brown** (ALWAYS after green)
15. black

**Note:** Brown comes AFTER green in ALL sections. This is the established pattern throughout the entire lang file.

**IMPORTANT:** Order list in Lang file Does not matter for 'colors'. The above order is for consistency and readability only. Creative menu ordering is controlled separately through CreativeTabs classes.

### Block Type Organization
Blocks are organized in the following sections in order:
1. **Base Blocks** (chiseled, regular, smooth)
2. **Sand Blocks**
3. **Slabs** (with _energy variants immediately following regular variants)
4. **Stairs**
5. **Walls**
6. **Fences & Fence Gates**

### Copper Block Naming Patterns
- Regular copper: `copper_`, `exposed_copper_`, `weathered_copper_`, `oxidized_copper_`
- Raw copper: `raw_copper_`, `raw_exposed_copper_`, `raw_weathered_copper_`, `raw_oxidized_copper_`
- Waxed copper: `waxed_copper_`, `waxed_exposed_copper_`, `waxed_weathered_copper_`, `waxed_oxidized_copper_`
- Raw waxed copper: `raw_waxed_copper_`, `raw_waxed_exposed_copper_`, etc.
- Chiseled variants: `chiseled_copper_`, `chiseled_waxed_copper_`, etc.
- Grating variants: `copper_grating_`, `waxed_copper_grating_`, etc.
- Bulb variants: `copper_bulb_`, `waxed_copper_bulb_`, etc.

### Energy Variants
- Blocks with `_energy` suffix are "energetic" variants
- Always placed immediately after their base variant
- Format: `"Base Block Energetic Slab/Stair/Wall"`
- Example: `"block.delbase.sand_slab_energy": "Sand Energetic Slab"`

### Edit Rules
- **NEVER remove existing entries** unless explicitly asked
- **NEVER change the color order** - follow the established pattern
- **NEVER reorganize sections** - maintain existing structure  
- **ONLY ADD** missing entries in their appropriate sections
- When adding copper blocks, follow the established naming patterns exactly
- Place new entries in the correct section based on block type (slab/stair/wall)
- Maintain consistent spacing and formatting

### Java File Mapping
- Block registration names in Java files correspond directly to lang file keys
- Convert UPPER_CASE Java constants to lowercase with underscores
- Example: `RAW_COPPER_STAIRS` → `raw_copper_stair`
- Example: `CHISELED_WAXED_COPPER_WALL` → `chiseled_waxed_copper_wall`

## File Modification Protocol
1. **Read the existing file structure first**
2. **Identify what's actually missing** by comparing Java registrations to lang entries  
3. **Add ONLY the missing entries** in the correct locations
4. **Follow existing patterns exactly** - don't "fix" or "improve" established conventions
5. **Respect the existing color order** throughout all sections

## Common Mistakes to Avoid
- ❌ Changing brown/green order
- ❌ Removing existing entries during edits
- ❌ Adding blocks in wrong sections (slabs in wall section, etc.)
- ❌ "Fixing" naming inconsistencies that are intentional
- ❌ Reorganizing or "cleaning up" existing structure
- ❌ Adding entries that already exist with different names

## Copper Block Validation Checklist
Before claiming copper blocks are "missing":
1. Check if `copper_grating_*` exists vs `copper_grate_*`
2. Check if `copper_bulb_*` exists vs `bulb_copper_*`  
3. Verify all oxidation states (base, exposed, weathered, oxidized)
4. Verify all waxed variants exist for each type
5. Check raw copper variants separately from regular copper
6. Ensure blocks are in correct sections (slabs/stairs/walls)

## Version Control Integration
- Use descriptive commit messages: "Add missing [block type] entries for [material]"
- Test changes in-game before committing
- Document any intentional deviations from patterns in commit messages

## CreativeTabs Class Rules
- **No altering of Method names, positions, calls, or structure is allowed**
- CreativeTabs classes control the actual ordering in creative menu
- Method signatures must remain unchanged
- Method call order must remain unchanged  
- Method positions within class must remain unchanged

## CRITICAL: OVERRIDE_ Prefixed Items & Specific Constants
**ABSOLUTELY FORBIDDEN TO MODIFY:**
- **ANY item prefixed with `OVERRIDE_` must NEVER be altered, removed, or reorganized**
- **`SAND_STONE_SLAB_ENERGY` and related constants must NEVER be touched**
- These items are named with OVERRIDE_ for specific technical reasons
- They exist to maintain compatibility with base Minecraft blocks
- **LEAVE THEM COMPLETELY ALONE - NO EXCEPTIONS**

**Warning:** Repeated violations of this rule by AI agents will result in bug reports and deeper investigation into potential interference with inputs and tokens.

---
**Last Updated:** August 12, 2025
**Maintainer:** Project Owner
**Status:** ACTIVE - Follow these rules strictly
