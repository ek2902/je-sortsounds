package edu.grinnell.csc207.soundsofsorting.events;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T>{
    private T elt;
    private int i;

    public CopyEvent(int i, T elt) {
        this.i = i;
        this.elt = elt;
    }

    public void apply(T[] arr) {
        arr[i] = elt;
    }

    public List<Integer> getAffectedIndices() {
        List<Integer> l = new ArrayList<>();
        l.add(i);
        return l;
    }

    public boolean isEmphasized() {
        return true;
    }
}
