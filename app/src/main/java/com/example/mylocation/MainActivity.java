package com.example.mylocation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
TextView adrtext;
Button start;
String adr;
GetLocation obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adrtext= (TextView) findViewById(R.id.textView);
        start= (Button) findViewById(R.id.button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj=new GetLocation(MainActivity.this);
                adr=obj.adr.getSubLocality()+obj.adr.getLocality()+obj.adr.getFeatureName()+obj.adr.getCountryName();
                adrtext.setText(adr);
            }
        });
    }
}
