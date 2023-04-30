package com.dontstarvetogetherguide.app

object IngredientsMeatProvider {

    fun get() = listOf(
        Ingredient(
            id = meatId,
            name = "Мясо",
            stats = Stats(1f, 25f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.meat,
            type = listOf(IngredientType.Meat(1f))
        ),
        Ingredient(
            id = meatCookedId,
            name = "Приготовленное мясо",
            stats = Stats(3f, 25f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.meat_cooked,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = jerkyId,
            name = "Вяленое мясо",
            stats = Stats(20f, 25f, 15f),
            perishTimeDays  = 20f,
            imageID = R.drawable.jerky,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = monsterMeatId,
            name = "Мясо монстра",
            stats = Stats(-20f, 18.75f, -15f),
            perishTimeDays  = 6f,
            imageID = R.drawable.monster_meat,
            type = listOf(IngredientType.Meat(1f),IngredientType.Monster(1f))
        ),Ingredient(
            id = monsterMeatCookedId,
            name = "Приготовленное мясо монстра",
            stats = Stats(-3f, 18.75f, -10f),
            perishTimeDays  = 15f,
            imageID = R.drawable.monster_meat_cooked,
            type = listOf(IngredientType.Meat(1f),IngredientType.Monster(1f))
        ),Ingredient(
            id = jerkyMonsterId,
            name = "Вяленое мясо монстра",
            stats = Stats(-3f, 18.75f, -5f),
            perishTimeDays  = 20f,
            imageID = R.drawable.jerky_monster,
            type = listOf(IngredientType.Meat(1f),IngredientType.Monster(1f))
        ),Ingredient(
            id = morselMeatId,
            name = "Кусочек мяса",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.morsel_meat,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = morselMeatCookedId,
            name = "Приготовленный кусочек мяса",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.morsel_meat_cooked,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = drumstickId,
            name = "Окорочок",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.drumstick,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = drumstickFriedId,
            name = "Жареный окорочок",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.drumstick_fried,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = fishId,
            name = "Рыба",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.fish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = morselFishCookedId,
            name = "Приготовленная рыба",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.morsel_fish_cooked,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = frogLegsId,
            name = "Лягушачьи лапки",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.frog_legs,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = frogLegsCookedId,
            name = "Приготовленные лягушачьи лапки",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.frog_legs_cooked,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = batiliskWingId,
            name = "Крыло мышелиска",
            stats = Stats(3f, 12.5f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.batilisk_wing,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = batiliskWingCookedId,
            name = "Приготовленное крыло мышелиска",
            stats = Stats(8f, 18.75f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.batilisk_wing_cooked,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = eelId,
            name = "Угорь",
            stats = Stats(3f, 10f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.eel,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(1.0f))
        ),Ingredient(
            id = eelCookedId,
            name = "Приготовленный угорь",
            stats = Stats(8f, 12.5f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.eel_cooked,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(1.0f))
        ),Ingredient(
            id = koalefantTrunkId,
            name = "Хобот коалослона",
            stats = Stats(30f, 37.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.koalefant_trunk,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = koalefantTrunkCookedId,
            name = "Стейк из хобота коалослона",
            stats = Stats(40f, 75f, 0f),
            perishTimeDays  = 15f,
            imageID = R.drawable.koalifant_trunk_cooked,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = winterKoalefantTrunkId,
            name = "Хобот зимнего коалослона",
            stats = Stats(30f, 37.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.winter_koalefant_tunk,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = leafyMeatId,
            name = "Лиственное мясо",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 6f,
            imageID = R.drawable.leafy_meat,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = leafyMeatCookedId,
            name = "Приготовленное лиственное мясо",
            stats = Stats(1f, 18.75f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.leafy_meat_cooked,
            type = listOf(IngredientType.Meat(1f))
        ),Ingredient(
            id = guardiansHornId,
            name = "Рог стража",
            stats = Stats(60f, 75f, -15f),
            perishTimeDays  = null,
            imageID = R.drawable.guardians_horn,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = deerclopsEyeballId,
            name = "Глаз циклопа-оленя",
            stats = Stats(60f, 75f, -15f),
            perishTimeDays  = null,
            imageID = R.drawable.deerclops_eyeball,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = barnaclesId,
            name = "Морские жёлуди",
            stats = Stats(0f, 12.5f, -5f),
            perishTimeDays  = 6f,
            imageID = R.drawable.barnacles,
            type = listOf(IngredientType.Meat(0.25f),IngredientType.Fish(0.25f))
        ),Ingredient(
            id = barnaclesCookedId,
            name = "Приготовленные морские жёлуди",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 15f,
            imageID = R.drawable.barnacles_cooked,
            type = listOf(IngredientType.Meat(0.25f),IngredientType.Fish(0.25f))
        ),Ingredient(
            id = fishRawId,
            name = "Сырая рыба",
            stats = Stats(1f, 25f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.fish_raw,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = fishSteakCookedId,
            name = "Рыбный стейк",
            stats = Stats(20f, 25f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.fish_steak_cooked,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = mudfishId,
            name = "Грязевая рыба",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.mudfish,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = deepBassId,
            name = "Глубоководный окунь",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.deep_bass,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = dandyLionfishId,
            name = "Львиная крылатка",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.dandy_lionfish,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = blackCatfishId,
            name = "Чёрный сом",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.black_catfish,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = dappledKoiId,
            name = "Пятнистый Кои",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.dappled_koi,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = goldenKoiId,
            name = "Золотой Кои",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.golden_koi,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = deepBassId,
            name = "Глубоководный окунь",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.runty_gruppy,
            type = listOf(IngredientType.Meat(1f),IngredientType.Fish(1f))
        ),Ingredient(
            id = wobsterId,
            name = "Вобстер",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.wobster,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = wobsterCookedId,
            name = "Вкусный вобстер",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 6f,
            imageID = R.drawable.wobster_cooked,
            type = listOf(IngredientType.None)
        ),Ingredient(
            id = morselFishId,
            name = "Кусочек рыбы",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 3f,
            imageID = R.drawable.morsel_fish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = runtyGruppyId,
            name = "Маленькая гуппи",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.runty_gruppy,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = bittyBaitfishId,
            name = "Рыбка-наживка",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.bitty_baitfish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = smoltFryId,
            name = "Мелкая рыбёшка",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.smolt_fry,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = nostrilsNakedId,
            name = "Голые ноздри",
            stats = Stats(0f, 12.5f, -5f),
            perishTimeDays  = 6f,
            imageID = R.drawable.nostrils_naked,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = nostrilsCharredId,
            name = "Обгоревшие ноздри",
            stats = Stats(0f, 18.75f, 0f),
            perishTimeDays  = 10f,
            imageID = R.drawable.nostrils_charred,
            type = listOf(IngredientType.Meat(0.5f))
        ),Ingredient(
            id = scorchingSunfishId,
            name = "Знойная рыба-солнце",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.scorching_sunfish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = bloomfinTunaId,
            name = "Цветущий тунец",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 1f,
            imageID = R.drawable.bloomfin_tuna,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = spittlefishId,
            name = "Рыба-поплевок",
            stats = Stats(1f, 12.5f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.spittlefish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = fallounderId,
            name = "Осенняя камбала",
            stats = Stats(0f, 12.5f, -10f),
            perishTimeDays  = 1f,
            imageID = R.drawable.fallounder,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = sweetishFishId,
            name = "Сладковатая рыба",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.sweetish_fish,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = iceBreamId,
            name = "Морозный лещ",
            stats = Stats(8f, 25f, 0f),
            perishTimeDays  = 1f,
            imageID = R.drawable.ice_bream,
            type = listOf(IngredientType.Meat(0.5f),IngredientType.Fish(0.5f))
        ),Ingredient(
            id = jerkySmallId,
            name = "Вяленый кусочек мяса",
            stats = Stats(8f, 12.5f, +10f),
            perishTimeDays  = 20f,
            imageID = R.drawable.jerky_small,
            type = listOf(IngredientType.Meat(0.5f))
        )
    )
}