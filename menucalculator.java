import java.util.Scanner;
public class menucalculator {
    

    public static void main(String[] args) {
       System.out.println("Calculator");
       System.out.println("1.Add");
       System.out.println("2.sub");
       System.out.println("3.mul");
       System.out.println("4.div");
       System.out.println("5.Square");
       System.out.println("6.riminder");
       System.out.println("7.exit");
       Scanner sc=new Scanner(System.in);
    
       while(true){
        System.out.println("enter any choice");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter 1st no");
                int a=sc.nextInt();
                System.out.println("enter 2nd no");
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("sum is:"+sum);
                break;
                case 2:
                System.out.println("enter 1st no");
                int c=sc.nextInt();
                System.out.println("enter 2nd no");
                int d=sc.nextInt();
                int sub=c-d;
                System.out.println("sub is:"+sub);
                break;            
                case 3:
                System.out.println("enter 1st no");
                int e=sc.nextInt();
                System.out.println("enter 2nd no");
                int f=sc.nextInt();
                int mul=e*f;
                System.out.println("mul is:"+ mul);
                break;
                case 4:
                System.out.println("enter 1st no");
                int g=sc.nextInt();
                System.out.println("enter 2nd no");
                int h=sc.nextInt();
                int div=g/h;
                System.out.println("div is:"+div);
                break;
                case 5:
                System.out.println("enter 1st no");
                int m=sc.nextInt();
                int square=m*m;
                System.out.println("square  is:"+square);
                break;
                case 6:
                System.out.println("enter 1st no");
                int o=sc.nextInt();
                System.out.println("enter 2nd no");
                int p=sc.nextInt();
                int rem=o%p;
                System.out.println("sum is:"+rem);
                break;
                case 7:
                System.out.println("you want to start it or not y/n");
                String s=sc.next();
                if(s=="y"){
                    return;
                }else{
                    System.out.println("Calculator");
                    System.out.println("1.Add");
                    System.out.println("2.sub");
                    System.out.println("3.mul");
                    System.out.println("4.div");
                    System.out.println("5.Square");
                    System.out.println("6.riminder");
                    System.out.println("7.exit");
                }
        
            default:
            System.out.println("enter a vailed input");
                break;
        }
       }
    }
}
