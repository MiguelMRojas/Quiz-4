package main.java.com.todo;

import java.util.List;
import java.util.Scanner;
import main.java.com.todo.tasksModelo;
import  main.java.com.todo.tasksVista;


public class taskController {
    private tasksModelo modelo;
    private tasksVista vista;

    public taskController(tasksModelo modelo, tasksVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregartask(String descripcion) {
        modelo.agregartask(descripcion);
        vista.mostrarMensaje("TAREA AGREGADA");
    }

    public void eliminartask(int indice) {
        modelo.eliminartask(indice);
        vista.mostrarMensaje("TAREA ELIMINADA");
    }

    public void actualizartask(int indice, String descripcion) {
        modelo.actualizartask(indice, descripcion);
        vista.mostrarMensaje("TAREA ACTUALIZADA");
    }

    public void completartask(int indice) {
        modelo.completartask(indice);
        vista.mostrarMensaje("TAREA COMPLETADA");
    }

    public void vertasks() {
        List<task> tasks = modelo.obtenertasks();
        vista.mostrartasks(tasks);
    }
}

