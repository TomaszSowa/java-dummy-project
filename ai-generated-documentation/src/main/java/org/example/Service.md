## Service.java Documentation

**1. Overview:**

This Java code defines a `Service` class containing two methods: `isEven` and `highComplexityMethod`. 

* The `isEven` method takes an integer as input and returns `true` if the number is even, otherwise `false`.
* The `highComplexityMethod` takes three integers as input and prints various messages to the console based on the signs of the input values. This method demonstrates a complex decision-making structure with nested conditional statements.

**2. Package/module name:**

org.example

**3. Class/file name:**

Service.java

**4. Detailed Documentation:**

   - **Function/Method: `isEven(int input)`**
     - **Description:** Determines if a given integer is even.
     - **Parameters:**
       - `input`: An integer to be checked for evenness.
     - **Return Values:**
       - `true`: If the input number is even.
       - `false`: If the input number is odd.
     - **Important Logic:** 
       - Uses the modulo operator (`%`) to check if the remainder of dividing the input by 2 is equal to 0. If it is, the number is even and the method returns `true`; otherwise, it returns `false`.

   - **Function/Method: `highComplexityMethod(int a, int b, int c)`**
     - **Description:** Prints messages to the console based on the signs of three input integers.
     - **Parameters:**
       - `a`: The first integer.
       - `b`: The second integer.
       - `c`: The third integer.
     - **Return Values:**
       - None (void method).
     - **Important Logic:** 
       - Uses a series of nested if-else statements to evaluate the signs of `a`, `b`, and `c`.
       - Prints messages indicating whether each variable is positive or non-positive.

**5. Pseudo Code:**


```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is equal to 0, return true.
  3. Otherwise, return false.

// Method: highComplexityMethod(a, b, c)
  1. Check the sign of 'a':
    - If 'a' is 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is positive, b is positive, c is positive".
            - Otherwise, print "a is positive, b is positive, c is non-positive".
        - Otherwise (b is non-positive):
          - Check the sign of 'c':
            - If 'c' is positive, print "a is positive, b is non-positive, c is positive".
            - Otherwise, print "a is positive, b is non-positive, c is non-positive".
    - If 'a' is negative:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is positive, c is positive".
            - Otherwise, print "a is non-positive, b is positive, c is non-positive".
        - Otherwise (b is non-positive):
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is non-positive, c is positive".
            - Otherwise, print "a is non-positive, b is non-positive, c is non-positive".
    - Otherwise (a is non-positive):
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is positive, c is positive".
            - Otherwise, print "a is non-positive, b is positive, c is non-positive".
        - Otherwise (b is non-positive):
          - Check the sign of 'c':
            - If 'c' is positive, print "a is non-positive, b is non-positive, c is positive".
            - Otherwise, print "a is non-positive, b is non-positive, c is non-positive".



```

**Dependencies and Libraries:**

* This code does not rely on any external libraries. It uses standard Java built-in functionalities. 


