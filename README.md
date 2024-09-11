 ## findSubstringTask - README

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
     findSubstringTask - README

## Overview

This program is written in Java and aims to find substrings within an array of strings. The algorithm developed allows you to find all strings in the array that contain the given substring, taking into account case insensitivity.

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
    String[] array = {"ExampleString", "testSubstring", "AnotherOne"};
    String substring = "sub";
    String[] result = findSubstringInArray(array, substring);
    System.out.println(Arrays.toString(result));
}
}
