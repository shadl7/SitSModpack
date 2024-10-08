crafting.remove('atum:shrub_weed_to_stick')
crafting.shapelessBuilder()
    .name('plant_fiber_craft')
	.output(item('pyrotech:material', 12))
	.input(item('atum:weed'))
	.input(item('atum:weed'))
	.input(item('atum:weed'))
	.register()

crafting.shapelessBuilder()
    .name('bow_drill')
	.output(item('pyrotech:bow_drill'))
	.input(item('minecraft:stick'))
	.input(item('minecraft:stick'))
	.register()

crafting.remove('pyrotech:bucket/bucket_clay_unfired')
crafting.remove('pyrotech:bucket/bucket_wood')
furnace.removeByInput(item('pyrotech:bucket_clay_unfired'))
mods.pyrotech.kiln.removeByInput(item('pyrotech:bucket_clay_unfired'))
mods.pyrotech.stone_kiln.removeByInput(item('pyrotech:bucket_clay_unfired'))
mods.pyrotech.brick_kiln.removeByInput(item('pyrotech:bucket_clay_unfired'))

crafting.remove('atum:kiln')
crafting.remove('atum:limestone_furnace')

mods.pyrotech.anvil.recipeBuilder()
    .input(item('atum:limestone_cracked'))
    .output(item('pyrotech:material', 28))
    .hits(4)
    .typeHammer()
    .tierGranite()
    .name('crushed_limestone')
    .register()

mods.pyrotech.anvil.recipeBuilder()
    .input(item('atum:limestone_cracked'))
    .output(item('pyrotech:material', 28))
    .hits(4)
    .typeHammer()
    .tierIronclad()
    .name('crushed_limestone_iron')
    .register()

mods.pyrotech.anvil.recipeBuilder()
    .input(item('atum:limestone_cracked'))
    .output(item('pyrotech:material', 28))
    .hits(4)
    .typeHammer()
    .tierObsidian()
    .name('crushed_limestone_obsidian')
    .register()

crafting.remove('pyrotech:refractory_brick_unfired')
crafting.shapedBuilder()
    .name('refractory_brick')
	.output(item('pyrotech:material', 9) * 4)
	.matrix('CC')
	.key('C', item('pyrotech:material', 4))
	.register()

crafting.remove('pyrotech:tech/basic/worktable_stone')

mods.pyrotech.crude_drying_rack.recipeBuilder()
    .input(ore('plankWood'))
    .output(item('pyrotech:planks_tarred'))
    .dryTime(2400)
    .name('tarred_planks_crude')
    .register()

mods.pyrotech.drying_rack.recipeBuilder()
    .input(ore('plankWood'))
    .output(item('pyrotech:planks_tarred'))
    .dryTime(2400)
    .name('tarred_planks')
    .register()

mods.pyrotech.crude_drying_rack.recipeBuilder()
    .input(item('pyrotech:material', 20))
    .output(item('pyrotech:material', 23))
    .dryTime(2400)
    .name('tarred_board_crude')
    .register()

mods.pyrotech.drying_rack.recipeBuilder()
    .input(item('pyrotech:material', 20))
    .output(item('pyrotech:material', 23))
    .dryTime(2400)
    .name('tarred_board')
    .register()

mods.pyrotech.crude_drying_rack.recipeBuilder()
    .input(item('atum:emmer'))
    .output(item('pyrotech:material', 2))
    .dryTime(2400)
    .name('straw_crude')
    .register()

mods.pyrotech.drying_rack.recipeBuilder()
    .input(item('atum:emmer'))
    .output(item('pyrotech:material', 2))
    .dryTime(2400)
    .name('straw')
    .register()
