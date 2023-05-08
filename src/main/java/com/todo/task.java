package main.java.com.todo;

import java.util.ArrayList;
import java.util.List;

public class task {
    private String descripcion;
    private boolean completada;

    public task(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }
}

