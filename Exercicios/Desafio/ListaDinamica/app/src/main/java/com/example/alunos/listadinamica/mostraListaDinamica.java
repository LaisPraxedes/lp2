package com.example.alunos.listadinamica;

import android.os.Parcelable;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.alunos.listadinamica.adapter.PessoaAdapter;
import com.example.alunos.listadinamica.model.Pessoa;

import java.util.ArrayList;


public class mostraListaDinamica extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent it = getIntent();


        ArrayList<Pessoa> lista = it.getParcelableArrayListExtra("list");
        setListAdapter(new PessoaAdapter(this, lista));
    }
}
