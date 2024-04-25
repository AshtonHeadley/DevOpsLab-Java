package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start or end with a hyphen or single quote
     * - No consecutive hyphens or apostrophes
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        if (input == null || input.length() < 2 || input.length() > 40) {
            return false;
        }

        // Check for invalid start or end characters
        if (input.startsWith("-") || input.startsWith("'") || input.endsWith("-") || input.endsWith("'")) {
            return false;
        }

        // Check for consecutive hyphens or apostrophes
        if (input.contains("--") || input.contains("''")) {
            return false;
        }

        // Regular expression to match valid name patterns
        return input.matches("[A-Za-z]+([-'][A-Za-z]+)*");
    }
}
