crafting.remove('tconstruct:tools/pattern')
crafting.shapedBuilder()
    .name('pattern')
	.output(item('tconstruct:pattern') * 2)
	.matrix('PS',
            'SP')
	.key('P', ore('plankWood'))
	.key('S', ore('stickWood'))
	.register()

crafting.remove('tconstruct:tools/table/tool_station')
crafting.shapedBuilder()
    .name('toolstation')
	.output(item('tconstruct:tooltables', 3))
	.matrix('P',
            'W')
	.key('P', item('tconstruct:pattern'))
	.key('W', item('pyrotech:worktable'))
	.register()

crafting.remove('tconstruct:smeltery/smeltery_controller')
crafting.shapedBuilder()
    .name('smcontroller')
	.output(item('tconstruct:smeltery_controller'))
	.matrix('BBB',
            'BIB',
			'BBB')
	.key('I', ore('ingotIron'))
	.key('B', item('tconstruct:materials'))
	.register()
