package com.example.primeirinhapartedois;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class cadastro extends AppCompatActivity {
    EditText novoNome, novaSenha, confirmacao;
    static ArrayList<Usuario> usuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        novoNome = findViewById(R.id.nomeCadastro);
        novaSenha = findViewById(R.id.senhaCadastro);
        confirmacao = findViewById(R.id.confirmaSenhacadastro);



    }
    public void cadastra(View v) {
        String login = novoNome.getText().toString();
        String senha = novaSenha.getText().toString();
        String conf = confirmacao.getText().toString();
        String mensagem = "";

        if (verificaExiste(login)) {
            Toast.makeText(this, "Ja existe!", Toast.LENGTH_LONG).show();

        } else if (senha.equals(conf)) {
            Usuario u = new Usuario(login, senha, false);
            usuarios.add(u);
            Toast.makeText(this, "Seja bem vindo!", Toast.LENGTH_LONG).show();

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "As senhas nao batem!", Toast.LENGTH_LONG).show();
            }
        }

    public boolean verificaExiste(String login ){
        for(Usuario u : usuarios){
            if(u.getLogin().equals(login)){
                return true;
            }
        } return  false;

    }

}