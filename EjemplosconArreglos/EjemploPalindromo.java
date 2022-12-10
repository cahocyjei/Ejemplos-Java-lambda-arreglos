public class EjemploPalindromo {
    
    public static void main(String[]args){
        String cadena = "ana";
        String cadena2 ="";

        for (int i = cadena.length() - 1; i >=0; i--) {
            char c = cadena.charAt(i);
            cadena2 += c;
        }
        if (cadena.equals(cadena2)) {
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        System.out.println(cadena2);
    }
}
