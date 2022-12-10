import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Símbolos comunes en expresiones regulares
 * Expresión
Descripción
.
Un punto indica cualquier carácter
^expresión
El símbolo ^ indica el principio del String. En este caso el String debe contener la expresión al principio.
expresión$
El símbolo $ indica el final del String. En este caso el String debe contener la expresión al final.
[abc]
Los corchetes representan una definición de conjunto. En este ejemplo el String debe contener las letras a ó b ó c.
[abc][12]
El String debe contener las letras a ó b ó c seguidas de 1 ó 2
[^abc]
El símbolo ^ dentro de los corchetes indica negación. En este caso el String debe contener cualquier carácter excepto a ó b ó c.
[a-z1-9]
Rango. Indica las letras minúsculas desde la a hasta la z (ambas incluidas) y los dígitos desde el 1 hasta el 9 (ambos incluidos)
A|B
El carácter | es un OR.  A ó B
AB
Concatenación. A seguida de B
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
Meta caracteres
\d
Dígito. Equivale a [0-9]
\D
No dígito. Equivale a [^0-9]
\s
Espacio en blanco. Equivale a [ \t\n\x0b\r\f]
\S
No espacio en blanco. Equivale a [^\s]
\w
Una letra mayúscula o minúscula, un dígito o el carácter _
Equivale a  [a-zA-Z0-9_]
\W
Equivale a [^\w]
\b
Límite de una palabra.
----------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------
Cuantificadores
Expresión
Descripción
{X}
Indica que lo que va justo antes de las llaves se repite X veces
{X,Y}
Indica que lo que va justo antes de las llaves se repite mínimo X veces y máximo Y veces. También podemos poner {X,} indicando que se repite un mínimo de X veces sin límite máximo.
*
Indica 0 ó más veces. Equivale a {0,}
+
Indica 1 ó más veces. Equivale a {1,}
?
Indica 0 ó 1 veces. Equivale a {0,1}
 */

public class EjemploExpresionesRegulares {
    public static void main(String[] args) {
        String cadena= "cahocyjei@gmail.com";
    
        Pattern p = Pattern.compile(".*[^com]$");
        Matcher m = p.matcher(cadena);
        if (m.matches()) {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
