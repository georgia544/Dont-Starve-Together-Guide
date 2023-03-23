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
        ),
    )
}