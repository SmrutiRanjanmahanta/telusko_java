import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class steamapi {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,6,7,2,6,3);
        // List<Integer> nums1=Arrays.asList(4,7,9,10);
        // Stream<Integer> s1=nums.stream();
       
        // Stream<Integer> s2=s1.filter(n->n%2==0);
         
        // Stream<Integer> s3=s2.map(n->n*2);

        // int result=s3.reduce(0, (c,e)->c+e);
        // int result=nums.stream()
        //             .filter(n->n%2==0)
        //             .map(n->n*2)
        //             .reduce(0,(c,e)->c+e);

        // System.out.println(result);


        // int sum=0;
        // for(int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum=sum+n;
        //     }
        // }
        // System.out.println(sum);


        // nums1.forEach((m)->{
        //     System.out.println(m*3);
        // });

        // Predicate<Integer> p=new Predicate<Integer>() {

           
            // public boolean test(Integer n) {
            //     if(n%2==0)
            //     return true;
            //     else
            //         return false;
                
               
            // // }
            
        // };

        // int result=nums.stream()
        //             .filter(n->n%2==0)
        //             .map(n->n*2)
        //             .reduce(0,(c,e)->c+e);

        // System.out.println(result);

        Stream<Integer> sortedvalue=nums.stream()
                                        .filter(n->n%2==0).sorted();
        sortedvalue.forEach((n)->System.out.println(n));


    }
}
