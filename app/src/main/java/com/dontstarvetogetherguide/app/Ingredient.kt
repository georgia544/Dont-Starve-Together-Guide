package com.dontstarvetogetherguide.app

class Ingredient(
    id: String,
    name: String, stats: Stats, perishTimeDays: Float?, imageID: Int,
    val type: List<IngredientType>, special: String? = null
) : Food(id, name, stats, perishTimeDays, imageID, special)


sealed class IngredientType(val value: Float?) {
    object None:IngredientType(null)
    class Meat(value: Float) : IngredientType(value)
    class Vegetable(value: Float) : IngredientType(value)
    class Fruit(value: Float) : IngredientType(value)
    class Fish(value: Float) : IngredientType(value)
    class Egg(value: Float) : IngredientType(value)
    class Sweetener(value: Float) : IngredientType(value)
    class Dairy(value: Float) : IngredientType(value)
    class Monster(value: Float) : IngredientType(value)
}

