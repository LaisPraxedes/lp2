package com.example.alunos.listadinamica;



import android.app.ListActivity;
import android.os.Bundle;

import com.example.alunos.listadinamica.adapter.PessoaAdapter;
import com.example.alunos.listadinamica.model.Pessoa;

import java.util.ArrayList;


public class mostraListaDinamica extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa("Pedro", "3690-1234", 12));
        lista.add(new Pessoa("Joao", "3690-4321", 18));

        setListAdapter(new PessoaAdapter(this, lista));
    }
}
