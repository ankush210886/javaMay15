package PracticeAug7FunctionalInterface.ToDoListApp;


public class TodoItem {
    private String description;
    private boolean isCompleted;

    public TodoItem(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Description: " + description + '\'' +
                ", Completed: " + isCompleted +
                '}';
    }
}
