package list_linkedlist;

import java.util.Iterator;

public class listIterator implements Iterator<String> {

    private MaList maList;
    private int index;

    public listIterator(MaList maList) {
        this.maList = maList;
    }

    public Iterator getIterator() {
        return new listIterator(maList);
    }

    @Override
    public boolean hasNext() {

        if(index < maList.size()){
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return maList.get(index++);
        }
        return null;
    }
}

