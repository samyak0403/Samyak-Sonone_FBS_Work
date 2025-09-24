#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {
    char playerName[20];
    char playerRole[10];
    int jerseyNo;
    int matches;
    int wickets;
    int totalRuns;
} Team;

Team *players = NULL;
int playerCount = 0;

void add_player() {
    Team *tmp = realloc(players, (playerCount + 1) * sizeof(Team));
    if (!tmp) {
        printf(" Cannot add more players.\n");
        return;
    }
    players = tmp;
    printf("Enter details for new player:\n");
    printf("Name: ");
    scanf("%19s", players[playerCount].playerName);
    printf("Role: ");
    scanf("%9s", players[playerCount].playerRole);
    printf("Jersey No: ");
    scanf("%d", &players[playerCount].jerseyNo);
    printf("Matches Played: ");
    scanf("%d", &players[playerCount].matches);
    printf("Wickets: ");
    scanf("%d", &players[playerCount].wickets);
    printf("Runs: ");
    scanf("%d", &players[playerCount].totalRuns);
    playerCount++;
    printf("Player added successfully.\n");
}

void remove_player() {
    if (playerCount == 0) {
        printf("No players to remove.\n");
        return;
    }
    int jersey;
    printf("Enter Jersey No of player to remove: ");
    scanf("%d", &jersey);
    int found = -1;
    for (int i = 0; i < playerCount; i++) {
        if (players[i].jerseyNo == jersey) {
            found = i;
            break;
        }
    }
    if (found == -1) {
        printf("Player not found!\n");
        return;
    }
    for (int i = found; i < playerCount - 1; i++) {
        players[i] = players[i + 1];
    }
    playerCount--;
    Team *tmp = realloc(players, playerCount * sizeof(Team));
    if (tmp || playerCount == 0) {
        players = tmp;
    }
    printf("Player removed successfully.\n");
}

void search_player() {
    if (playerCount == 0) {
        printf("No players available.\n");
        return;
    }
    int jersey;
    int found = 0;
    while (!found) {
        printf("Enter Jersey No of player to search: ");
        scanf("%d", &jersey);
        for (int i = 0; i < playerCount; i++) {
            if (players[i].jerseyNo == jersey) {
                printf("\n--- Player Found ---\n");
                printf("Name = %s\n", players[i].playerName);
                printf("Role = %s\n", players[i].playerRole);
                printf("Jersey No = %d\n", players[i].jerseyNo);
                printf("Matches = %d\n", players[i].matches);
                printf("Wickets = %d\n", players[i].wickets);
                printf("Runs = %d\n", players[i].totalRuns);
                found = 1;
                break;
            }
        }
        if (!found) {
            printf("Player not found. Please try again.\n");
        }
    }
}

void update_player() {
    int jersey;
    printf("Enter Jersey No of player to update: ");
    scanf("%d", &jersey);
    for (int i = 0; i < playerCount; i++) {
        if (players[i].jerseyNo == jersey) {
            printf("Update details for %s:\n", players[i].playerName);
            printf("New Name: ");
            scanf("%19s", players[i].playerName);
            printf("New Role: ");
            scanf("%9s", players[i].playerRole);
            printf("New Matches: ");
            scanf("%d", &players[i].matches);
            printf("New Wickets: ");
            scanf("%d", &players[i].wickets);
            printf("New Runs: ");
            scanf("%d", &players[i].totalRuns);
            printf("Player updated successfully.\n");
            return;
        }
    }
    printf("Player not found.\n");
}

void display_player() {
    int jersey;
    printf("Enter Jersey No of player to display: ");
    scanf("%d", &jersey);
    for (int i = 0; i < playerCount; i++) {
        if (players[i].jerseyNo == jersey) {
            printf("\n--- Player Info ---\n");
            printf("Name = %s\n", players[i].playerName);
            printf("Role = %s\n", players[i].playerRole);
            printf("Jersey No = %d\n", players[i].jerseyNo);
            printf("Matches = %d\n", players[i].matches);
            printf("Wickets = %d\n", players[i].wickets);
            printf("Runs = %d\n", players[i].totalRuns);
            return;
        }
    }
    printf("Player not found.\n");
}

void display_all() {
    if (playerCount == 0) {
        printf("No players to display.\n");
        return;
    }
    printf("\n--- All Players ---\n");
    for (int i = 0; i < playerCount; i++) {
        printf("\nPlayer %d:\n", i + 1);
        printf("Name = %s\n", players[i].playerName);
        printf("Role = %s\n", players[i].playerRole);
        printf("Jersey No = %d\n", players[i].jerseyNo);
        printf("Matches = %d\n", players[i].matches);
        printf("Wickets = %d\n", players[i].wickets);
        printf("Runs = %d\n", players[i].totalRuns);
    }
}

int main() {
    int choice;
    do {
        printf("\nMenu:\n");
        printf("1. Add Player\n");
        printf("2. Remove Player\n");
        printf("3. Search Player\n");
        printf("4. Update Player\n");
        printf("5. Display Player\n");
        printf("6. Display All Players\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: add_player(); break;
            case 2: remove_player(); break;
            case 3: search_player(); break;
            case 4: update_player(); break;
            case 5: display_player(); break;
            case 6: display_all(); break;
            case 0: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while (choice != 0);

    free(players);
    return 0;
}
