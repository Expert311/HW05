package academy.belhard;

import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("Tom", "Hardy", "tom.hardy@mail.ru", "1234");

        System.out.println(u1.getFullInfo());
        System.out.println(u1.isPasswordCorrect("7896"));
    }
}
