package repository;

import entities.TodoList;

public interface TodoListRepository {
    TodoList[] getALL();
    void add(TodoList todoList);
    Boolean remove(Integer id);
    Boolean edit(TodoList todoList);
}