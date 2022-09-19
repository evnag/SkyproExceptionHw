package ru.skypro.hw_exceptions;

public class Main {
    public static void main(String[] args) {
        signIn("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    public static boolean signIn(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Incorrect login length!! Try again...");
            } else if (password.length() >= 20 || !(password.equals(confirmPassword))) {
                throw new WrongPasswordException("Incorrect password length or incorrect password!! Try to enter again");
            } else {
                System.out.println("Authorization completed successfully");
                return true;
            }
        } catch (WrongLoginException e) {
            System.out.println(e);
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }
        return false;
    }
}
