package com.example.cwp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cwp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Connect the bottom navigation view with the navigation controller
        binding.FrLoginBtn.setOnClickListener {
            navController.navigate(R.id.loginFragment) // Replace with your fragment ID
        }

        binding.FrRegisterBtn.setOnClickListener {
            navController.navigate(R.id.registerFragment) // Replace with your fragment ID
        }
    }
}
