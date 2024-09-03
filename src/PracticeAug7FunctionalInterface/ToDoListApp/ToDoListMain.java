package PracticeAug7FunctionalInterface.ToDoListApp;
import java.util.*;

public class ToDoListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        boolean exit = false;
        while(!exit){
            System.out.println("*** To Do List ***");
            System.out.println("Press 1 for Adding an item");
            System.out.println("Press 2 for Updating an item");
            System.out.println("Press 3 for Delete an item");
            System.out.println("Press 4 for Show all items");
            System.out.println("Press 5 for Exit!");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 1:
                    System.out.println("Enter the title to add an item:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the description to "+ title +".");
                    String description = scanner.nextLine();
                    todoList.addTodoItem(title, desc -> new TodoItem(description));
                    break;

                case 2:
                    System.out.println("Enter the title to update the Todo Item:");
                    String updateTitle = scanner.nextLine();
                    System.out.println("Enter the description to "+ updateTitle +".");
                    description =scanner.nextLine();
                    todoList.updateTodoItem(updateTitle, item -> new TodoItem(description));
                    todoList.updateTodoItem(updateTitle, item -> item.markAsCompleted());
                    break;

                case 3:
                    System.out.println("Enter the title to delete the item:");
                    String deleteTitle = scanner.nextLine();
                    todoList.removeTodoItem(deleteTitle, titleKey -> System.out.println("Item Removed: "+ titleKey));
                    break;

                case 4:
                    todoList.showTodoItems();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid input!");

            }
        }
    }
}