package jJava;

public class JArrays {
    public static <E> E[] add(E[] o1,E[] o2) {
        E[] output = (E[]) new Object[o1.length+o2.length];
        int i = 0;
        for(;i<o1.length;i++)
            output[i] = o1[i];
        for(int j = 0;j<o2.length;j++)
            output[i+j] = o2[j];
        return output;
    }
}
