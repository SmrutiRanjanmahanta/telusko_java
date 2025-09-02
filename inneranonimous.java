// public class inneranomius {
//     public static void main(String[] args) {
//         computer c=new computer(){
//             void mnc(){
//                 System.out.println("rr");
//             }
//         };
        
//         computer.pc inner=c.new pc();
//         inner.sum(); 
//     }
// }
// class computer{
//   int x=23;
//   class pc{
//     void sum(){
//         System.out.println(x);
//     }
//   }
// }


class student{
    void run(){
        System.out.println("Something is cooking");
    }
}

public class inneranonimous{
    public static void main(String[] args) {
        student s=new student(){
            void run(){
                System.out.println("Something Big is cooking");
            }
        };
        s.run();
    }
}