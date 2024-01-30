package xyz.trashcan.mobile.api

class InMemoryTodoRepository : TodoRepository {
    private val items = mutableListOf<TodoItem>()
    private var nextId = 1

    override fun addItem(item: TodoItem) {
        val newItem = item.copy(id = nextId++)
        items.add(newItem)
    }

    override fun removeItem(itemId: Int) {
        items.removeAll { it.id == itemId }
    }

    override fun getItem(itemId: Int): TodoItem? {
        return items.find { it.id == itemId }
    }

    override fun getAllItems(): List<TodoItem> {
        return items.toList()
    }

    override fun updateItem(item: TodoItem) {
        val index = items.indexOfFirst { it.id == item.id }
        if (index != -1) {
            items[index] = item
        }
    }
}