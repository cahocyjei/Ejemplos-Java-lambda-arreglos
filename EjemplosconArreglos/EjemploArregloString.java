import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class EjemploArregloString {
    public static void main(String[]args){

        String [] str= {"Manzana","Pera","Naranja","Uvas","Guayaba","Lulo"};

       for (int i = 0; i < str.length; i++) {
        
        str[i] = str[i].replace(str[i].charAt(0), str[0].charAt(i + 1));
       }
        
        Stream<String> st = Arrays.stream(str);
        st.peek(System.out::println)
        .map(String::toUpperCase)
        .forEach(System.out::println);

        String cadena = "@gmail.com";
        String cadena2 ="cahocyjei@gmail.com";
        System.out.println(cadena);
        String cadena1 = cadena.replaceAll(cadena, "Hola Mundo".concat(" Remplazo de cadena"));   //replace("sto", "xxx");
        System.out.println(cadena1);
        
       BiConsumer<String,Integer> con= (s,i)->{
        System.out.println("La coincidencia de la cadena "+i + " es "+  s.matches(cadena2));
       };
        con.accept(cadena,1);
    }

}
