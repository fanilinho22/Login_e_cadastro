package com.example.primeirinhapartedois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class adimim extends AppCompatActivity {
    static ArrayList<Usuario> usuarios;
    EditText textoAdimim;
    TextView resultado;
    Usuario encontrado = new Usuario();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adimim);
        getSupportActionBar().hide();
        textoAdimim = findViewById(R.id.textoAdimim);
        resultado = findViewById(R.id.resultado);
    }
    public void buscar(View v){
        String login = textoAdimim.getText().toString();
        String mensagem = "Login" +login+ "nao encontrado!";
        for(Usuario u : usuarios){
            if(u.login.equals(login)){
                mensagem = "login "+login+"encontrado";
                encontrado =u;
                break;
            }
        }
    }
}