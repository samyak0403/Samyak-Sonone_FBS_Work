
//implement a struture a store to store task deatils (task id ,description and status ).
//write a menu driven program to update to add, update , and display tasks 
//use function for each operation .
#include<stdio.h>
#include <stdio.h>
#include <string.h>

#define MAX_TASKS 100

struct Task {
    int taskId;
    char description[100];
    char status[20];
};

struct Task tasks[MAX_TASKS];
int taskCount = 0;

void addTask() {
    if (taskCount >= MAX_TASKS) {
        printf("Task list is full!\n");
        return;
    }

    printf("\nEnter Task ID: ");
    scanf("%d", &tasks[taskCount].taskId);

    printf("Enter Task Description: ");
    scanf("%s", tasks[taskCount].description);

    printf("Enter Task Status (Pending/In_Progress/Completed): ");
    scanf("%s", tasks[taskCount].status);

    taskCount++;
    printf("Task added successfully!\n");
}

void updateTask() {
    int id, found = 0;
    printf("\nEnter Task ID to update: ");
    scanf("%d", &id);

    for (int i = 0; i < taskCount; i++) {
        if (tasks[i].taskId == id) {
            printf("Current Status: %s\n", tasks[i].status);
            printf("Enter new Status: ");
            scanf("%s", tasks[i].status);
            printf("Task updated successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Task with ID %d not found.\n", id);
    }
}

void displayTasks() {
    if (taskCount == 0) {
        printf("\nNo tasks available.\n");
        return;
    }

    printf("\n--- Task List ---\n");
    for (int i = 0; i < taskCount; i++) {
        printf("Task ID: %d\n", tasks[i].taskId);
        printf("Description: %s\n", tasks[i].description);
        printf("Status: %s\n", tasks[i].status);
        printf("-------------------\n");
    }
}

int main() {
    int choice;

    do {
        printf("\n--- Task Management Menu ---\n");
        printf("1. Add Task\n");
        printf("2. Update Task Status\n");
        printf("3. Display All Tasks\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            addTask();
        }
        else if (choice == 2) {
            updateTask();
        }
        else if (choice == 3) {
            displayTasks();
        }
        else if (choice == 4) {
            printf("Exiting program.\n");
        }
        else {
            printf("Invalid choice! Try again.\n");
        }

    } while (choice != 4);

    return 0;
}
