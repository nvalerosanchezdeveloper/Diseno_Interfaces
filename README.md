# Proyecto Brawlers - Tutorial y Ejercicio

## 📋 Resumen de Archivos Existentes

El proyecto contiene una estructura de **Polymorfismo en Java** basada en el videojuego Brawl Stars:

### Archivos Encontrados:

1. **Brawler.java** - Interfaz base
   - Define dos métodos que todo Brawler debe implementar:
     - `disparar()` - Acción de atacar
     - `mover()` - Acción de moverse

2. **Legendario.java** - Clase que implementa Brawler
   - Atributos: nombre, vida (variable), potencia (1000)
   - Implementa disparar() y mover() con mensajes de salida

3. **Mitico.java** - Clase que implementa Brawler
   - Atributos: nombre, vida (variable), potencia (1000)
   - Implementa disparar() y mover() con mensajes de salida

4. **Epico.java** - Clase que implementa Brawler
   - Atributos: nombre, vida (variable), damage (1000)
   - Implementa disparar() y mover() con mensajes de salida

5. **Main.java** - Clase principal
   - Crea instancias de cada tipo de Brawler
   - Las añade a un ArrayList<Brawler>
   - Llama al método disparar() para todos

6. **result.pdf** - Documento con especificaciones/resultados esperados

---

## 🎯 Cometido Exacto de la Tarea

**Objetivo:** Completar y mejorar la estructura del proyecto Brawlers implementando:

1. ✅ Interfaz `Brawler` con métodos polimórficos (YA EXISTE)
2. ✅ Tres implementaciones (Legendario, Mitico, Epico) (YA EXISTEN)
3. ⚠️ **COMPLETAR:** Crear una nueva clase `Raro.java` que implemente `Brawler`
4. ⚠️ **COMPLETAR:** Mejorar la clase `Main.java` para:
   - Crear instancias de todos los tipos (incluyendo Raro)
   - Llamar a ambos métodos (`disparar()` y `mover()`) para cada Brawler
   - Manejar la colección de forma más eficiente

**Concepto Central:** Practicar **Polimorfismo** mediante:
- Implementación de interfaces
- Método override (@Override)
- ArrayList que acepta elementos de la interfaz (tipo Brawler)
- Iteración sobre colecciones con for-each

---

## 📚 Tutorial Paso a Paso

### Paso 1: Crear la clase `Raro.java`

Crea un nuevo archivo Java llamado `Raro.java` en el mismo paquete que los demás:

```java
package BrawlStars;

public class Raro implements Brawler {
    private final String nombre;
    private int vida;
    private final int ataque = 800;  // Menor que épico/legendario/mítico

    public Raro(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void disparar() {
        System.out.printf("%s (%d vida, %d, raro) disparando...%n", this.nombre, this.vida, this.ataque);
    }

    @Override
    public void mover() {
        System.out.printf("%s (%d vida, %d, raro) moviendo...%n", this.nombre, this.vida, this.ataque);
    }
}
```

**¿Qué hace?**
- Implementa la interfaz `Brawler`
- Tiene un ataque de 800 (menos potente que otros)
- Sobreescribe los métodos `disparar()` y `mover()`

---

### Paso 2: Mejorar la clase `Main.java`

Modifica `Main.java` para incluir Brawlers de todos los tipos y llamar a ambos métodos:

```java
package BrawlStars;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Brawler> brawlers;

    public static void main(String[] args) {
        // Crear instancias de TODOS los tipos
        Legendario leon = new Legendario("León", 8000);
        Legendario spike = new Legendario("Spike", 10000);

        Mitico tara = new Mitico("Tara", 7000);
        Mitico genio = new Mitico("Genio", 4000);

        Epico bo = new Epico("Bo", 6500);
        Epico mortis = new Epico("Mortis", 3000);

        Raro brawler = new Raro("Brawler", 2500);  // Nuevo tipo
        Raro colt = new Raro("Colt", 2000);         // Nuevo tipo

        // Añadir todos al ArrayList
        brawlers = new ArrayList<>();
        brawlers.add(leon);
        brawlers.add(spike);
        brawlers.add(tara);
        brawlers.add(genio);
        brawlers.add(bo);
        brawlers.add(mortis);
        brawlers.add(brawler);
        brawlers.add(colt);

        // Ejecutar ambos métodos (disparar y mover)
        System.out.println("=== DISPARANDO ===");
        for(Brawler b : brawlers) {
            b.disparar();
        }

        System.out.println("\n=== MOVIENDO ===");
        for(Brawler b : brawlers) {
            b.mover();
        }
    }
}
```

**¿Qué cambió?**
- Añadimos dos instancias de tipo `Raro`
- Ejecutamos ambos métodos (`disparar()` y `mover()`)
- Añadimos separadores visuales en la salida

---

### Paso 3: Verificar que todo Compila

1. Abre el proyecto en tu IDE (IntelliJ, Eclipse, etc.)
2. Copia/crea `Raro.java` en el mismo directorio que los otros archivos
3. Modifica `Main.java` según el código anterior
4. **Compila**: `Ctrl+F9` (IntelliJ) o `Build → Build Project`
5. **Ejecuta**: `Shift+F10` (IntelliJ) o click derecho → Run

---

### Paso 4: Salida Esperada

Cuando ejecutes el programa, verás algo como:

```
=== DISPARANDO ===
León (8000 vida, 1000, legendario) disparando...
Spike (10000 vida, 1000, legendario) disparando...
Tara (7000 vida, 1000, mítico) disparando...
Genio (4000 vida, 1000, mítico) disparando...
Bo (6500 vida, 1000, épico) disparando...
Mortis (3000 vida, 1000, épico) disparando...
Brawler (2500 vida, 800, raro) disparando...
Colt (2000 vida, 800, raro) disparando...

=== MOVIENDO ===
León (8000 vida, 1000, legendario) moviendo...
Spike (10000 vida, 1000, legendario) moviendo...
...
```

---

## 🔑 Conceptos Clave

| Concepto | Explicación |
|----------|-------------|
| **Interfaz** | Contrato que define qué métodos deben implementar las clases |
| **Implements** | Palabra clave para que una clase cumpla una interfaz |
| **Override** | Anotación que confirma que estamos sobreescribiendo un método |
| **Polimorfismo** | Capacidad de tratar diferentes tipos de objetos de forma uniforme |
| **ArrayList<Interfaz>** | Colección que acepta cualquier clase que implemente la interfaz |
| **for-each** | Bucle simplificado para iterar sobre colecciones |

---

## ✅ Checklist de Completitud

- [ ] Archivo `Raro.java` creado en BrawlStars/
- [ ] `Raro` implementa correctamente la interfaz `Brawler`
- [ ] `Main.java` creado e instancias de `Raro` añadidas
- [ ] Ambos métodos (`disparar()` y `mover()`) se llaman en Main
- [ ] El proyecto compila sin errores
- [ ] La salida muestra todos los Brawlers de todos los tipos
- [ ] Se suben cambios a GitHub con commit "Vamoh a darle"

---

**¡Listo para comenzar! 🚀**
