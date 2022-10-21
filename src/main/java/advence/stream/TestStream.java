package advence.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = +1;
        }
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
