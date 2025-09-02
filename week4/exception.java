public class exception{
    public static void main(String[] args) {
        int i=0;
        int j=13;
        String src=new String("Smruti");
        int arr[]=new int[5];
        try{
            int res=j/i;
            int s=arr[3];
            char m=src.charAt(7);
            
        }catch(ArithmeticException e){
            System.out.println("Arithmatic ");
        }
        catch(ArrayIndexOutOfBoundsException m){
            System.out.println("Array out of bound ");
        }
        catch(StringIndexOutOfBoundsException f){
            System.out.println("String out of bound ");
        }
        catch(Exception e){
            System.out.println("the error is very bad");
        }
        
    }
}