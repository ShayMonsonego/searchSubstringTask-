# searchSubstringTask-
# findSubstringTask - README

## important note ## 
Although it is possible to write the code in two lines using built-in functions, I chose to implement the function manually to have control over every step and avoid debugging issues, thus achieving optimal efficiency.



## Overview
I chose to implement this function in Java due to the language's advantages in terms of performance. Java offers precise control over processes, and its language structure supports high efficiency, which is crucial for such implementations.



## Algorithm Description

The function `findSubstringInArray` takes an array of strings and a substring as input and returns an array of strings from the original array that contain the substring. The function operates as follows:

1. **Input Validation**:
   - If the array is empty, the function returns an empty array and prints "Empty".
   - If the substring is empty, the function returns the original array as is.

2. **Filtering Substrings**:
   - For each string in the array, if the length of the string is less than the length of the substring, the string is skipped.
   - The process is case-insensitive by converting both the string and the substring to lowercase.

3. **Substring Search**:
   - The function searches for the substring within each string in the array by comparing characters one by one.
   - If a full match is found, the string is included in the result.

4. **Returning the Result**:
   - If no matches are found, the function returns an empty array and prints "Empty".
   - Otherwise, the function returns the array of strings containing the substring, after trimming the array to include only the actual results.

## Performance Analysis

- **Time Complexity**:
  - The overall time complexity of searching a substring within each string is O(n * m), where `n` is the length of the string and `m` is the length of the substring.
  - The ability to skip strings shorter than the substring helps improve performance by saving search time.

- **Optimal Performance**:
  - Although it is possible to write the code in two lines using built-in functions, I chose to implement the function manually to have control over every step and avoid debugging issues, thus achieving optimal efficiency.

## Usage

To use the function, simply call it with an array of strings and a substring. Example usage:

```java
public static void main(String[] args) {
   // Test case 1: Basic functionality
        String[] array1 = {"ExampleString", "testSubstring", "AnotherOne"};
        String substring1 = "sub";
        System.out.println("Test Case 1:");
        String[] result1 = findSubstringInArray(array1, substring1);
        System.out.println("Expected: [testSubstring]");
        System.out.println("Actual: " + Arrays.toString(result1));
        System.out.println();

        // Test case 2: Case insensitivity
        String[] array2 = {"SubString", "substring", "SUBSTRING", "noMatch"};
        String substring2 = "sub";
        System.out.println("Test Case 2:");
        String[] result2 = findSubstringInArray(array2, substring2);
        System.out.println("Expected: [SubString, substring, SUBSTRING]");
        System.out.println("Actual: " + Arrays.toString(result2));
        System.out.println();

        // Test case 3: Empty substring
        String[] array3 = {"Example", "Test", "Another"};
        String substring3 = "";
        System.out.println("Test Case 3:");
        String[] result3 = findSubstringInArray(array3, substring3);
        System.out.println("Expected: [Example, Test, Another]");
        System.out.println("Actual: " + Arrays.toString(result3));
        System.out.println();

        // Test case 4: Empty array
        String[] array4 = {};
        String substring4 = "sub";
        System.out.println("Test Case 4:");
        String[] result4 = findSubstringInArray(array4, substring4);
        System.out.println("Expected: []");
        System.out.println("Actual: " + Arrays.toString(result4));
        System.out.println();

        // Test case 5: Substring longer than any string
        String[] array5 = {"short", "tiny", "small"};
        String substring5 = "longsubstring";
        System.out.println("Test Case 5:");
        String[] result5 = findSubstringInArray(array5, substring5);
        System.out.println("Expected: []");
        System.out.println("Actual: " + Arrays.toString(result5));
        System.out.println();
}
