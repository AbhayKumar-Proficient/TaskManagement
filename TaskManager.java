import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TaskManager {
    private ArrayList<Task> tasks;
    private Scanner scanner;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addTask(String title) {
        Task task = new Task(title);
        tasks.add(task);
        System.out.println("Task added: " + title);
    }

    public void viewTasks() {
        System.out.println("\nTasks:");
        int count = 1;
        for (Task task : tasks) {
            System.out.println(count + ". " + task.getTitle() + " [" + (task.isCompleted() ? "Completed" : "Pending") + "]");
            count++;
        }
        System.out.println();
    }

    public void markTaskAsCompleted(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            Task task = tasks.get(taskNumber - 1);
            task.setCompleted(true);
            System.out.println("Task marked as completed: " + task.getTitle());
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("Task Management Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    addTask(title);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    viewTasks();
                    System.out.print("Enter the task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    markTaskAsCompleted(taskNumber);
                    break;
                case 0:
                    System.out.println("Exiting Task Management...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.run();
    }
}
