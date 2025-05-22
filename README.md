# Calculator Project

This is a simple calculator project implemented in Java that currently supports addition operations.

## Project Structure

```
calculator-project
├── src
│   ├── Calculator.java
│   └── Addition.java
└── README.md
```

## Files

- **Calculator.java**: This file contains the main `Calculator` class. It initializes the `Addition` class and provides a method `add(int a, int b)` to perform addition operations.

- **Addition.java**: This file contains the `Addition` class. It exports a method `add(int a, int b)` that takes two integers as parameters and returns their sum.

## Usage

To use the calculator, you can create an instance of the `Calculator` class and call the `add` method with two integers as arguments. For example:

```java
Calculator calculator = new Calculator();
int result = calculator.add(5, 3);
System.out.println("The sum is: " + result);
```

## Future Enhancements

In future versions, we plan to add more functionalities such as subtraction, multiplication, and division operations.