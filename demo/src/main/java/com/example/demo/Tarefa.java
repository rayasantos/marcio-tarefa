package com.example.demo;

public class Tarefa {

    private int id;
    private String descricao;
    private boolean feita;

    public Tarefa() {
    }

    public Tarefa(String descricao, boolean feita) {
        this.descricao = descricao;
        this.feita = feita;
    }

    public void update(Tarefa tarefa) {
        if (tarefa != null) {
            setDescricao(tarefa.getDescricao());
            setFeita(tarefa.isFeita());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    @Override
    public String toString() {
        return "Tarefa: [ ID: " + id + ", SITUACAO: " + feita + ", DESCRICAO: " + descricao + " ]";
    }

}
