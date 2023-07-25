package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PseudoSet<Integer> ps = new PseudoSet<>();
        System.out.println(ps.addEl(5));
        System.out.println(ps.addEl(7));
        System.out.println(ps.toStringCol());
        //System.out.println(ps.removeEl(7));
        Iterator<Integer> iterat = ps.iterator();
        while (iterat.hasNext()){
            System.out.println(iterat.next());
        }
        System.out.println(ps.getByIndex(1));
    }
}