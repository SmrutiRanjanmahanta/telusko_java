
@FunctionalInterface
interface ram{
    int sow(int i,int j);
}

public class returnlambda {
    public static void main(String[] args) {
        ram r=(i,j)->{
           return i+j;
        };
        int result=r.sow(23, 2);
        System.out.println(result);
    }
}


