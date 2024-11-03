package repositories;

import entities.TodoList;

public class TodoListRepositoryImp implements TodoListRepository{
    public static TodoList[] todos = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return todos;
    }

    @Override
    public void add(TodoList todoList) {
        resizeArrayIfFull();

        // add todo to array that has null element
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todoList;
                break;
            }
        }
    }
    private static void resizeArrayIfFull() {
        // cek whether todos is full
        Boolean isFull = true;
        isFull = isArrayFull(isFull);

        // if full, resize current array two times bigger
        if (isFull) {
            resizeArrayToTwoTimesBigger();
        }
    }

    private static void resizeArrayToTwoTimesBigger() {
        TodoList[] temp = todos;
        todos = new TodoList[todos.length * 2];
        for (int i = 0; i < temp.length; i++) {
            todos[i] = temp[i];
        }
    }

    private static Boolean isArrayFull(Boolean isFull) {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    @Override
    public Boolean remove(final Integer number) {
        if (isSelectedTodoNotValid(number)) {
            return false;
        }

        for (int i = number - 1; i < todos.length; i++) {
            // if todo is the last element
            if (i == (todos.length - 1)) {
                todos[i] = null;
            } else {
                // replace with the element on the right
                todos[i] = todos[i + 1];
            }
        }
        return true;
    }

    @Override
    public Boolean edit(final TodoList todoList) {
        return null;
    }
}