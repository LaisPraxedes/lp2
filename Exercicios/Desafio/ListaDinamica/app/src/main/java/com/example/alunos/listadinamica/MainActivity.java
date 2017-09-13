
package com.example.alunos.listadinamica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.alunos.listadinamica.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void showList(View v){
        Intent it = new Intent(this, mostraListaDinamica.class);
        it.putParcelableArrayListExtra("list", lista);
        startActivity(it);
    }
    public void salvara(View v){
        EditText nomep = (EditText)findViewById(R.id.editNome);
        String nome = nomep.getText().toString();

        EditText telp = (EditText)findViewById(R.id.editTel);
        String tel = telp.getText().toString();

        EditText idadep = (EditText)findViewById(R.id.editIdade);
        int idade = Integer.parseInt(idadep.getText().toString());

        lista.add(new Pessoa(nome, tel, idade));
    }
}
