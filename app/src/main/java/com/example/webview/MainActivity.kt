package com.example.webview

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.webkit.*
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebView
import android.webkit.WebViewClient



class MainActivity : AppCompatActivity() {

    var browser: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView.settings.javaScriptEnabled = true
        // Definimos el webView
        browser = findViewById(R.id.webView) as WebView

        browser?.setWebViewClient(object : WebViewClient() {

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return true
            }
        })
        // Cargamos la web
        browser?.loadUrl(getString(R.string.url_conection))
    }

 }





