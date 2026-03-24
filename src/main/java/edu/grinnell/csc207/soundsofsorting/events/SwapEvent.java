package edu.grinnell.csc207.soundsofsorting.events;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T>{
    private int i;
    private int j;

    public SwapEvent(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void apply(T[] arr) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> getAffectedIndices() {
        List<Integer> l = new ArrayList<>();
        l.add(i);
        l.add(j);
        return l;
    }

    public boolean isEmphasized() {
        return true;
    }
}
