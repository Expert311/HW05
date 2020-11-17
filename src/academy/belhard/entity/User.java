package academy.belhard.entity;

public class User extends Person {

    private String email;
    private String password;


//В классе User создайте конструктор, который принимает 2 поля класса Person и 2 поля класса User - всего 4 аргумента
// (используйте вызов конструктора родительского класса с помощью ключевого слова super)

    public User(String fn, String ln, String em, String pw) {
        super(fn, ln);
        email = em;
        password = pw;
    }


//    В классе User создайте метод getFullInfo с модификатором доступа public и возвращаемым значением типа String,
//    который конкатенирует всю информацию о пользователе (кроме пароля)
//    Пример работы метода getFullInfo (для перевода строки используйте спецсимвол - “\n”):
//    Имя: Tom Hardy
//    E-mail: tom.hardy@mail.ru

    public String getFullInfo() {

        return "Имя: " + super.firstName + " " + super.lastName + "\n" + "E-mail: " + email;
    }


    //    В классе User создайте метод isPasswordCorrect с модификатором доступа public и возвращаемым значением типа boolean.
//    Этот метод должен принимать 1 аргумент типа String и возвращать true, если строка-аргумент соответствует
//    паролю пользователя,и false в обратном случае (для проверки строк на равенство используйте метод equals
//    класса String, а НЕ “==” !!!)
    public boolean isPasswordCorrect(String pass) {
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        User u1 = new User("Tom", "Hardy", "tom.hardy@mail.ru", "1234");

        System.out.println(u1.getFullInfo());
        System.out.println(u1.isPasswordCorrect("7896"));

    }


}
