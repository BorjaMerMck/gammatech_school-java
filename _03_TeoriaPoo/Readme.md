
# Java - Conceptos Básicos

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
