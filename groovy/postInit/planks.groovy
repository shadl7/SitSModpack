import mods.pyrotech.chopping_block as chop

def recipe(String mod, String woodLog, int metaLog, String planks, int metaPlanks, String existingRecipe) {
    if (existingRecipe != null) {
	    crafting.remove(existingRecipe)
    }
    mods.pyrotech.chopping_block.recipeBuilder()
        .input(item("${mod}:${woodLog}", metaLog))
        .output(item("${mod}:${planks}", metaPlanks))
        .chops(4, 1)
        .chops(3, 1)
        .chops(2, 1)
        .chops(1, 1)
        .name("${woodLog}_${metaLog}")
        .register()
}

recipe('atum', 'palm_log', 0, 'palm_planks', 0, 'atum:palm_planks')
recipe('atum', 'deadwood_log', 0, 'deadwood_planks', 0, 'atum:deadwood_planks')
recipe('minecraft', 'log', 0, 'planks', 0, null)
recipe('minecraft', 'log', 1, 'planks', 1, null)
recipe('minecraft', 'log', 2, 'planks', 2, null)
recipe('minecraft', 'log', 3, 'planks', 3, null)
recipe('minecraft', 'log2', 0, 'planks', 4, null)
recipe('minecraft', 'log2', 1, 'planks', 5, null)
