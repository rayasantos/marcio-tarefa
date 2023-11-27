package com.example.demo;

import java.util.TarefaService;

@RestController
@RequestMapping("/itemManager")
@CrossOrigin

public class FullTarefaController {

    @Autowired
    private TarefaService service;


    @GetMapping(value="/items", produces={"application/json","application/xml"})
    public Collection<Tarefa> getItems() {
        return service.getItems();
    }


    @GetMapping(value="/item/{id}", produces={"application/json","application/xml"})
    public Tarefa getItem(@PathVariable int id) {
        return service.getItem(id);
    }


    @PostMapping(value="/item",
            consumes={"application/json","application/xml"},
            produces={"application/json","application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa addItem(@RequestBody Tarefa item) {
        service.insert(item);
        return item;
    }


    @PutMapping(value="/item/{id}", consumes={"application/json","application/xml"})
    public void modifyItem(@PathVariable int id, @RequestBody Tarefa item) {
        System.out.println("Modifying item to " + item);
        service.update(item);
    }


    @DeleteMapping("/item/{id}")
    public void deleteItem(@PathVariable int id) {
        service.delete(id);
    }
}
