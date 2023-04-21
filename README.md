# Anagram Checker

This is a simple Java application that checks if two provided strings form an anagram.

## Installation

To use this application, you will need to have Java >17 and Maven installed on your computer.

1. Clone this repository to your local machine.
2. Navigate to the root directory of the project.
3. Run `mvn package` to build the project.
4. Run the application by executing the command `java -jar target/anagram-checker-1.0-SNAPSHOT.jar <subject> <candidate>`, where `<subject>` and `<candidate>` are the two strings you want to check for anagrams.

## Usage

To check if two strings are anagrams, run the application with the following command:

```
java -jar target/anagram-checker-1.0-SNAPSHOT.jar <subject> <candidate>
```

Replace `<subject>` and `<candidate>` with the two strings you want to check. The application will return a message, stating whether two strings form an anagram.