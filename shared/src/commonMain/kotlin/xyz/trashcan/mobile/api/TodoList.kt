package xyz.trashcan.mobile.api

class TodoList {
    private val items = mutableListOf<TodoItem>()

    fun addItem(item: TodoItem) {
        items.add(item)
    }

    fun removeItem(itemId: Int) {
        items.removeAll { it.id == itemId }
    }

    fun getItem(itemId: Int): TodoItem? {
        return items.find { it.id == itemId }
    }

    fun getAllItems(): List<TodoItem> {
        return items.toList()
    }

    fun markItemComplete(itemId: Int) {
        items.find { it.id == itemId }?.isCompleted = true
    }
}
