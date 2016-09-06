package com.example.admin.googlesearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button BROWSE;
    EditText Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BROWSE=(Button)findViewById(R.id.browse);
        Enter=(EditText)findViewById(R.id.edittext);
        BROWSE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent browseintent=new Intent(Intent.ACTION_WEB_SEARCH, Uri.parse("http://www.google.com"));
        startActivity(browseintent);
    }
}
