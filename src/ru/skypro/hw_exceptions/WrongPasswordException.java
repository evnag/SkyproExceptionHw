package ru.skypro.hw_exceptions;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String message) {
        super(message);
    }
}
