public class destop {
    public static void main(String[] args) {
        computer c=new computer();
        Innerdestop dep=new Innerdestop();
        dep.devapp(c);
    }
}
class computer{
    public void code(){
        System.out.println("Code ,run ,Copiler");
    }
}
 class Innerdestop {
    public void devapp(computer c){
        c.code();
    }
    
}