package io.beyonnex;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please, run application with two parameters.");
            return;
        }
        var checker = new AnagramChecker();

        if (checker.isAnagram(args[0], args[1])) {
            System.out.println("Provided words are anagrams.");
        } else {
            System.out.println("Provided words are not anagrams.");
        }
    }
}