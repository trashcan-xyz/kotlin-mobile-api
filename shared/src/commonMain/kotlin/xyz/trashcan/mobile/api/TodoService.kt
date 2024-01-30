package xyz.trashcan.mobile.api

class TodoService(private val repository: TodoRepository) {

    fun addTodoItem(item: TodoItem) {
        repository.addItem(item)
    }

    fun removeTodoItem(itemId: Int) {
        repository.removeItem(itemId)
    }

    fun getTodoItem(itemId: Int): TodoItem? {
        return repository.getItem(itemId)
    }

    fun getAllTodoItems(): List<TodoItem> {
        return repository.getAllItems()
    }

    fun markTodoItemComplete(itemId: Int) {
        val item = repository.getItem(itemId)
        item?.let {
            it.isCompleted = true
            repository.updateItem(it)
        }
    }
}