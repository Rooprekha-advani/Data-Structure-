package Lab08;

import java.util.Scanner;
import java.util.Stack;

class UndoRedo {
    Stack<String> mainStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    // Insert a new action
    void insert(String action) {
        mainStack.push(action);
        redoStack.clear(); // Clear redo stack when a new action is added
        System.out.println("Inserted: " + action);
    }

    // Undo the last action
    void undo() {
        if (!mainStack.isEmpty()) {
            String action = mainStack.pop();
            redoStack.push(action);
            System.out.println("Undo: " + action);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo the last undone action
    void redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            mainStack.push(action);
            System.out.println("Redo: " + action);
        } else {
            System.out.println("Nothing to redo.");
        }
    }


    void display() {
        System.out.println("Stack contents: " + mainStack);
    }
}

public class UndoRedoProgram {
    public static void main(String[] args) {
        UndoRedo undoRedo = new UndoRedo();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nPlease enter your choice: (1 for insert, 2 for undo, 3 for redo, 4 for display stack, 0 to exit)");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter action to insert: ");
                    String action = scanner.nextLine();
                    undoRedo.insert(action);
                    break;
                case 2:
                    undoRedo.undo();
                    break;
                case 3:
                    undoRedo.redo();
                    break;
                case 4:
                    undoRedo.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    return;
                 default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
