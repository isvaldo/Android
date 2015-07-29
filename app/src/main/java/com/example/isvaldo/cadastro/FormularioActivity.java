package com.example.isvaldo.cadastro;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by isvaldo on 25/07/15.
 *
 */
public class FormularioActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        // Set all objects
        Button submit = (Button) findViewById(R.id.submit);






        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            new FormularioHelper().getValues().parseToAluno();



            }
        });





    }



}
