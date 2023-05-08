package main.java.com.todo;

import java.util.ArrayList;
import java.util.List;

public class tasksModelo {
    private List<task> tasks;

    public tasksModelo() {
        this.tasks = new ArrayList<>();
    }

    public void agregartask(String descripcion) {
        task task = new task(descripcion);
        tasks.add(task);
    }

    public void eliminartask(int indice) {
        tasks.remove(indice);
    }

    public void actualizartask(int indice, String descripcion) {
        task task = tasks.get(indice);
        task.setDescripcion(descripcion);
    }

    public void completartask(int indice) {
        task task = tasks.get(indice);
        task.completar();
    }

    public List<task> obtenertasks() {
        return tasks;
    }
}
