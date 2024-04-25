package edu.sjsu;

public class NameChecker {
    public static boolean check(String input) {
        if (input == null || input.length() < 2 || input.length() > 40) return false;
        if (input.startsWith("-") || input.startsWith("'")) return false;
        if (input.contains("--") || input.contains("''")) return false;

        return input.matches("[a-zA-Z'-]+");
    }
}
