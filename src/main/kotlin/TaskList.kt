import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun TaskList(
    listaItems: List<Task>, // Parámetro para la lista de tareas
    onCheckedTask: (task: Task, checked: Boolean) -> Unit, // Función para cambiar el estado de la tarea
    onCloseTask: (task: Task) -> Unit // Función para eliminar una tarea
) {
    LazyColumn {
        items(listaItems) { task ->
            TaskItem(
                task = task, // Pasamos la tarea completa
                onClose = { onCloseTask(task) }, // Pasamos la función onClose con la tarea correspondiente
            )
        }
    }
}
