



### `Jugador`

	- `nombre`: `String` – Nombre del jugador.
- `sexo`: `Sexo` (enum) – Género del personaje (`Masculino`, `Femenino`, `Otro`).
- `edad`: `int` – Edad del personaje.
- `dinero`: `double` – Dinero inicial (se añade al crear `Personaje`).

### `Personaje` (extiende `Jugador`)
- `exp`: `double` – Experiencia del personaje.
- `arma`: `Arma` (enum) – Arma equipada.
- `objeto`: `Objeto` (enum) – Objeto activo.
- `inventario`: `Objeto[]` – Inventario limitado a 6 objetos.
- `raza`: `Raza` (enum) – Raza del personaje (`humanos`, `orcos`, `elfos`, `muertosVivientes`).
- `armadura`: `boolean` – Si tiene armadura equipada.
### `Sexo`
- `Masculino`
- `Femenino`
- `Otro`
### `Raza`
- `humanos`
- `orcos`
- `elfos`
- `muertosVivientes`
### `Arma`
- `Espada`
- `Hacha`
- `Arco`
- `Daga`




- El inventario es un array de máximo 6 objetos.
- Si se intenta añadir más de 6 objetos, el programa debe mostrar un mensaje y evitarlo:
- buscar objeto
- opciones de atacar, moverse 
```java
if (inv.length >= 6) {
    syso("Estaa lleno");
}