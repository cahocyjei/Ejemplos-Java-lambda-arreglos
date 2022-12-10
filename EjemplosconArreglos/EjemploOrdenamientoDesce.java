public class EjemploOrdenamientoDesce {
    public static void main(String[] args){
        int[] arr = {1 ,2 , 3,4 , 5, 6, 7, 8, 9,10 };

        int num;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[i];
                    arr[i]= arr[j];
                    arr[j]= num;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
