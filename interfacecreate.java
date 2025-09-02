public class interfacecreate{
    public static void main(String[] args) {
        A obj=new b();
        obj.conflig();
        obj.run();
    }
}

interface A{
    void run();
    void conflig();
    int age=44;
    String s="Smruti";

}

class b implements A{
   public void run(){
    System.out.println("inshow");
    }

   @Override
   public void conflig() {
    System.out.println("in run");
   
   }
}