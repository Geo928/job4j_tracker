package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class AttachmentComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Attachment left = (Attachment) o1;
        Attachment right = (Attachment) o2;
        return Integer.compare(left.getSize(), right.getSize());
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList() {
            @Override
            public boolean add(Object o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
    }
}
