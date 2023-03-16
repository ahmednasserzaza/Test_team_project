package com.fighter.test_team_project.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fighter.test_team_project.data.CsvDataSource
import com.fighter.test_team_project.databinding.ActivityMainBinding
import com.fighter.test_team_project.utils.CsvParser
import com.fighter.test_team_project.utils.RecipeDatasource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var parser: CsvParser
    private lateinit var datasource: RecipeDatasource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()
        binding.tvShow.text = datasource.getAllRecipes()[0].recipeName
    }

    private fun setup() {
        parser = CsvParser()
        datasource = CsvDataSource(this, parser)
    }

}