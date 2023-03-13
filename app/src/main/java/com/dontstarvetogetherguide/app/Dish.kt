package com.dontstarvetogetherguide.app

class Dish(
    name: String,
    stats: Stats,
    perishTime: Float,
    val dishType: DishType,
    imageID: Int,
    val isMonster: Boolean = false,
    special: String? = null
) :
    Food(name, stats, perishTime, imageID, special)

enum class DishType {
    MEAT,
    VEGETABLE,
}
