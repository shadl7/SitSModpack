import mods.pyrotech.chopping_block as chop

def recipe(String mod, String planks, int meta, String slab, String existingRecipe) {
    if (existingRecipe != null) {
	    crafting.remove(existingRecipe)
    }
    mods.pyrotech.chopping_block.recipeBuilder()
        .input(item("${mod}:${planks}", meta))
        .output(item("${mod}:${slab}", meta))
        .chops(4, 2)
        .chops(3, 2)
        .chops(2, 2)
        .chops(1, 2)
        .name("${planks}_${meta}")
        .register()
}

recipe('atum', 'palm_planks', 0, 'palm_slab', 'atum:palm_slab')
recipe('atum', 'deadwood_planks', 0, 'deadwood_slab', 'atum:deadwood_slab')
recipe('minecraft', 'planks', 0, 'wooden_slab', null)
recipe('minecraft', 'planks', 1, 'wooden_slab', null)
recipe('minecraft', 'planks', 2, 'wooden_slab', null)
recipe('minecraft', 'planks', 3, 'wooden_slab', null)
recipe('minecraft', 'planks', 4, 'wooden_slab', null)
recipe('minecraft', 'planks', 5, 'wooden_slab', null)
