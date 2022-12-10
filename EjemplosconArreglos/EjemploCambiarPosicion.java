public class EjemploCambiarPosicion {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
        int num;
        int index = arr.length - 2;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                index = 1;
                num = arr[index];
                arr[index] = arr[i];
                arr[i] = num;
            }
            num = arr[index];
            arr[index] = arr[i];
            arr[i] = num;
            if (i == 3) {
                break;
            }
            index--;
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
