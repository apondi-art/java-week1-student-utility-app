# Java Student Utility App

## Project Description
A console-based Java application that performs multiple operations using a menu-driven system. This project demonstrates understanding of Java syntax, control structures, methods, and Git workflow.

## Features
1. **Add Two Numbers**: Performs addition of two user-provided integers.
2. **Check EVEN or ODD**: Determines if a number is even or odd using the ternary operator.
3. **Print Numbers from 1 to N**: Prints a sequence of numbers up to a user-specified limit.
4. **Display Day of the Week**: Converts a number (1-7) to the corresponding day of the week.
5. **Exit**: Terminates the application.

## How to Run
1. Ensure you have Java installed.
2. Compile the project using Maven:
   ```bash
   mvn clean compile
   ```
3. Run the application (replace `MainClassName` with the actual main class if running manually, or use an IDE):
   ```bash
   mvn exec:java -Dexec.mainClass="StudentUtilityApp"
   ```
   *Note: You may need to configure the exec plugin or run the compiled class directly:*
   ```bash
   java -cp target/classes StudentUtilityApp
   ```

## Sample Output
```
=== Java Student Utility App ===
1. Add Two Numbers
2. Check EVEN or ODD
3. Print Numbers from 1 to N
4. Display Day of the Week
5. Exit
Choose an option: 2
Enter a number to check if it's EVEN or ODD: 5
5 is ODD.
```

## Author
Quinter
