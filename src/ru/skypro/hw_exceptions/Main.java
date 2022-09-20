package ru.skypro.hw_exceptions;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro.go";
        String password = "D_1hWiKjjP_9";
        signIn(login, password, "D_1hWiKjjP_9");
    }

    public static boolean signIn(String login, String password, String confirmPassword) {
        String loginPattern = "(?=\\w)(?=^[^@#$%^&+=]+$)(?=\\S+$).{8,20}"; // all numbers and letters, including '_', except spaces & special symbols, from 8 to 20 characters
        String passwordPattern = "(?=.*\\w)(?=^[^@#$%^&+=]+$)(?=\\S+$).{6,19}"; // all numbers and letters, including '_', except spaces & special symbols, from 8 to 19 characters

        try {
            if (!login.matches(loginPattern)) {
                throw new WrongLoginException("Incorrect login or login length!! Try again...");
            } else if (!password.matches(passwordPattern) || !(password.equals(confirmPassword))) {
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
