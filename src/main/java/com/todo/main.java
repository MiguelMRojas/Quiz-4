package main.java.com.todo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tasksModelo modelo = new tasksModelo();
        tasksVista vista = new tasksVista();
        taskController controlador = new taskController(modelo, vista);
        
        int opcion = 0;
        do {
            vista.mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // consume el salto de línea
            switch (opcion) {
                case 1:
                    vista.mostrarMensaje("Ingrese primero el titulo, seguido de la descripción de la tarea:");
                    String descripcion = sc.nextLine();
                    controlador.agregartask(descripcion);
                    break;
                case 2:
                    vista.mostrarMensaje("Ingrese el índice de la tarea a eliminar:");
                    int indiceEliminar = sc.nextInt();
                    controlador.eliminartask(indiceEliminar);
                    break;
                case 3:
                    vista.mostrarMensaje("Ingrese el índice de la tarea a actualizar:");
                    int indiceActualizar = sc.nextInt();
                    sc.nextLine(); // consume el salto de línea
                    vista.mostrarMensaje("Ingrese la nueva descripción de la tarea:");
                    String nuevaDescripcion = sc.nextLine();
                    controlador.actualizartask(indiceActualizar, nuevaDescripcion);
                    break;
                case 4:
                    vista.mostrarMensaje("Ingrese el índice de la tarea a completar:");
                    int indiceCompletar = sc.nextInt();
                    controlador.completartask(indiceCompletar);
                    break;
                case 5:
                    controlador.vertasks();
                    break;
                case 6:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida");
                    break;
            }
        } while (opcion != 6);
        
        sc.close();
    }
}

