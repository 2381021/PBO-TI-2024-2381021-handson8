package repositories;

import entities.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();
    void add(TodoList toDoList);
    Boolean remove(Integer id);
    Boolean edit(TodoList toDoList);
}
