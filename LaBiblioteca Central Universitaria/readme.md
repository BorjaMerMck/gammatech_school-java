# Proyecto: Sistema de Gestión Bibliotecaria (Java, POO)

## Objetivo
Modernizar el sistema de préstamos y devoluciones de la Biblioteca Central Universitaria mediante un proyecto Java orientado a objetos.

---

## Estructura de Paquetes

```
src/
├── app/
│   └── Main.java
├── enums/
│   └── EstadoRecurso.java
├── interfaces/
│   └── Prestamista.java
└── model/
    ├── DVD.java
    ├── Libro.java
    ├── RecursoBiblioteca.java
    ├── Revista.java
    └── Usuario.java
```

---


<details>
<summary><strong>✅ To-Do List del Proyecto</strong></summary>

### 1. Interfaz `Prestamista` (`interfaces/Prestamista.java`)
- [x] `boolean prestar(RecursoBiblioteca recurso, Usuario usuario)`
- [x] `boolean devolver(RecursoBiblioteca recurso)`

### 2. Enum `EstadoRecurso` (`enums/EstadoRecurso.java`)
- [x] Valores: `DISPONIBLE`, `PRESTADO`, `RESERVADO`

### 3. Clase abstracta `RecursoBiblioteca` (`model/RecursoBiblioteca.java`)
- [x] Atributos:
  - [x] `String id`
  - [x] `String titulo`
  - [x] `EstadoRecurso estado`
- [x] Constructor para `id` y `titulo`
- [x] Getters
- [x] Método abstracto `String descripcion()`

### 4. Subclases de `RecursoBiblioteca`

#### 📖 Clase `Libro` (`model/Libro.java`)
- [x] Atributo: `String autor`
- [x] Implementar método `descripcion()`

#### 📚 Clase `Revista` (`model/Revista.java`)
- [x] Atributo: `int numeroEdicion`
- [x] Implementar método `descripcion()`

#### 📀 Clase `DVD` (`model/DVD.java`)
- [x] Atributo: `int duracionMinutos`
- [x] Implementar método `descripcion()`

### 5. Clase `Usuario` (`model/Usuario.java`)
- [x] Atributos:
  - [x] `String id`
  - [x] `String nombre`
- [x] Constructor y getters

### 6. Clase `BibliotecaManager` (pendiente)
- [x] Implementar la interfaz `Prestamista`
  - [x] `devolver`
  - [x] `prestar`
- [x] Atributos:
  - [x] `Map<String, RecursoBiblioteca> recursos`
  - [x] `Map<String, Usuario> usuarios`
- [ ] Métodos:
  - [ ] `agregarRecurso(RecursoBiblioteca recurso)`
  - [ ] `agregarUsuario(Usuario usuario)`
  - [ ] `obtenerRecurso(String id)`
  - [ ] `obtenerUsuario(String id)`
  - [ ] `listarRecursos()`
  - [ ] `prestar(RecursoBiblioteca recurso, Usuario usuario)`
  - [ ] `devolver(RecursoBiblioteca recurso)`

### 7. Clase `Main` (`app/Main.java`)
- [x] Crear instancia de `BibliotecaManager`
- [x] Leer comandos con `Scanner`
- [ ] Implementar menú interactivo:
  - [ ] Comando `prestar <idRecurso> <idUsuario>`
  - [ ] Comando `devolver <idRecurso>`
  - [ ] Comando `listar`
  - [ ] Comando `salir`

---

### 📌 Bonus: Diagrama UML (Opcional, recomendado)
- [ ] Representar claramente:
  - [ ] `BibliotecaManager` (implementa `Prestamista`)
  - [ ] `RecursoBiblioteca` (clase abstracta) y subclases (`Libro`, `Revista`, `DVD`)
  - [ ] `Usuario`
  - [ ] `EstadoRecurso`

</details>
