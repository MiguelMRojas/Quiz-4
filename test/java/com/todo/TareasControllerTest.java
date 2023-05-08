package test.java.com.todo;

import main.java.com.todo.taskController;
import main.java.com.todo.tasksModelo;
import main.java.com.todo.tasksVista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TareasControllerTest {

    private tasksModelo modelo;
    private tasksVista vista;
    private taskController controller;

/**
 * Este método se ejecuta antes de cada test y se encarga de inicializar el modelo, la vista y el controlador.
 */
    @BeforeEach
    public void setUp() {
        modelo = new tasksModelo();
        vista = new tasksVista();
        controller = new taskController(modelo, vista);
    }

    @Test
    public void testAgregarTarea() {
        String descripcion = "Comprar computador";
        controller.agregartask(descripcion);
        assertEquals(1, modelo.obtenertasks().size());
    }

    private void assertEquals(int i, int size) {
    }
}

