import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class newrestler {
    public static void main(String[] args) {
        //throws 
try{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any name");
        String name=b.readLine();
        System.out.println("enter age ");
        int age=Integer.parseInt(b.readLine());
}catch(IOException e){
    System.out.println(e);
}
    }
}
