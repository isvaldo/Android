package com.example.isvaldo.cadastro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListaAlunosActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem_alunos);
        ListView lista = (ListView) findViewById(R.id.lista);

        final String[] alunos = {"Suelem","guilherme","mauricio"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                alunos);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Toast.makeText(ListaAlunosActivity.this, "posição é " + position, Toast.LENGTH_SHORT).show();

            }
        });

      lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
          @Override
          public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
              String msg = adapter.getItemAtPosition(position).toString();

              Toast.makeText(ListaAlunosActivity.this, msg,Toast.LENGTH_SHORT).show();

              return false;
          }
      });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lista_alunos, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent irParaFormulario = new Intent(this, FormularioActivity.class);
                startActivity(irParaFormulario);
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
