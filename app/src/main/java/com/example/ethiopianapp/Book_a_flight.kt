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

class Book_a_flight : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


        val  book_a_flight= view.findViewById(R.id.home) as WebView
        book_a_flight.loadUrl("https://www.ethiopianairlines.com")

        val webSettings =  book_a_flight.getSettings()
        webSettings.setJavaScriptEnabled(true)

        book_a_flight.setWebViewClient(WebViewClient())

        return view
    }
}