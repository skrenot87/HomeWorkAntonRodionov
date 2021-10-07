public class MainApp {
    public static void main(String[] args) {


        Employee[] employees = {
                new Employee("Vasiliy", "manager", "vasiliy@gmail.com", "89261574531", 270000, 42),
                new Employee("Valentina", "cook", "valentina@gmail.com", "89175698421", 57000, 24),
                new Employee("Alex", "storekeeper", "lex@gmail.com", "8957575463", 90000, 28),
                new Employee("Ivan", "technologist", "ivan@gmail.com", "89246547891", 120000, 45),
                new Employee("Petr", "chief technologist", "petr@gmail.com", "89758423654", 145000, 30),
        };
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}
