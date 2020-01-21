/**
 * This class is responsible for the UI of the program.
 */

package ca.assignment1.textui;

import ca.assignment1.model.LensManager;

import java.util.Scanner;

public class CameraTextUI {

    private static final double COC = 0.029;
    private LensManager manager;

    public CameraTextUI(LensManager manager) {
        this.manager = manager;
    }

    public void show() {
        boolean isDone = false;
        while (!isDone) {
            System.out.println("Lenses to pick from: ");

            int counter = 0;
            for (Object l : manager) {
                System.out.println(counter ".  " + l);
                counter++;
            }
            System.out.println("(-1 to exit)");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice == -1) {
                isDone = true;
            }
            else if (choice >= counter) {
                System.out.println("Error: Invalid lens index.");
                continue;
            }

            System.out.println("Aperture [the F number: ");
            int aperture = in.nextDouble();
            if (aperture < manager.get(counter).getMaxAperture()) {
                System.out.println("ERROR: This aperture is not possible with this lens");
                continue;
            }

            System.out.println(" Distance to subject [m]: ");
            int subjectDistance = in.nextDouble();









            }
        }
    }
}
