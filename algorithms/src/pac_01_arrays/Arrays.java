package pac_01_arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        // ArrayLists use standard arrays under the hood
        // capacity = 10
        List<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        System.out.println(names);

        // O(N)
//        System.out.println(names.remove(0));
//        System.out.println(names.get(0));
        System.out.println(names.size());

        for(String name: names)
            System.out.println(name);



        System.out.println("=================================================");
        // arrays are not dynamic data structures - we have to define the size in advance
        int[] nums = new int[10];

        // random indexing: we can use the indexes of the array slots
        // 0(1)
        for(int i=0; i<10;++i)
            nums[i] = i;

        // we know the index of the item we want to manipulate
        nums[0] = 101;

        // if we do not know the index of the item (search)
        // linear search 0(N) - if we do not know the index of the item we are looking for
        // we want to find the index of item 6
        int lookFor = 6;
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if(nums[i] == lookFor) {
                System.out.println("We have found the item at index: " + i);
                break;
            }
        }


        for(int i=0; i<10;++i)
            System.out.println(nums[i]);
    }
}
