import java.util.*;

public class super_keyword {

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public void introduce() {
            System.out.println("I am a person. My name is: " + name);
        }
    }

    static class Employee extends Person {
        String name;   

        public Employee(String fullName, String nickname) {
            super(fullName);     
            this.name = nickname;
        }

        @Override
        public void introduce() {
            super.introduce();    
            System.out.println("People call me: " + name);
        }

        public void showNames() {
            System.out.println("Parent's name (super.name): " + super.name); 
            System.out.println("Child's nickname (this.name): " + this.name);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Tariqul Islam", "Tariq");

        System.out.println("---- introduce() ----");
        emp.introduce();

        System.out.println("\n---- showNames() ----");
        emp.showNames();
    }
}