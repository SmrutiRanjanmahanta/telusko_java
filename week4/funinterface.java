

public class funinterface {
    public static void main(String[] args) {
        A obj=(int c)->{
            System.out.println("nice to meet you  `zss"+c);
        };
        obj.show(5);
    }
}
@FunctionalInterface
interface A{
    void show(int c);
}