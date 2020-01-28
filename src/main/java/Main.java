import ca.assignment1.model.Lens;
import ca.assignment1.model.LensManager;
import ca.assignment1.textui.CameraTextUI;


public class Main {
    public static void main (String args[]) {

        LensManager manager = new LensManager();

        CameraTextUI ui = new CameraTextUI(manager);
        ui.show();

      }

    }