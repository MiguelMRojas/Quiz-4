package main.java.com.todo;

import java.util.List;
import java.util.Scanner;

public class tasksVista {
    private Scanner scanner;

    public tasksVista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrartasks(List<task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
    
        System.out.println("Lista de TAREAS:");
    
        for (int i = 0; i < tasks.size(); i++) {
            task task = tasks.get(i);
            String estado = task.estaCompletada() ? "[X]" : "[ ]";
            System.out.println(i + ". " + estado + " " + task.getDescripcion());
        }
    
        System.out.println();
    }
    

    public String leerDescripcion() {
        System.out.print("Ingrese una descripción: ");
        return scanner.nextLine().trim();
    }

    public int leerIndice() {
        System.out.print("Ingrese el índice de la tarea: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("===== MENU DE TAREAS =====");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Actualizar tarea");
        System.out.println("4. Completar tarea");
        System.out.println("5. Ver tareas");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opción:");
    }
    
}
