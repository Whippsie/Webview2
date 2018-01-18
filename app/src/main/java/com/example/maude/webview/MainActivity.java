package com.example.maude.webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        webview = (WebView) findViewById(R.id.webview1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        */
    }

    @Override
    public void onClick(View view) {
        String lien = "http://perdu.com";
        switch(view.getId()){
            case R.id.btn1:
                //Load URL
                webview.loadUrl(lien);
                break;
            case R.id.btn2:
                //URI
                Uri uri = Uri.parse(lien);
                Intent intent = new Intent (Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
        }
    }
}
