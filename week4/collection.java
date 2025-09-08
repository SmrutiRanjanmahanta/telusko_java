import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {
    public static void main(String[] args) {
    //    Comparator<Student> com=new Comparator<Student>(){

        
    //     public int compare(Student o1, Student o2) {
    //         if(o1.age>o2.age){
    //             return 1;
    //         }else{
    //             return -1;
    //         }
    //     }

    //    };
    
        List<Student> nums=new ArrayList<>();

        nums.add(new Student("Smruti", 16));
        nums.add(new Student("ajjubhai", 25));
        nums.add(new Student("amitbhai", 41));
        nums.add(new Student("jonnybhai", 35));
        Collections.sort(nums);
       
        for(Student s:nums){
            System.out.println(s);
        }
       
    }
}
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "[ Age--"+age+" name--"+name+" ]";
    }
    public int compareTo(Student that) {
            if(this.age>that.age){
                return 1;
            }else{
                return -1;
        }
    }
}


