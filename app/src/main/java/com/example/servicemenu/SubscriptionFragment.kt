package com.example.servicemenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class SubscriptionFragment : Fragment() {

    private lateinit var webView: WebView
    val URL = "https://www.mtn.co.za/Pages/MTN-Subscriptions.aspx"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout =  inflater.inflate(R.layout.fragment_subscription, container, false)

        webView = layout.findViewById(R.id.web_view_sub)
        webView.apply {
            loadUrl(URL)
            settings.javaScriptEnabled = true
            settings.textZoom
            webViewClient = WebViewClient()
        }
        webView.canGoBack()

        return layout
    }
}