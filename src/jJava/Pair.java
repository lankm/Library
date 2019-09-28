package jJava;

public class Pair<E extends Comparable> {
    private E top;
    private E bottom;

    public Pair(E varOne, E varTwo) {
        if(varOne.compareTo(varTwo)<0) {
            bottom = varOne;
            top = varTwo;
        } else {
            top = varOne;
            bottom = varTwo;
        }

    }

    public E getBottom() {
        return bottom;
    }
    public E getTop() {
        return bottom;
    }

    public void setBottom(E var) {
        bottom = var;
    }
    public void setTop(E var) {
        top = var;
    }

    public boolean isInsideInclusive(E var) {
        if(bottom.compareTo(var)<=0&&top.compareTo(var)>=0)
            return true;
        return false;
    }
    public boolean isInsideExclusive(E var) {
        if(bottom.compareTo(var)<0&&top.compareTo(var)>0)
            return true;
        return false;
    }
    public boolean isOutsideInclusive(E var) {
        return !isInsideExclusive(var);
    }
    public boolean isOutsideExclusive(E var) {
        return !isInsideInclusive(var);
    }
}
