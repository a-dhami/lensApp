/**
 *  This class contains the Lens Manager that is responsible for managing a collection of lenses
 */

package ca.assignment1.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LensManager<Lenses> implements Iterable<Lens> {
    private List<Lens> lenses = new ArrayList<>();

    public void add(Lens lens){
        lenses.add(lens);
    }

    public Lens get(int l)
    {
        return lenses.get(l);
        //return new double[] {lenses.get(l).getMaxAperture(), lenses.get(l).getFocalLength()};
    }

    @Override
    public Iterator<Lens> iterator() {
        return lenses.iterator();
    }
}
