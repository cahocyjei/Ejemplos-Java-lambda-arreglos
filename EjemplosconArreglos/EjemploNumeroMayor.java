public class EjemploNumeroMayor {
    
    public static void main(String []args){
        int[] arr = {7 ,10 , 11,1 , 20, 2, 4, 8, 9,6 };
        int num;
        int index= 1;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[index]) {
                num =arr[i];
                arr[i] = arr[index];
                arr[index] = num;
            }
            index++;
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("\n" + "Numero Mayor = " + arr[arr.length - 1]);
    }
}
