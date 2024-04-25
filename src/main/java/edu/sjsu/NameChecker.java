package edu.sjsu;

public class NameChecker {
    public static boolean check(String name) {
        return name.matches("^[a-zA-Z]+(?: [a-zA-Z]+)*$");
    }
}
