package Lesson_5;

public class Person {

    public static void main(String[] args) {
        Employee person = new Employee("Иванов", "Иван", "Иванович",
                "Инженер", "Ivan@gmail.com", "168432579", 30000, 35);

        person.info();

        System.out.println();


        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Петров", "Василий", "",
                "Конструктор", "svr@mailbox.com", "597843165", 28000, 42);

        persArray[1] = new Employee("Иванов", "Иван", "Иванович",
                "Инженер", "Ivan@gmail.com", "168432579", 30000, 35);

        persArray[2] = new Employee("Сидоров", "Александр", "Петрович",
                "Инженер", "sidorov@gmail.com", "168432579", 30000, 39);

        persArray[3] = new Employee("Баширов", "Василий", "Александрович",
                "Инженер", "gru@mail.ru", "597843165", 28000, 41);

        persArray[4] = new Employee("Чапаев", "Василий", "Иванович",
                "Начальник отдела", "chapaev@gmail.com", "168432579", 40000, 32);


        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].age > 40){
                persArray[i].info();
            }
        }
    }
}
