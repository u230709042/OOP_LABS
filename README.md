# Java OOP Lab Assignments

Lab assignments and small projects from my Object-Oriented Programming course. Each `labN` folder is a separate exercise, and most of them have a test or demo class with a `main` method.

The first few labs are plain Java: loops, conditionals, arrays, recursion. From lab6 on, the course moves into classes and objects, then inheritance, abstract classes, exceptions and generics.

## Contents

| Lab | What's in it | Run |
|---|---|---|
| lab1 | Hello World | `HelloWorld` |
| lab2 | Comparing numbers, finding the max and min, grade calculation | `CompareNumbers`, `FindGrade`, `FindMaximum`, `FindMin` |
| lab3 | Prime numbers and a number guessing game | `FindPrimes`, `GuessNumber` |
| lab4 | First Tic-Tac-Toe, written as a single class | `TicTacToe` |
| lab5 | GCD (loop and recursive versions), sequence search, reading a matrix from `matrix.txt` | `GCDLoop`, `GCDRec`, `FindSequence` |
| lab6 | First classes: `Point`, `Circle`, `Rectangle` | `Main` |
| lab7 | `MyDate` class | `TestMyDate` |
| lab8 | `MyDate`, `MyTime` and `MyDateTime`, which combines the two | `TestMyDateTime` |
| lab9 | 2D shapes (`Circle`, `Square`) and 3D shapes (`Cube`, `Cylinder`) built with inheritance | `TestShapes2d`, `TestShapes3d` |
| lab10 | Same shapes again, reworked | `TestShapes` in each subfolder |
| lab11 | Abstract `Shape` class with `Circle`, `Rectangle` and `Square`, plus a `Drawing` program in three versions | `TestDrawing` in each version folder |
| lab12 | Console Tic-Tac-Toe with a custom `InvalidMoveException` | `Main` |
| lab13 | Generic `Stack<T>` interface with two implementations: `ArrayList` and singly linked list | `StackDemo` |

## A few notes

- In lab12, invalid input (a letter instead of a coordinate, or an already taken cell) throws `InvalidMoveException`, so the game asks again instead of crashing.
- In lab13, getting the bounded wildcard (`? extends T`) to work for moving items between stacks took me a while to figure out.
- I cleaned up the code before uploading: private fields, package names, unused imports.

## Running the code

```bash
git clone https://github.com/u230709042/OOP_LABS.git
```

Then open the folder as a project in IntelliJ, Eclipse, or VS Code and run the class listed in the table.