package info.fekri.unscrambleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.fekri.unscrambleapp.databinding.ActivityMainBinding

/**
 * Creates an Activity that hosts the Game fragment in the app
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}