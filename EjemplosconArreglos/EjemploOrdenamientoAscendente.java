public class EjemploOrdenamientoAscendente {
    public static void main(String[] args){
        int[] arr = {10,9 ,8 , 7,6 , 5, 4, 3, 2,1 };
        int contador=0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int num = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1]= num;
                }
                contador++;
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("\n" + contador + " Iteraciones");
    }
}
