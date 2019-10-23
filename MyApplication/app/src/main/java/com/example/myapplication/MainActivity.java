package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Document doc;


    Element element;
    Elements elements;
    String  text;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.site);
        webView.loadUrl("http://www.fotoprizer.ru/");
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
        /*try {
            doc = Jsoup.connect("http://www.fotoprizer.ru/").get(); //
            elements = doc.getElementsByAttributeValue("class", "m_cnkrs_nm");
            element = elements.select("a").get(0);
            text = element.attr("href");
        } catch (IOException e) {
            e.printStackTrace();
        }
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(text);
            }
        });*/
    }
}
