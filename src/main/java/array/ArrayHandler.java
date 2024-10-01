package array;

import java.util.Scanner;

public class ArrayHandler {
    public void addIndexToNumber(int[] source){
        for(int i = 0; i < source.length; i++){
            source[i] = source[i] + i;
        }
    }
    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] words = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numbers[" + i + "]= ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print("Words[" + i + "]= ");
            words[i] = scanner.next();
        }

        for (int item : numbers) {
            System.out.println(item);
        }
        for (String item : words) {
            System.out.println(item);
        }

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int item : numbers) {
            System.out.print(item + ", ");
        }

        System.out.println();

        for (String item : words) {
            System.out.print(item + ", ");
        }
    }
}
