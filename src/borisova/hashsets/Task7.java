package borisova.hashsets;

import java.util.HashSet;

public class Task7 {
    public static void main(String[] args) {
        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        Integer[] digits=numbers.toArray(new Integer[numbers.size()]);
        HashSet<Integer> nums= new HashSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (digits[i]>10) {
                nums.add(digits[i]);
            }
        }
        System.out.println(nums);
    }
}
