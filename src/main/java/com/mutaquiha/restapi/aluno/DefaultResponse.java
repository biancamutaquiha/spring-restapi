package com.mutaquiha.restapi.aluno;

public class DefaultResponse {

    private int codigo;
    private String status;
    private String mensagem;

    public DefaultResponse(int codigo, String status, String mensagem) {
        this.codigo = codigo;
        this.status = status;
        this.mensagem = mensagem;
    }

    public DefaultResponse(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
