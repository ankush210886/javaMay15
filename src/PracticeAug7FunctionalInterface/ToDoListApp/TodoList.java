package PracticeAug7FunctionalInterface.ToDoListApp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class TodoList {

    private Map<String, TodoItem> items;

    public TodoList() {
        items = new HashMap<>();
    }

    public void addTodoItem(String title, Function<String, TodoItem> function){
        items.put(title, function.apply(title));
    }

    public void updateTodoItem(String title, Consumer<TodoItem> consumer){
        TodoItem item = items.get(title);
        if(item != null){
            consumer.accept(item);
        } else {
            System.out.println("No items to be updated.");
        }
    }

    public void removeTodoItem(String title, Consumer<String> consumer){
        if(items.containsKey(title)){
            consumer.accept(title);
            items.remove(title);
        } else {
            System.out.println("Item not found.");
        }
    }

    public void showTodoItems(){
        if(!items.isEmpty())
        items.forEach((title, item) -> System.out.println("Title: "+ title + ", " + item.toString()));
        else
            System.out.println("No items found.");
    }
}