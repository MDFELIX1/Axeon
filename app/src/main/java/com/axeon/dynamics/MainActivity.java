package com.axeon.dynamics;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); 
        
        myWebView.setWebViewClient(new WebViewClient());
        
        // Point this to your actual GitHub Pages URL
        myWebView.loadUrl("https://YOUR_GITHUB_USERNAME.github.io/Axeon-Dynamics/"); 
    }
}
