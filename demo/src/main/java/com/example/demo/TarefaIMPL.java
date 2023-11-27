package com.example.demo;

import java.util.Tarefa;

@Service

public class TarefaIMPL implements TarefaService {

    private static Map<Integer, Tarefa> tarefa = new HashMap<Integer, Tarefa>();
    private int nextId = 1;


    {
        insert(new Tarefa(1,"Atividade Pronta",false);
        insert(new Tarefa(2,"Atividade Realizada",false);
        insert(new Tarefa(3,"Atividade Péndente",true);
        insert(new Tarefa(4,"Atividade Atrasada",true);

    }

    @Override
    public Tarefa getItem(int id) {
        return tarefa.get(id);
    }

    @Override
    public Collection<Tarefa> gettarefa() {
        return tarefa.values();
    }

    @Override
    public void insert(Tarefa item) {
        item.setId(nextId++);
        tarefa.put(item.getId(), item);
    }

    @Override
    public void update(Tarefa item) {
        int id = item.getId();
        if (tarefa.containsKey(id)) {
            tarefa.put(id, item);
        }
    }

    @Override
    public void delete(int id) {
        Tarefa item = tarefa.get(id);
        if (item != null) {
            tarefa.remove(id);
        }
    }

    @Override
    public String toString() {
        return "Tarefa = [ID: " + id + ", SITUACAO: " + feita + ", DESCRICAO: " + descricao + "]";
    }
}
