
import java.util.*;

public class Program {

    public static void main(String[] args) {

        MyHashSet<Integer> mySet = new MyHashSet<>();

        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.add(50);
        mySet.add(60);
        mySet.add(70);
        mySet.add(80);
        mySet.add(90);

        System.out.println(mySet);
        System.out.println("-".repeat(20));

        mySet.remove(70);

        System.out.println(mySet);
        System.out.println("-".repeat(20));

        Iterator<Integer> integerIterator = mySet.iterator();
        while (integerIterator.hasNext()) {
            System.out.printf("%d ", integerIterator.next());
        }

        System.out.println();

        System.out.println(mySet.get(0));
        System.out.println(mySet.get(6));
        System.out.println(mySet.get(9));

    }
}
class MyHashSet<T>{
    private HashMap<T, Object> myMap = new HashMap<>();
    private static final Object myObject = new Object();


    public boolean add(T value) {
        return myMap.put(value, myObject) == null;
    }

    public boolean remove(T value){
        return myMap.remove(value) == myObject;
    }

    public String toString(){
        return myMap.keySet().toString();
    }

    public Iterator<T> iterator(){
        return myMap.keySet().iterator();
    }

    public T get(Integer index){
        ArrayList<T> myset = new ArrayList<>();
        for (T i: myMap.keySet()
             ) {
            myset.add(i);
        }
        if (myset.size() < index) return null;
        return myset.get(index);

    }


}
