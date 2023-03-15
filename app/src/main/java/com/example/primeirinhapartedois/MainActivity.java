package com.example.primeirinhapartedois;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText campo, login, senha, confirma;
    ArrayList<Usuario> usuarios = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {// Primeiro metodo a ser executado

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //obter o banner com o titulo do app esconder
        //Vincular a variavel java  com o xml
        login = findViewById(R.id.campoNome);
        senha = findViewById(R.id.campoSenha);
        criarUsuario();

    }
//    public void cliker(View v){
//        String mensagem = "oi! " + campo.getText() + "seja bem vindo(a)";
//        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();

//    }
    public void logar(View V) {
        String user = login.getText().toString();
        String pass = senha.getText().toString();
        String mensagem = "Bem vindo ao laranjais app";

        if (verificaCampos()) {
            for (Usuario u : usuarios) {
                if (user.equals(u.getLogin()) && pass.equals(u.getSenha())) {
                    if (u.isAdimim()) {
                        Intent t = new Intent(this, comum.class);
                        startActivity(t);
                        adimim.usuarios = usuarios;
                    } else {
                        Intent i = new Intent(this, adimim.class);
                        startActivity(i);
                    }
                    mensagem = "bem vindo";
                    break;
                } else {
                    mensagem = "Login ou senha incorretos";
                }
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        }
    }

    public boolean verificaCampos(){
        String log = login.getText().toString();
        String sen = senha.getText().toString();

        if(log.isEmpty() || sen.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    private void criarUsuario() {
        Usuario u1 = new Usuario("adimim","adimim",true);
        Usuario u2 = new Usuario("paulo","abc",false);
        Usuario u3 = new Usuario("pedro","sirisos",false);
        Usuario u4 = new Usuario("aaa","bbb",false);
        Usuario u5 = new Usuario("aimim","aimim",true);
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
    }
    public void cadastro(View v){
        Intent i = new Intent(this, cadastro.class);
        startActivity(i);
        cadastro.usuarios = usuarios;
    }
}
