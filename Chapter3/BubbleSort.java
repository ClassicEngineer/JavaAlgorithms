import java.util.Arrays;
import java.util.List;

public class BubbleSort {


    public static List<Integer> bubbleSort(List<Integer> ints) {
        Integer [] array = new Integer[ints.size()];
        for (int i = 0; i < ints.size(); i++) {
            array[i] = ints.get(i);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.asList(array);
    }


    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 4, 5, 3, 10, 33, 3, 43, 100, 9);
        ints = bubbleSort(ints);
        System.out.println(ints);
    }
}
