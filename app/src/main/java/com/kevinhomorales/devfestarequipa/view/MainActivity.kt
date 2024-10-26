package com.kevinhomorales.devfestarequipa.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.kevinhomorales.devfestarequipa.R
import com.kevinhomorales.devfestarequipa.helper.RetrofitHelper
import com.kevinhomorales.devfestarequipa.model.HeroResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val retrofit = RetrofitHelper.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getHeros()
    }

    private fun getHeros() {
        lifecycleScope.launch(Dispatchers.IO) {
            val response: Response<HeroResponse> = retrofit.getHeros("a")
            if (response.isSuccessful) {
                runOnUiThread {
                    Toast.makeText(this@MainActivity, "WORKS!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}