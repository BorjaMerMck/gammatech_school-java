
  <details>
    <summary>B_VariablesYTipos</summary>
/*
 * ====VARIABLE====
 * En una variable podemos almacenar información.
 * Java es de tipado estático: cada variable tiene un tipo asignado.
 * El tipo que tiene asignado una variable es invariable, no puede cambiarse.
 * Cuidado si se hacen operaciones y es necesario almacenar el resultado en una nueva variable.
 * Hay que asignar el tipo de esa variable según vaya a ser el resultado.
 * 
 * ----JERARQUIA----
 * double > float > long > int > short = char > byte
 * 
 * ----OPERACIONES----
 * En operaciones aritméticas va a ganar siempre el tipo de dato mayor.
 * int + long = long
 * float * int = float
 * Es importante tener en cuenta esto cuando alojamos el resultado en una nueva variable.
 * int / int = int --> ¿qué pasa si el resultado tiene que ser double?
 * No es suficiente con que la variable del resultado se declare como double.
 * La operación es entre dos enteros y el resultado tendrá la parte entera, perdiendo los decimales.
 * 
 * Para solucionar esto se necesita castear uno de los números a un tipo decimal.
 * Como ganará el decimal el resultado sí tendrá la parte decimal.
 * 
 * ----CASTING----
 * Para cambiar de un número de menor tamaño a otro de mayor tamaño no hay problema.
 * Para hacerlo al revés, de uno mayor a otro menor necesitamos hacer el casteo.
 * Es como forzar la conversión de un tipo de dato a otro.
 * 
 * (float) int / int = float --> si esto se almacena en una variable double
 *                               el resultado será float, pero al ser double la variable
 *                               no hay problema y no es necesario el casteo.
 * 
 * =================
 * =   EJERCICIO   =
 * =================
 * Se trata de que os familiaricéis con el uso de variables.
 * Vamos a hacer diferentes acciones con ellas.
 * 
 * 1. Declarar variables de cada tipo sin valor.
 * 2. Asignarles un valor.
 * 3. Declarar nuevas variables asignándoles valores de las variables ya existentes.
 * 4. Declarar nuevas variables asignánoles un valor directamente.
 * 5. Practicar el uso de comentarios indicando en todo momento qué se está haciendo.
 * 6. Realiza operaciones entre variables numéricas
 *     - Operador de suma +
 *     - Operador de resta -
 *     - Operador de multiplicación *
 *     - Operador de división /
 *     - Operador de módulo % --> (opcional)
 * 7. Operaciones entre variables de diferentes tipos, cuidado con el tipo resultante.
 * 8. Operaciones entre números enteros (byte, short, int, long) cuyo resultado sea decimal (float, double)
 * 
 * ----BONUS----
 * 9. ¿Se puede operar con char? ¿Cómo?
 * 
 * 
 * ====REALIZACION====
 * Para ver los resultados y comprobar que es lo correcto y esperado
 * System.out.println(); --> ve haciendo prints
 * Añade comentarios
 * // --> comentario de una línea
 * /* --> abre comentario multilínea
 * */ // cierra comentario multilínea


// No te olvides de la clase...

    // Necesitas método main...

        // Declara variables: byte, short, int, long, float, double, char, boolean

        // Asigna valor a las variables creadas

        // Declara NUEVAS variables, asignándoles el valor de variables creadas anteriormente
        // Reasigna el tipo mediante casteo en alguna de ellas, de ser necesario

        // Declara NUEVAS variables asignándoles valor, puedes hacer más de una de cada tipo

        // Experimenta con los operadores (+, -, *, /)
        // Recuerda que necesitas hacer ajustes en los tipos mediante casteo
        // Crea variables para los resultados, ejemplo: resultadoSuma


public class B_VariablesYTipos {
    public static void main(String[] args) {
        boolean tieneO = false;
        String texto = "Hola";

        for (char l : texto.toUpperCase().toCharArray()) {
            if (l == 'o') {
                tieneO = true;
            }
        }

        if (tieneO == true) {
            System.out.println("Tiene la letra 'O'");
        } else {
            System.out.println("No contiene la 'O'");
        }
    }
}


  </details>

  <details>
  /*
 * Bloque de ejercicios de nivel básico
 * 
 * Cada ejercicio tiene su espacio, recuerda:
 * System.out.println(); para mostrar por pantalla texto que indique en qué ejercicio estás
 * y el proceso que vas haciendo.
 */
public class BA_BasicoVariablesYTipos {
    public static void main(String[] args) {
        // 1. Declara variables de tipos numéricos (byte, short, int, long, float, double)
        // Realiza conversiones implícitas entre ellas
        System.out.println("EJERCICIO 1:"); // Resuelve en las siguientes líneas

        // 2. Declara una variable char con valor 'C'.
        // Almacena su valor en una variable int.
        // Muestra por pantalla el valor.
        System.out.println("EJERCICIO 2:");

        // 3. Intenta convertir un long en un short sin hacer casting
        // Deja en un comentario el error.
        System.out.println("EJERCICIO 3:");

        // 4. Asigna un float a un double y viceversa.
        // ¿Cuándo es necesario hacer un casteo?
        System.err.println("EJERCICIO 4:");

        // 5. Crea una variable double, con valor decimal.
        // Castéala a una variable int.
        // ¿Qué ocurre?
        System.out.println("EJERCICIO 5:");


    }
}
  </details>

  <details>
    <summary>BB_IntermedioVariablesYTipos</summary>
/*
 * ==================
 * =   INTERMEDIO   =
 * ==================
 * 
 * En estos ejercicios vais a tener que investigar un poco.
 * Es muy importante que entrenemos la autosuficiencia desde el principio.
 * Es necesario que aprendáis a buscar en la red posibles soluciones a vuestros problemas
 * y tener el máximo de autonomía posible.
 * También es esencial manejarse con los manuales.
 */

public class BB_IntermedioVariablesYTipos {
    // Declara el método main --> Cuidado con las llaves de apertura y cierre

        // 1. Declara una variable int y una double.
        // Realiza una operación matemática.
        // ¿Qué tipo de dato es el resultado?
        System.out.println("EJERCICIO 1:");

        // 2. Declara una variable int y otra String.
        // Concatena la variable int con la String --> igual tienes que hacer alguna transformación
        // Vuelve a convertir el resultado en un int
        System.out.println("EJERCICIO 2:");

        // 3. Usa char en una operación matemática con un int.
        // Guarda el resultado en una nueva variable y muéstralo.
        System.out.println("EJERCICIO 3:");

        // 4. Declara una variable byte con valor 127.
        // Súmale 1 y guarda el resultado en una nueva variable casteando a byte.
        // Imprime el resultado.
        // Imprime texto con la justificación del resultado.
        System.out.println("EJERCICIO 4:");

        // 5. Declara un long con un valor mayor a lo que permite int.
        // Conviértelo a int.
        // Muestra el número y explica qué ha sucedido.
        System.out.println("EJERCICIO 5:");

}
  </details>

  <details>
    <summary>BC_AvanzadoVariablesTipos</summary>
/*
 * ================
 * =   AVANZADO   =
 * ================
 * En estos ejercicios vais a tener que investigar un poco más.
 * Es muy importante que entrenemos la autosuficiencia desde el principio.
 * Es necesario que aprendáis a buscar en la red posibles soluciones a vuestros problemas
 * y tener el máximo de autonomía posible.
 * También es esencial manejarse con los manuales.
 * 
 * ====INSTRUCCIONES====
 * * Tienes que crear la clase.
 * * Tienes que crear el método main.
 * * Tienes que estructurar los ejercicios con comentarios y prints para que sea manejable.
 * * Importante preservar un buen orden en el código.
 * 
 * ====EJERCICIOS====
 * 1. Crea un programa que reciba (necesitas input) un número decimal como una String
 * Imprime ese número decimal como String
 * Conviértelo a double
 * Imprime el número convertido a double
 * Conviértelo a int
 * Imprime el número siendo int
 * ******************
 * 2. Crea una variable boolean y una variable int.
 * Súmalas. ¿Es posible? Justifícalo.
 * ******************
 * 3. Realiza una conversión de double a byte.
 * Muestra los valores antes y después de la conversión.
 * ******************
 * 4. Convierte un número float a int. Pero antes de hacer la conversión haz un redondeo.
 * Muestra los valores de las 3 fases, ejeplo:
 * Valor del número float: xxx
 * Valor del número redondeado: xxx
 * Valor del número convertido a int: xxx
 * ******************
 * 5. Crea un conversor de temperaturas. Necesitas inputs para ello.
 * El usuario va a ingresar un valor que será una temperatura en Celsius, 
 * y tendrá el tipo String.
 * Ese valor tendrá que transformarse a double.
 * Tienes que mostrar tres resultados: Celius, Fahrenheit y Kelvin
 */

  </details>

</details>
