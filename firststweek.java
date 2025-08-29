class calculator{
    public int sum(int n1,int n2){
        int res=n1+n2;
        System.out.println(res);
        return res;
    }
    public void display(String name,String currentyear,long reg,int age,int year,String college){
       System.out.println("*****************About me********************");
        System.out.println("name:"+name);
        System.out.println("Current year ::"+currentyear);
        System.out.println("Registation No::"+reg);
        System.out.println("Age::"+age);
        System.out.println("year:"+year);
        System.out.println("College:"+college);
        System.out.println("***********************Thankyou for Visiting ********************");
    }
    //method -overloading
    

}
public class firststweek{
    public static void main(String[] args){
        calculator c=new calculator();
        System.out.println(c.sum(67,33));
       c.display("Smrutiranjan Mahanta","3rd Year", 2301298226l, 20,   2025, "Gift Autonomous");
    }
}

///jdk ,jre,jvm
/// 
/// //
/// 
/// Class = Blueprint

//Object = Instance of class

//new keyword is used to create an object

//Objects have state (variables) and behavior (methods)