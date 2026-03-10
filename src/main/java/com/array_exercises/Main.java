package com.array_exercises;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        exercise1_printArray();
        exercise2_indexOf();
        exercise3_sortStrings();
        exercise4_copyArray();
        exercise5_countryCity();
        exercise6_average();
        exercise7_printOddNumbers();
        exercise8_removeDuplicates();
        exercise9_expandArray();
        exercise10_multiplicationTable();
        exercise11_reverseUserInput();
        exercise12_diagonalElements();
        exercise13_oddEvenArrangement();

    }

    // 1. Store integers in array and print them
    public static void exercise1_printArray() {

        System.out.println("Exercise 1");

        int[] numbers = {11, 23, 39};

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");
    }

    // 2. Custom indexOf method
    public static void exercise2_indexOf() {

        System.out.println("Exercise 2");

        int[] numbers = {1, 3, 5, 7};

        int index = indexOf(numbers, 5);

        System.out.println("Index position of number 5 is: " + index);
        System.out.println();
    }

    public static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // 3. Sort string array
    public static void exercise3_sortStrings() {

        System.out.println("Exercise 3");

        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("Before sort: " + Arrays.toString(cities));

        Arrays.sort(cities);

        System.out.println("After sort: " + Arrays.toString(cities));
        System.out.println();
    }

    // 4. Copy array
    public static void exercise4_copyArray() {

        System.out.println("Exercise 4");

        int[] firstArray = {1, 15, 20};
        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println();
    }

    // 5. 2D Country City array
    public static void exercise5_countryCity() {

        System.out.println("Exercise 5");

        String[][] places = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };

        for (String[] row : places) {
            System.out.println(row[0] + " " + row[1]);
        }

        System.out.println();
    }

    // 6. Average calculation
    public static void exercise6_average() {

        System.out.println("Exercise 6");

        int[] numbers = {43, 5, 23, 17, 2, 14};

        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Average is: " + average);
        System.out.println();
    }

    // 7. Print odd numbers
    public static void exercise7_printOddNumbers() {

        System.out.println("Exercise 7");

        int[] numbers = {1, 2, 4, 7, 9, 12};

        for (int number : numbers) {

            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n");
    }

    // 8. Remove duplicates
    public static void exercise8_removeDuplicates() {

        System.out.println("Exercise 8");

        int[] array = {20,20,40,20,30,40,50,60,50};

        Set<Integer> unique = new LinkedHashSet<>();

        for (int number : array) {
            unique.add(number);
        }

        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("Without duplicates: " + unique);
        System.out.println();
    }

    // 9. Expand array
    public static void exercise9_expandArray() {

        System.out.println("Exercise 9");

        int[] original = {1,2,3};

        int newValue = 4;

        int[] expanded = Arrays.copyOf(original, original.length + 1);

        expanded[expanded.length - 1] = newValue;

        System.out.println(Arrays.toString(expanded));
        System.out.println();
    }

    // 10. Multiplication table
    public static void exercise10_multiplicationTable() {

        System.out.println("Exercise 10");

        int[][] table = new int[10][10];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                table[i][j] = (i + 1) * (j + 1);

                System.out.printf("%4d", table[i][j]);
            }

            System.out.println();
        }

        System.out.println();
    }

    // 11. Reverse array from user input
    public static void exercise11_reverseUserInput() {

        System.out.println("Exercise 11");

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int stopValue = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {

            int input = scanner.nextInt();

            if (input == stopValue) {
                break;
            }

            numbers.add(input);
        }

        Collections.reverse(numbers);

        System.out.println("Reversed array: " + numbers);
        System.out.println();
    }

    // 12. Diagonal elements
    public static void exercise12_diagonalElements() {

        System.out.println("Exercise 12");

        int[][] matrix = {
                {1,2,3},
                {2,4,6},
                {3,6,9}
        };

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\n");
    }

    // 13. Odd first, even last
    public static void exercise13_oddEvenArrangement() {

        System.out.println("Exercise 13");

        Random random = new Random();

        int[] source = new int[10];

        for (int i = 0; i < source.length; i++) {
            source[i] = random.nextInt(100);
        }

        int[] result = new int[source.length];

        int left = 0;
        int right = source.length - 1;

        for (int number : source) {

            if (number % 2 != 0) {
                result[left++] = number;
            } else {
                result[right--] = number;
            }
        }

        System.out.println("Original: " + Arrays.toString(source));
        System.out.println("Rearranged: " + Arrays.toString(result));
    }
}