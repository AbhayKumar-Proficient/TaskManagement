import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

public class TaskManagerGUI extends JFrame {
    private ArrayList<Task> tasks;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JButton addButton;
    private JButton markCompletedButton;

    public TaskManagerGUI() {
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        addButton = new JButton("Add Task");
        markCompletedButton = new JButton("Mark Completed");

        setLayout(new BorderLayout());
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(markCompletedButton);
        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog(TaskManagerGUI.this, "Enter task title:");
                if (title != null && !title.trim().isEmpty()) {
                    addTask(title);
                }
            }
        });

        markCompletedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    markTaskAsCompleted(selectedIndex);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TaskManagement GUI");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addTask(String title) {
        Task task = new Task(title);
        tasks.add(task);
        listModel.addElement(task.getTitle());
    }

    public void markTaskAsCompleted(int taskIndex) {
        Task task = tasks.get(taskIndex);
        task.setCompleted(true);
        listModel.setElementAt(task.getTitle() + " [Completed]", taskIndex);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TaskManagerGUI();
            }
        });
    }
}
