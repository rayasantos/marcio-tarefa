package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(TarefaService tarefaService) {
		return (args) -> {

			Tarefa tarefa1 = new Tarefa("Atividade Pronta", false);
			Tarefa tarefa2 = new Tarefa("Atividade Realizada", false);
			Tarefa tarefa3 = new Tarefa("Atividade Péndente", true);
			Tarefa tarefa4 = new Tarefa("Atividade Atrasada", true);

			tarefaService.insert(tarefa1);
			tarefaService.insert(tarefa2);
			tarefaService.insert(tarefa3);
			tarefaService.insert(tarefa4);


			System.out.println("Lista de Tarefas:");
			tarefaService.getItems().forEach(System.out::println);

			Tarefa tarefaObtida = tarefaService.getItem(1);
			System.out.println("Tarefa obtida por ID:");
			System.out.println(tarefaObtida);

			tarefaObtida.setDescricao("Atividade Pronta (Atualizada)");
			tarefaService.update(tarefaObtida);
			System.out.println("Tarefa atualizada:");
			System.out.println(tarefaObtida);


			tarefaService.delete(2);
			System.out.println("Tarefa removida:");


			System.out.println("Lista de Tarefas após remoção:");
			tarefaService.getItems().forEach(System.out::println);
		};
	}
}
