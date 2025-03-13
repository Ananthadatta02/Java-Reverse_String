# Reverse a String in Java

## Overview
This Java program reverses a given string by iterating through its characters in reverse order. It takes user input, processes the string using a `for` loop, and prints the reversed output. This demonstrates fundamental Java concepts such as user input handling, loops, and string manipulation.

## Code
```java
package string_Reversal;

import java.util.Scanner;

public class Reverse_a_String
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = s.next(); // Reads a single word input
        
        for(int i = st.length() - 1; i >= 0; i--)
        {
            char ch = st.charAt(i);
            System.out.print(ch + " "); // Prints characters in reverse order
        }
    }
}
```

## Explanation

### **1. Scanner Input**
- `Scanner s = new Scanner(System.in);` creates an object to read user input.
- `System.out.println("Enter the String");` prompts the user to enter a string.
- `String st = s.next();` stores the input as a string, but it only captures a single word (it ignores spaces).

### **2. Variables**
- `String st` stores the user input.
- `char ch` is used inside the loop to extract each character from the string.

### **3. For Loop and Condition**
- `for(int i = st.length() - 1; i >= 0; i--)`:
  - Starts from the last character (`st.length() - 1`).
  - Decrements `i` until it reaches `0`, ensuring all characters are processed in reverse order.

### **4. Character Extraction**
- `char ch = st.charAt(i);` retrieves the character at index `i`.
- The loop iterates over all characters from the last to the first.

### **5. Printing Statements**
- `System.out.print(ch + " ");` prints each character followed by a space.
- The reversed characters are displayed with spaces in between.

## Example Output

### **Input:**
```
Hello
```

### **Output:**
```
o l l e H
```
## Clone
```
git clone https://github.com/Ananthadatta02/Java-Reverse_String.git
```
