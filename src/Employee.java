public class Employee {
    private String FullName;
    private String Position;
    private String Email;
    private String PhoneNumber;
    private int Salary;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        FullName = fullName;
        Position = position;
        Email = email;
        PhoneNumber = phoneNumber;
        Salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(FullName + " " + Position + " " + Email + " " + PhoneNumber + " " + Salary + " " + age);
    }

    public int getAge() {
        return age;
    }


}



