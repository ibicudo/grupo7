package modulo5.src.aula1tarde.radixsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {

    public static void radixSort(int iArr[]) {
        Map<String, List<String>> map = new HashMap<>();
        map = initializeLists();
        List<String> numberStrings = formatStringList(iArr);
        int size = numberStrings.get(0).length();

        for (int i = size - 1; i > -1; i--) {
            for (String number : numberStrings) {
                List<String> auxList = map.get(String.valueOf(number.charAt(i)));
                auxList.add(number);
                map.put(String.valueOf(number.charAt(i)), auxList);
            }
            numberStrings.clear();
            for (int j = 0; j < 10; j++) {
                numberStrings.addAll(map.get(String.valueOf(j)));
            }
            map = initializeLists();
        }

        for (int i = 0; i < numberStrings.size(); i++) {
            iArr[i] = Integer.valueOf(numberStrings.get(i));
        }

    }

    public static Map<String, List<String>> initializeLists() {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), new ArrayList<String>());
        }

        return map;
    }

    public static List<String> formatStringList(int iArr[]) {
        List<String> result = new ArrayList<>();
        int largest = 0;

        for (int i : iArr) {
            if (i > largest) {
                largest = i;
            }
        }

        int size = Integer.toString(largest).length();

        for (int i : iArr) {
            result.add(formatString(i, size));
        }

        return result;
    }

    public static String formatString(int number, int size) {
        String numberString = Integer.toString(number);
        int zerosToAdd = size - numberString.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < zerosToAdd; i++) {
            result.append(0);
        }

        result.append(numberString);

        return result.toString();
    }

    public static void main(String[] args) {

        int iArr[] = {3, 673, 106, 45, 2, 23};
        radixSort(iArr);

        for (int i : iArr) {
            System.out.print(i + " ");
        }


    }


}
