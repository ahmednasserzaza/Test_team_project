package com.fighter.test_team_project.data

data class Recipe(
    val recipeName:String,
    val ingredients:String,
    val totalTime:Int,
    val cuisine:String,
    val instructions:String,
    val url:String? = null,
    val cleanedIngredients:String,
    val imageUrl:String? = null,
    val ingredientsCount:Int
)
