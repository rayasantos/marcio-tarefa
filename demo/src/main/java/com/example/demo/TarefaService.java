package com.example.demo;

import java.util.Tarefa;

public interface TarefaService {

    Tarefa getItem(int id);
    Tarefa<Tarefa> getItems();

    void insert(Tarefa tarefa);
    void update(Tarefa tarefa);
    void delete(int id);

}
