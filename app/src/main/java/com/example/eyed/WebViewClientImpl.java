package com.example.eyed;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ProgressBar;


public class WebViewClientImpl extends WebViewClient {

    private Activity activity = null;
    String ShowOrHideWebViewInitialUse = "show";
    private WebView webView = null;

    public WebViewClientImpl(Activity activity) {
        this.activity = activity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.indexOf("https://eyedapps.000webhostapp.com") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;


    }

}