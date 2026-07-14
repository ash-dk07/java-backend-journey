class claculator{

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add (float a,float b){
        return a+b;
    }
}
public class main3 {
    public static void main(String[] args) {
        claculator calc =new claculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5,6,7));
        System.out.println(calc.add(2.3f,5.9f));
    }
}
