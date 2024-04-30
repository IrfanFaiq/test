package day5.exerciseTest;

import java.util.Arrays;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        List<String> bottles = Arrays.asList("glass", "plastic");
        for (int type = 0; type < bottles.size();) {
            System.out.print(bottles.get(type) + ","); break;
        }
        System.out.print("end");
    }

}
