package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_launcher.*

class launcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        Glide.with(this).load("https://raw.githubusercontent.com/bumptech/glide/master/static/glide_logo.png").into(launcherimage)
    }
}
