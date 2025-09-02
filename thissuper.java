public class thissuper {
    public static void main(String[] args) {
        a c=new b();
    }
}
class a{
    public a(){
        System.out.println("In A");
    }
    public a(int n){
        System.out.println("INT A");
    }
}
class b extends a{
    public b(){
        this(6);
        System.out.println("IN B");
    }
    b(int n){
        super(5);
        System.out.println("B in int");
    }
}

