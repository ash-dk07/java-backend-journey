import java.security.PrivateKey;

class iphone{

    private String brand ;
    private int price;

    void setBrand(String brand){
        this.brand =brand;
    }
   void setprice(int price){
        if(price>=0){
            this.price=price;
        }else{
            System.out.println("price is not in negative");
        }
   }

   String getBrand(){
        return brand;
   }
    int getPrice(){
        return price;
    }
}

public class mobile {
    public static void main(String[] args) {
        iphone x =new iphone();
        x.setBrand("iphone 17 pro");
        x.setprice(79000);

        System.out.println(x.getBrand()+" is only for "+ x.getPrice() );
    }

}
