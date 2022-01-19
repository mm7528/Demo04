package com.example.demo04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int num=0;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =findViewById(R.id.button);
    }

    public void clicking(View view) {
        num+=1;
        if(num%7==0){
            btn.setText("BOOM!");
        }
        else{
            btn.setText("This is a click number:"+ num);
        }
    }
}