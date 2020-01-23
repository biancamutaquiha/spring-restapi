package com.mutaquiha.restapi.aluno;

public class Aluno {

    private long id;
    private int idade;
    private String nomeCompleto;

    public Aluno(long id, int idade, String nomeCompleto) {
        this.id = id;
        this.idade = idade;
        this.nomeCompleto = nomeCompleto;
    }

    public Aluno() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


}
