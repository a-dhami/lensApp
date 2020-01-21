import ca.assignment1.model.Lens;
import ca.assignment1.model.LensManager;
import ca.assignment1.textui.CameraTextUI;


public class Main {
    public static void main (String args[]) {

        LensManager manager = new LensManager();
        //manager.add(new Lens("canon", 2.3, 4));
        //manager.add(new Lens("Nikon", 2.2, 33));

        //Lens l = manager.get(1);
        //System.out.println(manager.get(1).getFocalLength());



        CameraTextUI ui = new CameraTextUI(manager);
        ui.show();

      }

    }