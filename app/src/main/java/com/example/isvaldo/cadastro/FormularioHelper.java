package com.example.isvaldo.cadastro;

import android.widget.EditText;
import android.widget.SeekBar;

/**
 * Created by isvaldo on 28/07/15.
 */
public class FormularioHelper {


    private final FormularioActivity formularioActivity;
    private String nome;
    private String site;
    private String endereco;
    private String telefone;
    private int nota;
    private Aluno aluno;
    private final FormularioActivity Activity;

    public FormularioHelper(FormularioActivity Activity) {
        this.Activity= Activity;
    }


    public FormularioHelper getValues(){
        // mapeando obj's
        EditText obj_nome = (EditText) Activity.findViewById(R.id.nome);
        EditText obj_site = (EditText) Activity.findViewById(R.id.site);
        EditText obj_endereco = (EditText) Activity.findViewById(R.id.endereco);
        EditText obj_telefone = (EditText) findViewById(R.id.telefone);
        SeekBar obj_nota = (SeekBar) Activity.findViewById(R.id.nota);

        // pegando strings
        nome = obj_nome.getText().toString();
        site = obj_site.getText().toString();
        endereco = obj_endereco.getText().toString();
        telefone = obj_telefone.getText().toString();
        nota = obj_nota.getProgress();
        return this;
    }

    public void parseToAluno(){
        // criando modelo
        Aluno newAluno = new Aluno();
        newAluno.setNome(this.nome);
        newAluno.setSite(this.site);
        newAluno.setEndereco(this.endereco);
        newAluno.setTelefone(this.telefone);
        newAluno.setNota(this.nota);
        aluno = newAluno;

    }



}
