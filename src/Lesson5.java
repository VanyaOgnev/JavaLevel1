package Lesson5;

public class Lesson5 {

        public static void main(String[] args) {
            Employee[] empCorp = new Employee[5];
            empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@gmail.com", "356987655",55000,39);
            empCorp[1] = new Employee("Vetoh Petr", "Developer", "vetoh@gmail.com", "892312314",60000,35);
            empCorp[2] = new Employee("Kozov Kolia", "HR", "kozov@gmail.com", "892312315",15000,48);
            empCorp[3] = new Employee("Kykychka Nadegda", "BA", "kykychka@gmail.com", "892312316",8000,19);
            empCorp[4] = new Employee("Kuk J", "JuniorQA", "kuk@gmail.com", "892312317",5000,28);
            for (Employee employee : empCorp)
                if (employee.getAge()>40)
                    System.out.println(employee);

        }
    }
    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }

