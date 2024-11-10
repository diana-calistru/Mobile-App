package com.example.crochetpatternsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crochetpatternsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize RecyclerView
        val recyclerview = binding.recyclerview
        recyclerview.layoutManager = GridLayoutManager(this, 3)

        // Populate data for RecyclerView
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_shared_24, "Item $i"))
        }

        // Set up adapter
        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter

        // FAB click listener
        binding.addFab.setOnClickListener {
            val intent = Intent(this, AddPatternActivity::class.java)
            startActivity(intent)
        }

        // Set up BottomNavigationView listener
        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_patterns -> {
                    // Handle home button click
                    // You can navigate to another activity or update UI here
                    true
                }
                R.id.nav_current_project -> {
                    // Handle search button click
                    // You can open search activity or show a search UI
                    true
                }
                R.id.nav_settings -> {
                    // Handle profile button click
                    // Navigate to profile activity or show profile UI
                    true
                }
                else -> false
            }
        }
    }
}
