import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploMediaMedianaArreglo {

    public static void main(String[] args) {

        Integer[] arr = { 50, 43, 32, 65, 87, 75, 94, 68, 41, 12, 19, 120, 350, 428,15};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
        Stream<Integer> sarr = Arrays.stream(arr);

        Integer media = sarr.reduce(0, (a, b) -> {
            return a + b;
        });
        System.out.println("\n Media = " + media/arr.length);

        if (arr.length % 2 != 0) {
            int i = (arr.length -2)/2;
            int mediana = arr[i +1];
            System.out.println("\n MedianaImPar = " + mediana);
        }else{
            int left = (arr.length-1)/2;
            int mediana = (arr[left] + arr[left + 1])/2;
            System.out.println("MedianaPar = " + mediana);

        }
        
    }
}
