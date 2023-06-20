package org.example.Homework.HW3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int min = findMin(numbers);
        int max = findMax(numbers);
        double average = findAverage(numbers);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

        List<List<Integer>> permutations = generatePermutations(numbers);
        System.out.println("Перестановки элементов: " + permutations);
    }

    public static int findMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double findAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static List<List<Integer>> generatePermutations(List<Integer> numbers) {
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutationsHelper(numbers, 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(List<Integer> numbers, int start, List<List<Integer>> permutations) {
        if (start == numbers.size() - 1) {
            permutations.add(new ArrayList<>(numbers));
            return;
        }

        for (int i = start; i < numbers.size(); i++) {
            swap(numbers, start, i);
            generatePermutationsHelper(numbers, start + 1, permutations);
            swap(numbers, start, i);
        }
    }

    private static void swap(List<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }
}
