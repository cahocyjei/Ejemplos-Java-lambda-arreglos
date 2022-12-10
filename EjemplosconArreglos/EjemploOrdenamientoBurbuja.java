public class EjemploOrdenamientoBurbuja {
    public static void main(String []args){
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
        int num;
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == ((arr.length -1)/2)+1 ) {
                break;
            }
            num = arr[index];
            arr[index] = arr[i];
            arr[i]= num;
            index--;
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }

    }
}
