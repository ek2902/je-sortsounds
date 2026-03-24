package edu.grinnell.csc207.soundsofsorting.events;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {
    private int i;
    private int j;

    public CompareEvent(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void apply(T[] arr) {
        
    }

    public List<Integer> getAffectedIndices() {
        List<Integer> l = new ArrayList<>();
        l.add(i);
        l.add(j);
        return l;
    }

    public boolean isEmphasized() {
        return false;
    }
}
