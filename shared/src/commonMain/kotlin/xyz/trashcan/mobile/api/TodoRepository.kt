package xyz.trashcan.mobile.api

interface TodoRepository {
    fun addItem(item: TodoItem)
    fun removeItem(itemId: Int)
    fun getItem(itemId: Int): TodoItem?
    fun getAllItems(): List<TodoItem>
    fun updateItem(item: TodoItem)
}