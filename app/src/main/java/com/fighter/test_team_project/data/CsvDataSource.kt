package com.fighter.test_team_project.data

import android.content.Context
import android.util.Log
import com.fighter.test_team_project.utils.Constants
import com.fighter.test_team_project.utils.CsvParser
import com.fighter.test_team_project.utils.RecipeDatasource
import com.opencsv.CSVReaderBuilder
import java.io.BufferedReader
import java.io.InputStreamReader

class CsvDataSource(private val parser: CsvParser) : RecipeDatasource {

    override fun getAllRecipes(context: Context): List<Recipe> {
        val recipeList = mutableListOf<Recipe>()
        context.apply {
            val inputStream = assets.open(Constants.FILE_NAME)
            val inputStreamReader = InputStreamReader(inputStream)

            val csvReader = CSVReaderBuilder(inputStreamReader)
                .withSkipLines(1) // Skip the first row if it contains headers
                .build()

//           var row = csvReader.readNext().forEach { Log.e("Recipe" , it) }
//            while (csvReader.readNext() != null){
//                recipeList.add(parser.parseLine())
//            }

            var row = "LL,LL,5,LL,LL,6,LL,LL,LL"
            while (csvReader.readNext().also { row = it.joinToString { ", " }}  != null){
                Log.e("Recipe" , row)
                recipeList.add(parser.parseLine(row))
            }

            return recipeList
        }


    }
}