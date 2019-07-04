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

class Feedback : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


        val feedback= view.findViewById(R.id.home) as WebView
        feedback.loadUrl("https://www.ethiopianairlines.com")

        val webSettings =  feedback.getSettings()
        webSettings.setJavaScriptEnabled(true)

        feedback.setWebViewClient(WebViewClient())

        return view
    }
}