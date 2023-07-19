import java.util.Arrays;
import java.util.List;

public class InsertionSort {

    public static List<Integer> insertSort(List<Integer> ints) {
        Integer [] array = new Integer[ints.size()];
        for (int i = 0; i < ints.size(); i++) {
            array[i] = ints.get(i);
        }

        int in;
        for (int out = 0; out < array.length; out++) {
            int temp  = array[out]; // скопировать помеченный элемент
            in = out;               // начать перемещения справа
            while (in > 0 && array[in - 1] >= temp) { // пока не нашли меньший элемент
                array[in] = array[in - 1]; // Сдвинуть элемент вправо на одну позицию
                in --; // перейти на позицию влево
            }
            array[in] = temp; // вставить помеченный элемент
        }

        return Arrays.asList(array);
    }


    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 4, 5, 3, 10, 33, 3, 43, 100, 9);
        ints = insertSort(ints);
        System.out.println(ints);
    }
}
