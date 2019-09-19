package com.ninetaildemonfox.zdl.kotilnday9_17

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        jumpToMain()
    }

    fun jumpToMain() {
        val alphaAnimation = AlphaAnimation(0.1f, 1f)
        alphaAnimation.duration = 3000
        alphaAnimation.fillAfter = true
        cl_layout!!.startAnimation(alphaAnimation)
        alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@SplashActivity, Main2Activity::class.java))
                finish()
            }

            override fun onAnimationStart(animation: Animation?) {
            }
        })
    }
}
