crafting.shapedBuilder()
    .name('portalcore')
	.output(item('sitscore:portalcore'))
	.matrix('IBI',
            'BHB',
            'IBI')
	.key('I', ore('plateIron'))
	.key('B', item('pyrotech:material', 23))
	.key('H', item('sitscore:portalblock'))
	.register()

crafting.shapedBuilder()
    .name('portalhandler')
	.output(item('sitscore:portalblock') * 2)
	.matrix('III',
            'IBI',
            'III')
	.key('I', ore('plateIron'))
	.key('B', item('pyrotech:material', 23))
	.register()

crafting.shapedBuilder()
    .name('activator_empty')
	.output(item('sitscore:emptyactivator'))
	.matrix('LSP',
            'SSP',
            'CCC')
	.key('C', ore('cobblestone'))
	.key('P', ore('plankWood'))
	.key('S', item('atum:scroll'))
	.key('L', item('minecraft:slime_ball'))
	.register()

crafting.shapedBuilder()
    .name('activator_nether')
	.output(item('sitscore:netheractivator'))
	.matrix('NNN',
            'NAN',
            'NNN')
	.key('A', item('sitscore:emptyactivator'))
	.key('N', item('minecraft:netherrack'))
	.register()
