package com.fighter.test_team_project.utils

import android.content.Context
import com.fighter.test_team_project.data.Recipe

interface RecipeDatasource {

    fun getAllRecipes(context: Context): List<Recipe>
}