package com.hirenpatel.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    EditText edittext;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView = findViewById(R.id.webView);
        edittext = findViewById(R.id.edittext);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(v.getId()){
                    case R.id.button:
                        String url = edittext.getText().toString();
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setWebViewClient(new MyWebViewClient());
                        webView.loadUrl(url);
                        break;
                }

            }

        });
    }
    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}