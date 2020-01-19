/**
 * This class is responsible for the UI of the program.
 */

package ca.assignment1.textui;

import ca.assignment1.model.LensManager;

import java.util.Scanner;

public class CameraTextUI {
    private LensManager manager;

    public CameraTextUI(LensManager manager) {
        this.manager = manager;
    }

    public void show() {
        boolean isDone = false;
        while (isDone) {
            System.out.println("ENTER OPTION (1= add, 2=list, 3= quit) : ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println();
            }
        }
    }
}
