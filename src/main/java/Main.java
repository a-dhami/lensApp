import ca.assignment1.model.Lens;
import ca.assignment1.model.LensManager;


public class Main {
    public static void main (String args[]) {
      //System.out.println("Hello World, please work!");

      //Lens lens = new Lens("Canon", 12,13);
        //System.out.println("Lens's toString: " + lens);

      LensManager manager = new LensManager();
      manager.add(new Lens("Canon", 1.8, 50));
      manager.add(new Lens("Tamron", 2.8, 90));
      manager.add(new Lens("Sigma", 2.8, 200));
      manager.add(new Lens("Nikon", 4, 200));

      for (Object l : manager){
          System.out.println("Lens is " + l);
      }

    }
}

