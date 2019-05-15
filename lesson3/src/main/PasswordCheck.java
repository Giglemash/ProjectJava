package main;
import java.util.Scanner;

public class PasswordCheck {
    private static boolean checkPassword(String password) {
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        return password.matches(pattern);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Пароль должен состоять из 8 символов (не более 20)," +
                    " содержать хотябы одну строчную и заглавную букву, а такжу цифру и спец. символ.");
            System.out.println("Введите пароль:");
        } while (!checkPassword(scanner.next()));
    }
}

