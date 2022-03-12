package com.tegarpenemuan.challengechapter2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tegarpenemuan.challengechapter2.databinding.ActivityMainBinding
import com.tegarpenemuan.challengechapter2.gojek.GojekActivity
import com.tegarpenemuan.challengechapter2.shopee.ShopeeActivity
import com.tegarpenemuan.challengechapter2.tokopedia.TokopediaActivity


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGojek.setOnClickListener {
            val intent = Intent(this, GojekActivity::class.java)
            startActivity(intent)
        }

        binding.btnShopee.setOnClickListener {
            val intent = Intent(this, ShopeeActivity::class.java)
            startActivity(intent)
        }

        binding.btnTokopedia.setOnClickListener {
            val intent = Intent(this, TokopediaActivity::class.java)
            startActivity(intent)
        }
    }
}