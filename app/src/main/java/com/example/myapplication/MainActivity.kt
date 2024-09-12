package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.library.Feature1
import com.example.library.Feature2
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var feature1: Feature1

    @Inject
    lateinit var feature2: Feature2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        DaggerAppComponent.create().appMergeComponentFactory().create().apply {
//            feature1().run()
//            feature2().run()
//        }
        DaggerAppComponent.create().apply {
            inject(this@MainActivity)
            dependency1().run()
            dependency2().run()
        }

        feature1.run()
        feature2.run()

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}