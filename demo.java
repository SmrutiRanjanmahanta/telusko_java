enum laptop{
    hp(6000),mac(7000),lenovo(2000),russian(4000);
    private int price;
    private laptop(int price){
        this.price=price;
    }
    public int getname(){
        return price;
    }
}

public class demo{
    public static void main(String[] args) {
        laptop lap=laptop.hp;
        System.out.println(lap+" "+lap.getname());
    }
}
