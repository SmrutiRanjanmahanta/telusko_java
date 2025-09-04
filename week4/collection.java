import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {
    public static void main(String[] args) {
        // List<Integer> nums=new ArrayList<Integer>();
        // nums.add(3);
        // nums.add(4);
        // nums.add(7);
        // nums.add(8);
        // nums.add(11);
        // System.out.println(nums.get(0));

        // for(int i:nums){
        //     System.out.println(i);
        // }

        // Set<Integer> nums=new HashSet<Integer>();
        // nums.add(4);
        // nums.add(4);
        // nums.add(3);
        // nums.add(7);
        // nums.add(10);

        // for(int i:nums){
        //    System.out.println(i);
        // }

        Map <String,Integer> student=new HashMap<>();
        student.put("smruti", 23);
        student.put("raistar", 25);
        student.put("salik", 76);
        student.put("martin", 43);
        System.out.println(student);
       
    }
}
