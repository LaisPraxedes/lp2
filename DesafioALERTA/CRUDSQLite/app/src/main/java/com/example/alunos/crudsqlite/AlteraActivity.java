package com.example.alunos.crudsqlite;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlteraActivity extends AppCompatActivity {
    EditText livro;
    EditText autor;
    EditText editora;
    Button alterar;
    Cursor cursor;
    BancoController crud;
    String codigo;
    Button deletar;
    AlertDialog alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera);
        codigo = this.getIntent().getStringExtra("codigo");

        crud = new BancoController(getBaseContext());

        livro = (EditText) findViewById(R.id.alteraTitulo);
        autor = (EditText) findViewById(R.id.alteraAutor);
        editora = (EditText) findViewById(R.id.AlteraEditora);

        alterar = (Button) findViewById(R.id.btnAlt);

        cursor = crud.carregaDadoById(Integer.parseInt(codigo));
        livro.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.TITULO)));
        autor.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.AUTOR)));
        editora.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.EDITORA)));

        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crud.alteraRegistro(Integer.parseInt(codigo),
                        livro.getText().toString(), autor.getText().toString(),
                        editora.getText().toString());
                Intent intent = new Intent(AlteraActivity.this, ConsultaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        deletar = (Button)findViewById(R.id.btnApag);
        deletar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                crud.apagaRegistro(Integer.parseInt(codigo));
                Intent intent = new Intent (AlteraActivity.this, ConsultaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        deletar = (Button)findViewById(R.id.btnApag);
        deletar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(AlteraActivity.this);
                builder.setTitle("ALERTA");
                builder.setMessage("Tem certeza que deseja excluir seus dados ?");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        crud.apagaRegistro(Integer.parseInt(codigo));
                        Intent intent = new Intent(AlteraActivity.this, ConsultaActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
                alerta = builder.create();
                alerta.show();
            }
        });
    }
}

