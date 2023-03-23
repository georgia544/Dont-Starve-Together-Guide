package com.dontstarvetogetherguide.app

abstract class Food(
    val id:String,
    val name: String,
    val stats: Stats,
    val perishTime: Float?,
    val imageID: Int,
    val special: String? = null
)