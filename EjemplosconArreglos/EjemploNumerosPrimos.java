import java.util.ArrayList;
import java.util.HashMap;

public class EjemploNumerosPrimos {
    
    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;
        int[] num = { 12, 52,0, 24,5, 36,1000001,13, 7, 8,1, 9, 14, 29, 11, 10, 2 };
        HashMap<Integer, String> numerosPrimos = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            if (num[i] == 0 || num[i] == 1) {
                continue;
            }else if (num[i] == 2) {
                numerosPrimos.put(num[i],"Es primo");
            }
            for (int j = 2; j < n; j++) {
                if (num[i] % j == 0 && num[i] != j) {
                    contador++;
                    contador2++;
                    break;
                }
            }
            if (contador == 0) {
              numerosPrimos.put(num[i], "Es primo");  
            }else{
               numerosPrimos.put(num[i], "No es primo"); 
            }
           contador = 0;
        }
        numerosPrimos.forEach((k,v)->{
            if (v.equals("Es primo")) {
                System.out.println(k + " = " + v);
            }
        });
        System.out.println("\n Iteraciones = "+ contador2);
    }
}