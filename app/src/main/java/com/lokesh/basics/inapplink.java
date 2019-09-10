package com.lokesh.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class inapplink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inapplink);

        WebView webview=new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.google.com/");                     // link of the website needed to be opened within app
    }
}
