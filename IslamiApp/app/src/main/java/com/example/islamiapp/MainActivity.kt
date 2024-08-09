package com.example.islamiapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiapp.Home.Hadeeth.HadeethFragment
import com.example.islamiapp.Home.Quran.ChaptersAdapter
import com.example.islamiapp.Home.Quran.QuranFragment
import com.example.islamiapp.Home.Radio.RadioFragment
import com.example.islamiapp.Home.Sebha.SebhaFragment
import com.example.islamiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainBottomNavBar.selectedItemId= R.id.mi_quran
        pushFragment(QuranFragment())

        binding.mainBottomNavBar.setOnNavigationItemSelectedListener {
            val fragment:Fragment=  when(it.itemId)
            {
                R.id.mi_quran -> QuranFragment()

                R.id.mi_sebha -> SebhaFragment()
                R.id.mi_radio -> RadioFragment()
                R.id.mi_hadeeth -> HadeethFragment()
                else -> QuranFragment()
            }
            pushFragment(fragment)
            true
        }


    }

    private fun pushFragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.fl_fragment,fragment).commit()
    }
}