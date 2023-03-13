package com.dontstarvetogetherguide.app

class Ingredient(
    name: String, stats: Stats, perishTime: Float, imageID: Int,
    val type: List<IngredientType>, special: String? = null
) : Food(name, stats, perishTime, imageID, special)


sealed class IngredientType(val value: Float) {
    class Meat(value: Float) : IngredientType(value)
    class Vegetable(value: Float) : IngredientType(value)
    class Fruit(value: Float) : IngredientType(value)
    class Fish(value: Float) : IngredientType(value)
    class Egg(value: Float) : IngredientType(value)
    class Sweetener(value: Float) : IngredientType(value)
    class Dairy(value: Float) : IngredientType(value)
    class Monster(value: Float) : IngredientType(value)
}

