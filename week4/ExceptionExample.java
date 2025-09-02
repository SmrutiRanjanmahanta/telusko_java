
class passfailException extends Exception{
    passfailException(String message){
        super(message);
    }
}
public class ExceptionExample {  // file name: ExceptionExample.java
    static void mark(int mark) throws passfailException{
        if(mark>88){
            throw new passfailException("you will pass");
        }else{
            System.out.println("you will fail");
        }
    }
    public static void main(String[] args) {
        try{
            mark(99);
        }catch(passfailException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
