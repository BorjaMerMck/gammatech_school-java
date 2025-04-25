
# Java - Conceptos Básicos
Lastupdate  24/04/2025
things to improve:
enum 

## Objeto
Un **objeto** es una instancia de una clase. Contiene **atributos** (estado) y **métodos** (comportamiento).

## Instanciar Objeto
Instanciar un objeto significa crear una copia de una clase en memoria utilizando el operador `new`.

```java
Persona persona1 = new Persona();
```

## Clase
Una **clase** es una plantilla que define las propiedades y comportamientos que tendrán los objetos.

```java
public class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola");
    }
}
```

## Métodos
Los **métodos** son funciones dentro de una clase que definen el comportamiento de los objetos.

```java
public int sumar(int a, int b) {
    return a + b;
}
```

## Atributos
Los **atributos** (o campos) son variables que representan el estado interno de un objeto.

## Abstracción
La **abstracción** permite ocultar los detalles internos y mostrar solo la funcionalidad esencial.

- No puedes instanciar una clase abstracta.

```java
abstract class Animal {
    abstract void hacerSonido();
}
```

## Encapsulamiento
El **encapsulamiento** consiste en ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos.

```java
public class CuentaBancaria {
    private double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
```

## Polimorfismo
El **polimorfismo** permite que una misma operación se comporte de diferentes formas según el objeto que la invoque.

```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}
```

## Herencia
La **herencia** permite que una clase (subclase) herede atributos y métodos de otra clase (superclase).

```java
class Vehiculo {
    void arrancar() {
        System.out.println("Vehículo arrancado");
    }
}

class Coche extends Vehiculo {
    void tocarClaxon() {
        System.out.println("Beep beep");
    }
}
```


doble nivel de herencia? 
## Interfaces
Una **interfaz** define un contrato que las clases deben cumplir. Solo contiene la firma de los métodos, sin implementación.

```java
interface Volador {
    void volar();
}
```

## Clases Abstractas
Una **clase abstracta** puede contener métodos abstractos (sin implementación) y métodos concretos. No se puede instanciar directamente.

```java
abstract class Figura {
    abstract double calcularArea();
}

animal t = new Trucha(); 


```

## Enumerados (`enum`)
Un `enum` es una clase especial que representa un conjunto de constantes predefinidas.

```java
enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}
```
https://jarroba.com/enum-enumerados-en-java-con-ejemplos/

## @Override
La anotación `@Override` indica que un método está sobrescribiendo un método de una superclase o interfaz.

```java
@Override
public void volar() {
    System.out.println("Estoy volando");
}
```

## Métodos de Acceso
```
| Modificador  | Descripción                                        |
|--------------|----------------------------------------------------|
| `private`    | Accesible solo dentro de la misma clase            |
| `protected`  | Accesible dentro del mismo paquete y subclases     |
| `public`     | Accesible desde cualquier clase                    |
| *(default)*  | Accesible solo dentro del mismo paquete            |
```
## Clase `Object`
La clase `Object` es la superclase de todas las clases en Java. Proporciona métodos fundamentales que todas las clases heredan:

- `toString()`
- `equals(Object obj)`
- `hashCode()`
- `getClass()`
- `clone()`
- `finalize()`

## instanceof
El operador `instanceof` se utiliza para verificar si un objeto es una instancia de una clase específica o implementa una interfaz determinada.

```java
if (obj instanceof String) {
    System.out.println("Es una cadena de texto");
}
```

## JavaDoc


## Anotaciones en JavaDoc

Para generar API con JavaDoc podemos usar ciertas palabras reservadas precedidas por el carácter "`@`" que son llamadas **anotaciones** <b>anotaciones</b>. El objetivo de las anotaciones es la de enriquecer la documentación y de organizarla de una manera estándar. Cada anotación representa un valor diferente y tenemos distinto tipos.

Veamos las principales anotaciones que existen:

<table style="border: 1px solid">
 	<tr><th>ANOTACION</th><th style="text-align:left">DESCRIPCION</th></tr>
 	<tr><td style="font-weight:bold">@author</td><td>Nombre del desarrollador</td></tr>
	<tr><td style="font-weight:bold">@version</td><td>Versión del método o clase</td></tr>
	<tr><td style="font-weight:bold">@param</td><td>Definición de un parámetro de entrada de un método, es requerido para todos los parámetros del método</td></tr>
	<tr><td style="font-weight:bold">@return</td><td>Informa de lo que devuelve el método, no se puede usar en constructores o métodos "void"</td></tr>
	<tr><td style="font-weight:bold">@throws</td><td>Excepción lanzada por el método, primero la clase y luego la explicación</td></tr>
	<tr><td style="font-weight:bold">@see</td><td>Asocia con un elemento externo como un método, una clase o cualquier recurso en la red. Varias maneras de hacer referencia -> #metodo(); clase#metodo(); paquete.clase; paquete.clase#metodo(). Tambien podemos usar la anotacion @link (ver más abajo)</td></tr>
	<tr><td style="font-weight:bold">@since</td><td>Usado principalmente en metodos. Nos dice desde que versión de la clase se encuentra el método en dicha clase</td></tr>
	<tr><td style="font-weight:bold">@link</td><td>Para crear un hipervinculo sobre un texto dentro del mismo programa. Si queremos usar hipervínculos externos podemos usar la etiqueta A de HTML.</td></tr>
	<tr><td style="font-weight:bold">@deprecated</td><td>Indica que el método o clase es antigua y que no se recomienda su uso porque posiblemente desaparecerá en versiones posteriores</td></tr>
</table>



Esta guía te ayudará a documentar tus clases y métodos en Java utilizando Javadoc de manera **profesional y clara**. Sigue esta checklist para asegurarte de que tu código esté bien documentado.

---

## ✅ Checklist de Documentación

### 1. Encabezado de clase

Incluye:
- Qué representa la clase.
- Para qué sirve.
- Enlaces a otras clases (opcional).
- Autor y versión.

```java
/**
 * Clase que representa un coche en el sistema de carreras.
 * Hereda de {@link Vehicle} e implementa características específicas de coches.
 * 
 * @author Borja
 * @version 1.0
 */
```

---

### 2. Atributos (campos)

Explica qué representa cada atributo, especialmente si es público o protegido.

```java
/**
 * Indica si el coche tiene turbo.
 */
private boolean hasTurbo;
```

---

### 3. Constructor(es)

Describe qué hace y documenta cada parámetro con `@param`.

```java
/**
 * Crea un nuevo coche con los parámetros especificados.
 * 
 * @param model el modelo del coche
 * @param engineType el tipo de motor
 * @param maxSpeed la velocidad máxima
 * @param preferredTrack el tipo de pista preferida
 * @param hasTurbo si tiene turbo
 */
```

---

### 4. Métodos públicos

Documenta:
- Qué hace el método.
- Qué parámetros recibe (`@param`).
- Qué devuelve (`@return`).
- Qué excepciones lanza (`@throws`).

```java
/**
 * Activa el modo turbo si está disponible.
 * 
 * @throws IllegalStateException si el coche ya está en modo turbo
 */
public void activateTurbo() { ... }
```

---

### 5. Métodos sobrescritos

Explica el comportamiento sobrescrito y su propósito.

```java
/**
 * Devuelve true si el coche necesita mantenimiento tras la carrera.
 * 
 * @return true si requiere servicio, false en caso contrario
 */
@Override
public boolean needsService() { ... }
```

---

### 6. Métodos abstractos

Describe el contrato que debe implementar la subclase.

```java
/**
 * Calcula la puntuación de rendimiento del vehículo.
 * 
 * @return puntuación como valor decimal
 */
public abstract double calculatePerformanceScore();
```

---

## 🧩 Etiquetas útiles

| Etiqueta      | Uso |
|---------------|-----|
| `@param`      | Describe un parámetro del método |
| `@return`     | Qué devuelve el método |
| `@throws`     | Qué excepción lanza |
| `@author`     | Autor del código |
| `@version`    | Versión del archivo o clase |
| `@see`        | Enlaces a clases o métodos relacionados |
| `@deprecated` | Marca el elemento como obsoleto |

---

## 🎯 Estilo Profesional

- Usa **tercera persona** o infinitivo: "Devuelve", "Establece", "Calcula".
- Sé **claro, conciso y específico**.
- Evita comentarios redundantes si el nombre del método lo explica todo.
- Usa `{@link Clase}` o `{@inheritDoc}` si aplica.

---

¡Con esta guía tu código será mucho más entendible y profesional! 🚀
