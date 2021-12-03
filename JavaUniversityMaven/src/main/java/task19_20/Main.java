package task19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    private static String generateAutoNum(){
        char[] lit = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        int num = (int)(1 + Math.random()*8.999);
        return lit[(int)(Math.random()*lit.length)] + String.valueOf(num*111) + lit[(int)(Math.random()*lit.length)]
                + lit[(int)(Math.random()*lit.length)] + (int)(1 + Math.random()*198.999);
    }

    public static void main(String[] args)
    {
        ArrayList<String> autoNums = new ArrayList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for(int i = 0; i < 2000000; i++)
            autoNums.add(generateAutoNum());
        String find = autoNums.get((int)(Math.random()*2000000));
        //find = autoNums.get(1000000);
        System.out.println(find);

        long m = System.currentTimeMillis();
        autoNums.contains(find);
        System.out.println("Array list: " + (System.currentTimeMillis() - m) + " ms");
        System.out.println(autoNums.contains(find));

        Collections.sort(autoNums);
        m = System.currentTimeMillis();
        Collections.binarySearch(autoNums, find);
        System.out.println("Binary search: " + (System.currentTimeMillis() - m) + " ms");
        System.out.println(Collections.binarySearch(autoNums, find));

        hashSet.addAll(autoNums);
        m = System.currentTimeMillis();
        hashSet.contains(find);
        System.out.println("HashSet: " + (System.currentTimeMillis() - m) + " ms");
        System.out.println(hashSet.contains(find));

        treeSet.addAll(autoNums);
        m = System.currentTimeMillis();
        treeSet.contains(find);
        System.out.println("TreeSet: " + (System.currentTimeMillis() - m) + " ms");
        System.out.println(treeSet.contains(find));
    }
}
