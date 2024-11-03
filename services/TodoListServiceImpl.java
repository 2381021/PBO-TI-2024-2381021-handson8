package services;

import entities.TodoList;
import repositories.TodoListRepository;

public interface TodoListServiceImpl implements TodoListService{
    private final TodoListRepository todoListRepository;

    public TodoListServiceImpl(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }


    @Override
    default TodoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    if (todo.isBlank() || todo.isEmpty()) {
        System.out.printf("Masukan todo dengan benar");
        return;
    }

    TodoList todoList = new TodoList();
    todoList.setTodo(todo);
    todo

    @Override
    default Boolean removeTodoList(Integer number) {
        return null;
    }

    @Override
    default Boolean editTodoList(Integer number, String todo) {
        return null;
    }
}
