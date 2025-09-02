public class enum12{
    public static void main(String[] args) {
        int i=6;
        Status s=Status.pending;
        // if(s==Status.running){
        //     System.out.println("running ");
        // }else if(s==Status.pending){
        //     System.out.println("Pending..");
        // }else if(s== Status.recived){
        //     System.out.println("recived");
        // }
        // else{
        //     System.out.println("Done");
        // }
        switch (s){
            case running:
            System.out.println("All running ");
            break;
            case Success:
            System.out.println("All Sucess ");
            break;
            case pending:
            System.out.println("All pending ");
            break;
            case Failed:
            System.out.println("All Failed ");
            break;
            default :
            System.out.println("Please Wait");
            break;
        }
           
    }
}
enum Status{
    pending,recived ,Failed,Success,running;
}