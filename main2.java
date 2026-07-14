class person{
    String name ;

    void showName(){
        System.out.println(name);
    }
}
class emp extends person{
    int salary;
    void showSalary(){
        System.out.println(salary);
    }
}
class developer extends emp{
    String langauge;
    void showlanguage(){
        System.out.println(langauge);
    }
}
public class main2 {
    public static void main(String[] args) {
        developer dev =new developer();

        dev.name ="ashish";
        dev.salary=120000;
        dev.langauge= "Java";

        dev.showName();
        dev.showSalary();
        dev.showlanguage();

    }
}
