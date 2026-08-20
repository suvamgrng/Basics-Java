package Lecture_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,1,8,10,3);
        int result =nums
                .stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n*2)
                .reduce(2, (c,e) -> c + e);

        System.out.println(result);


//        for (int n: nums) {
//            System.out.println(n*2);
//        }
    }
}

