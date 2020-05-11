package com.pinterest.jetifiertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.facebook.login.LoginManager
import net.quikkly.android.ui.RenderTagView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LoginManager.getInstance()
        val pincodeRenderView: RenderTagView = findViewById(R.id.render_tag_view)
        pincodeRenderView.visibility = View.VISIBLE
    }
}
