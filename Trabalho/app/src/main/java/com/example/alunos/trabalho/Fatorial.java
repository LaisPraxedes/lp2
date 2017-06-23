package com.example.alunos.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class Fatorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fatorial);
    }


    public void  calcfatorial (View n){
        EditText pos = (EditText) findViewById(R.id.idfi);
        int num = Integer.parseInt(pos.getText().toString());
        int y=1;
        for (int i=1; i<=num; i++){
            y*=i;
        }
        TextView x = (TextView) findViewById(R.id.idfm);
        x.setText(Integer.toString(y));

    }

}
