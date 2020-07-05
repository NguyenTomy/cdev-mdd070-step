package list_linkedlist;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._1_sanspattern.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleUsage {

    public static void main(String[] args) {
        System.out.println("ArrayMaList :");
        ArrayMaList arrayMaList = new ArrayMaList();

        arrayMaList.add("1");
        arrayMaList.add("2");
        arrayMaList.add("3");
        arrayMaList.add("4");
        arrayMaList.add("5");

        arrayMaList.add(1,"maList1");
        arrayMaList.add(4,"maList2");

        for (Iterator<String> IteratorArray = arrayMaList.iterator(); IteratorArray.hasNext();){
            String element = IteratorArray.next();
            System.out.println(element);
        }

        System.out.println("---------------");
        System.out.println("---------------");

        System.out.println("LinkedMaListe :");
        // LinkedList :
        LinkedMaList linkedMaList = new LinkedMaList();
        linkedMaList.add("1");
        linkedMaList.add("2");
        linkedMaList.add("3");
        linkedMaList.add("4");
        linkedMaList.add("5");
        linkedMaList.add("6");

        linkedMaList.add(1, "maList1");
        linkedMaList.add(3, "maList2");

        for (Iterator<String> IteratorArray = linkedMaList.iterator(); IteratorArray.hasNext();) {
            String element = IteratorArray.next();
            System.out.println(element);
        }
    }
}
