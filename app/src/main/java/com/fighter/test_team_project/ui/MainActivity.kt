package com.fighter.test_team_project.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fighter.test_team_project.R
import com.fighter.test_team_project.data.CsvDataSource
import com.fighter.test_team_project.utils.CsvParser
import com.fighter.test_team_project.utils.RecipeDatasource
import com.opencsv.CSVReaderBuilder
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private lateinit var parser: CsvParser
    private lateinit var datasource: RecipeDatasource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
        Log.d("Main_Activity" , "${datasource.getAllRecipes(this)}")


    }

    private fun setup() {
        parser = CsvParser()
        datasource = CsvDataSource(parser)
    }


}