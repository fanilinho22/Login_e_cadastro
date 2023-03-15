package com.example.primeirinhapartedois;

public class Usuario {
    String login;
    String senha;
    boolean adimim;

    public Usuario(String login, String senha, boolean adimim) {
        this.login = login;
        this.senha = senha;
        this.adimim = adimim;
    }

    public Usuario() {

    }

    //obiter uma informaçao
    public String getLogin() {
        return login;
    }
    //mudar uma informaçao
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdimim() {
        return adimim;
    }

    public void setAdimim(boolean adimim) {
        this.adimim = adimim;
    }
}
