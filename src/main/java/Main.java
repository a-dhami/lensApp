public class Main {
    public static void main (String args[]) {
      System.out.println("Hello World, please work!");

      LensManager manager = new LensManager();
      CameraTextUI ui = new CameraTextUI(manager);
      ui.show();
    }
}

