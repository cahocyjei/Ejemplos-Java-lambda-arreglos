import java.util.HashMap;

public class EjemploConcurrencia {
    private static int contador;
    private static int numE1;

    public static void main(String[] args) {

        HashMap<String, Integer> result = new HashMap<>();
        int[] myArray = { 1, 2, 8,5, 6, 7, 8, 2, 8 };
        int jj = 1;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = jj; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && myArray[j] != numE1) {
                    contador++;
                }
            }
            jj++;
            if (contador > 0) {
                result.put(String.valueOf("El " + myArray[i] + " se encuentra") + " = ",  (contador + 1));
                numE1 = myArray[i];
                contador = 0;
            }
        }

         result.forEach((str, num) -> System.out.println(str + num));
    }
}