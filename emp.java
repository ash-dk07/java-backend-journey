class employee{
    private String name;
    private int salary;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
        int getSalary(){
            return salary;
        }
    }




public class emp {
    public static void main(String[] args) {
        employee e =new employee();
        e.setName("Ashish");
        e.setSalary(19820);
        System.out.println(e.getName()+" got "+e.getSalary());
    }
}
