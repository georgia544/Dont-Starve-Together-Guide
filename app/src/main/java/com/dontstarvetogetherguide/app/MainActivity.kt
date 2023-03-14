package com.dontstarvetogetherguide.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.vplibs.colorimagebottomnav.BottomNavigationView
import com.vplibs.colorimagebottomnav.BottomNavigationView.OnClickedButtonListener
import com.vplibs.colorimagebottomnav.NavigationItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemRecipes = NavigationItem(this, R.drawable.kazan)
        val itemSeeds = NavigationItem(this, R.drawable.seeds)

        itemRecipes.text = "Рецепты"
        itemSeeds.text = "Семена"

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.addView(itemRecipes)
        bottomNavigationView.addView(itemSeeds)

        bottomNavigationView.setOnClickedButtonListener { button, position ->
            when (button.drawable) {
                R.drawable.kazan -> {
                    supportFragmentManager.commit {
                        replace<RecipesFragment>(R.id.container)
                    }
                    true
                }
                R.drawable.seeds -> {
                    supportFragmentManager.commit {
                        replace<SeedsFragment>(R.id.container)
                    }
                    true

                }
                else -> false
            }
        }
    }
}
