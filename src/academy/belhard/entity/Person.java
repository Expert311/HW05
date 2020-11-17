package academy.belhard.entity;

public class Person {

    protected String firstName;
    protected String lastName;

    //Создайте в классе Person конструктор с 2-мя аргументами (для обоих полей класса) и модификатором доступа public
    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    //Создайте в классе Person метод под названием getFullName с типом возвращаемого значения String и модификатором доступа public.
    // Этот метод должен склеивать имя и фамилию через пробел и возвращать это значение
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}