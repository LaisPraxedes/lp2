package com.example.alunos.trabalho;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;
import static java.lang.Double.*;
public class Calculadora extends AppCompatActivity {
    Stack pilha = new Stack();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }
    public void empilhar(View n){
        EditText numft = (EditText) findViewById(R.id.ins_num);
        String a = numft.getText().toString();
        if (a.compareTo("")!= 0) {
            if(a.compareTo(".")!=0){
                double num1 = Double.parseDouble(a);
                pilha.push(num1);
            }
        }
        this.mostrar();
        numft.setText("");
    }
    public void desempilhar(View n){
        if(!pilha.empty()) {
            pilha.pop();
        }
        this.mostrar();
    }
    public void limpar(View n){
        while (!pilha.empty()){
            pilha.pop();
        }
        this.mostrar();
    }
    public void mostrar(){
        TextView pega = (TextView) findViewById(R.id.txt_most);
        pega.setText(pilha.toString());
    }
    public void soma(View n){
        if(pilha.size()>=2){
            String x = pilha.pop().toString();
            double num1 = Double.parseDouble(x);
            x = pilha.pop().toString();
            double num2 = Double.parseDouble(x);
            pilha.push(num1+num2);
            this.mostrar();
        }
    }
    public void sub(View n){
        if(pilha.size()>=2){
            String x = pilha.pop().toString();
            double num1 = Double.parseDouble(x);
            String x2 = pilha.pop().toString();
            double num2 = Double.parseDouble(x2);
            pilha.push(num1-num2);
            this.mostrar();
        }
    }
    public void mul(View n){
        if(pilha.size()>=2){
            String x = pilha.pop().toString();
            double num1 = Double.parseDouble(x);
            x = pilha.pop().toString();
            double num2 = Double.parseDouble(x);
            pilha.push(num1*num2);
            this.mostrar();
        }
    }
    public void div(View n){
        if(pilha.size()>=2){
            String x = pilha.pop().toString();
            double num1 = Double.parseDouble(x);
            x = pilha.pop().toString();
            double num2 = Double.parseDouble(x);
            if(num2!=0) {
                pilha.push(num1 / num2);
            }else{
                pilha.push(num2);
                pilha.push(num1);
            }
            this.mostrar();
        }
    }
}
