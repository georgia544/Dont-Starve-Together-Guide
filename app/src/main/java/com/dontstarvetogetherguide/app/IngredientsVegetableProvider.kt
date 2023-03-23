package com.dontstarvetogetherguide.app

object IngredientsVegetableProvider {

    fun get() = listOf(
        Ingredient(
            id = cornId,
            name = "Кукуруза",
            stats = Stats(3f, 25f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.corn,
            type = listOf(IngredientType.Vegetable(1f))
        ),
        Ingredient(
            id = popcornId,
            name = "Попкорн",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 15f,
            imageID = R.drawable.popcorn,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = carrotId,
            name = "Морковь",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.carrot,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = carrotRoastedId,
            name = "Жареная Морковь",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.carrot_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = pumpkinId,
            name = "Тыква",
            stats = Stats(3f, 37.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.pumpkin,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = pumpkinHotId,
            name = "Печёная тыква",
            stats = Stats(8f, 37.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.pumpkin_hot,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = eggplantId,
            name = "Баклажан",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.eggplant,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = eggplantBraisedId,
            name = "Тушёный баклажан",
            stats = Stats(20f, 25f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.eggplant_braised,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = redCapId,
            name = "Красный Гриб",
            stats = Stats(-20f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.red_cap,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = redCapCookedId,
            name = "Приготовленный Красный Гриб",
            stats = Stats(1f, 25f, -10f),
            perishTimeDays  = 10f,
            imageID = R.drawable.red_cap_cooked,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = greenCapId,
            name = "Зелёный Гриб",
            stats = Stats(0f, 12.5f, -50f),
            perishTimeDays  = 10f,
            imageID = R.drawable.green_cap,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = greenCapCookedId,
            name = "Приготовленный зелёный гриб",
            stats = Stats(-1f, 0f, 15f),
            perishTimeDays  = 10f,
            imageID = R.drawable.green_cap_cooked,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = blueCapId,
            name = "Синий Гриб",
            stats = Stats(20f, 12.5f, -15f),
            perishTimeDays  = 10f,
            imageID = R.drawable.blue_cap,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = blueCapCookedId,
            name = "Приготовленный синий гриб",
            stats = Stats(-3f, 0f, 10f),
            perishTimeDays  = 10f,
            imageID = R.drawable.blue_cap_cooked,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = mandrakeId,
            name = "Мандрагора",
            stats = Stats(60f, 75f, 0f),
            perishTimeDays  = null,
            imageID = R.drawable.mandrake,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = mandrakeCookedId,
            name = "Приготовленная мандрагора",
            stats = Stats(100f, 150f, 0f),
            perishTimeDays  = null,
            imageID = R.drawable.mandrake_cooked,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = petalsId,
            name = "Лепестки",
            stats = Stats(1f, 0f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.petals,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = darkPetalsId,
            name = "Тёмные лепестки",
            stats = Stats(0f, 0f, -5f),
            perishTimeDays  = 6f,
            imageID = R.drawable.dark_petals,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = lichenId,
            name = "Лишайник",
            stats = Stats(3f, 12.5f, -5f),
            perishTimeDays  = 2f,
            imageID = R.drawable.lichen,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = glowBerryId,
            name = "Светящаяся ягода",
            stats = Stats(11f, 25f, -10f),
            perishTimeDays  = 10f,
            imageID = R.drawable.glow_berry,
            type = listOf(IngredientType.Fruit(1f))
        ),Ingredient(
            id = foliageId,
            name = "Листва",
            stats = Stats(1f, 0f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.foliage,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = cactusFleshId,
            name = "Мякоть кактуса",
            stats = Stats(-3f, 12.5f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.cactus_flesh,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = cactusFleshCookedId,
            name = "Приготовленная мякоть кактуса",
            stats = Stats(1f, 12.5f, 15f),
            perishTimeDays  = 10f,
            imageID = R.drawable.cactus_flesh_cooked,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = cactusFlowerId,
            name = "Цветок кактуса",
            stats = Stats(8f, 12.5f, 5f),
            perishTimeDays  = 3f,
            imageID = R.drawable.cactus_flower,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = asparagusId,
            name = "Спаржа",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.asparagus,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = asparagusCookedId,
            name = "Приготовленная спаржа",
            stats = Stats(3f, 25f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.asparagus_cooked,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = tomatoId,
            name = "Томат",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.tomato,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = tomatoRoastedId,
            name = "Приготовленный томат",
            stats = Stats(20f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.tomato_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = potatoId,
            name = "Картофель",
            stats = Stats(-3f, 12.5f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.potato,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = potatoRoastedId,
            name = "Приготовленный Картофель",
            stats = Stats(20f, 25f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.potato_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = onionId,
            name = "Лук",
            stats = Stats(0f, 9.375f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.onion,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = onionRoastedId,
            name = "Приготовленный лук",
            stats = Stats(1f, 9.375f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.onion_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = garlicId,
            name = "Чеснок",
            stats = Stats(0f, 9.4f, -10f),
            perishTimeDays  = 15f,
            imageID = R.drawable.garlic,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = garlicRoastedId,
            name = "Приготовленный чеснок",
            stats = Stats(1f, 9.4f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.garlic_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = pepperId,
            name = "Перец",
            stats = Stats(-20f, 9.4f, -15f),
            perishTimeDays  = 15f,
            imageID = R.drawable.pepper,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = pepperRoastedId,
            name = "Приготовленный перец",
            stats = Stats(-3f, 9.4f, -10f),
            perishTimeDays  = 15f,
            imageID = R.drawable.pepper_roasted,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = kelpFrondsId,
            name = "Морская капуста",
            stats = Stats(-1f, 9.375f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.kelp_fronds,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = kelpFrondsCookedId,
            name = "Жареная мормкая капуста",
            stats = Stats(0f, 9.375f, -5f),
            perishTimeDays  = 10f,
            imageID = R.drawable.kelp_fronds_cooked,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = kelpFrondsDriedId,
            name = "Сушёная морская капуста",
            stats = Stats(1f, 9.375f, +10f),
            perishTimeDays  = 20f,
            imageID = R.drawable.kelp_fronds_dried,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = stoneFruitId,
            name = "Каменный фрукт",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.stone_fruit,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = stoneFruitCooked,
            name = "Приготовленный каменный фрукт",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.stone_fruit_cooked,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = cornCodId,
            name = "Кукурузная треска",
            stats = Stats(3f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.corn_cod,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = popperFishId,
            name = "Рыба-попкорн",
            stats = Stats(3f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.popperfish,
            type = listOf(IngredientType.Vegetable(1f))
        ),Ingredient(
            id = moonShroomId,
            name = "Лунный гриб",
            stats = Stats(0f, 12.5f, 10f),
            perishTimeDays  = 10f,
            imageID = R.drawable.moon_shroom,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = moonShroomCookedId,
            name = "Приготовленный лунный гриб",
            stats = Stats(0f, -12.5f, -10f),
            perishTimeDays  = 10f,
            imageID = R.drawable.moon_shroom_cooked,
            type = listOf(IngredientType.Vegetable(0.5f))
        ),Ingredient(
            id = tillweedId,
            name = "Сорняк",
            stats = Stats(1f, 0f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.tillweed,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = fireNettlesId,
            name = "Листья огненной крапивы",
            stats = Stats(-3f, 12.5f, -5f),
            perishTimeDays  = 3f,
            imageID = R.drawable.fire_nettles,
            type = listOf(IngredientType.None)
        )
    )

}