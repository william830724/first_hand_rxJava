package ch2_2;

public class StringArrayIterator implements  Iterator{

    private String[] stringArr;
    private int position;

    //Constructor
    public StringArrayIterator(String[] stringArr){
        this.stringArr = stringArr;
    }

    //if position in array  < array length
    // && position in the stringArr != null
    @Override
    public boolean hasNext() {
        return position < stringArr.length
                && stringArr[position] != null;
    }

    //return the next element;
    @Override
    public Object next() {
        String str = stringArr[position];

        position += 1;

        return str;
    }
}
