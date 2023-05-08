import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.com.todo.task;
import main.java.com.todo.tasksModelo;
import main.java.com.todo.taskController;
import main.java.com.todo.tasksVista;

public class tasksModeloTest {

    @Test
    public void agregarTask() {
        tasksModelo modelo = new tasksModelo();
        modelo.agregartask("Hacer la compra dicha");
        List<task> tasks = modelo.obtenertasks();
        assertEquals(1, tasks.size());
        assertEquals("Hacer la compra dicha", tasks.get(0).getDescripcion());
        assertEquals(false, tasks.get(0).estaCompletada());
    }

}
