package com.example.ethiopianapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
class Home:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


        val home = view.findViewById(R.id.home) as WebView
        home.loadUrl("https://www.ethiopianairlines.com")

        val webSettings = home.getSettings()
        webSettings.setJavaScriptEnabled(true)

        home.setWebViewClient(WebViewClient())

        return view
    }
}

