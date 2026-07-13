class Student {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class enc {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("password");
        System.out.println(s.getName());
    }
}