package Lesson5;

public class Workers {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Workers(String name, String position, String email, String phone, int pay, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void displayInfo(){
        System.out.printf("Имя: %s\tДолжность: %s\tEmail: %s\tТелефон: %s\tЗарплата: %d\tВозраст: %d\n", this.name, this.position, this.email, this.phone, this.pay, this.age);
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() { // Не совсем понял, для чего этот блок? Результат в консоли с ним и без него одинаковый!
        return "Workers{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", pay=" + pay +
                ", age=" + age +
                '}';
    }

}
