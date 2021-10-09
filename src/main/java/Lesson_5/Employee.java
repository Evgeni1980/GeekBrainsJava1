package Lesson_5;

public class Employee {
    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String email;
    private String tel;
    private int salary;
    int age;

    public Employee(String surname, String name, String middleName, String position, String email,
                    String tel, int salary, int age){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + middleName+ "\n" +
                "Должность: " + position + "\n" + "email:     " + email + "\n" +
                "Телефон:   " + tel + "\n" + "Зарплата:  " + salary + "\n" +
                "Возраст:   " + age + "\n");
    }



}
