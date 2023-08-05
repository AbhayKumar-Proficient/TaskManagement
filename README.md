# TaskManagement
**TaskManagement: Simplify tasks, boost productivity. Add, view, mark complete with ease. Lightweight Java console app for efficient organization.**


**Project Description: TaskManagement (Java Console Application)**

**Overview:**
TaskManagement is a simple Java console application designed to help users manage their tasks efficiently. The application provides a user-friendly interface for adding, viewing, and marking tasks as completed, all within the command-line environment. TaskManagement is a great example of how Java can be used to create practical, lightweight tools for personal task organization.

**Features:**
1. **Task Addition:** Users can easily add new tasks by entering a title for each task. Once added, the tasks are stored in memory, allowing users to access them throughout the session.

2. **Task Viewing:** The application enables users to view their existing tasks. Each task is displayed with its corresponding task number, title, and status (completed or pending).

3. **Task Completion:** Users have the option to mark tasks as completed by entering the task number. The application updates the task status accordingly, making it easy for users to track their progress.

4. **Menu-based Interface:** TaskManagement employs a simple menu-driven interface, guiding users through different actions available to them. Users can select options by entering the corresponding numeric choices.

**How to Use:**
1. Launch the TaskManagement application in a console or terminal.
2. Upon starting, users are presented with a menu, displaying available actions.
3. To add a new task, choose option 1, and enter the title of the task when prompted.
4. To view existing tasks, select option 2, and the application will display a list of tasks with their numbers and statuses.
5. To mark a task as completed, select option 3, and enter the task number when prompted.
6. The application allows users to continue performing tasks until they choose to exit (option 0).

**Example Usage:**
```
Task Management Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
0. Exit
Enter your choice: 1
Enter task title: Complete Java Project

Task added: Complete Java Project

Task Management Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
0. Exit
Enter your choice: 2

Tasks:
1. Complete Java Project [Pending]

Task Management Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
0. Exit
Enter your choice: 3
Enter the task number to mark as completed: 1

Task marked as completed: Complete Java Project

Task Management Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
0. Exit
Enter your choice: 2

Tasks:
1. Complete Java Project [Completed]

Task Management Menu:
1. Add Task
2. View Tasks
3. Mark Task as Completed
0. Exit
Enter your choice: 0

Exiting Task Management...
```

**Project Scope:**
TaskManagement serves as a starting point for building a more robust task management application. While it operates within the console environment, future iterations could include expanding the user interface to a graphical format using JavaFX or Swing. Additionally, features like saving tasks to a file for persistence, enabling user authentication, and adding task prioritization could be incorporated to create a more comprehensive task management solution.

Overall, TaskManagement demonstrates how Java can be utilized to develop practical, command-line-based tools for everyday use, and it lays the groundwork for building more sophisticated applications to meet users' organizational needs.
