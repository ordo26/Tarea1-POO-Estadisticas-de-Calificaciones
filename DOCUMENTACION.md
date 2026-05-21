# DOCUMENTACION DEL PROYECTO

## 1. Descripcion del programa

Este programa fue desarrollado en Java utilizando arreglos unidimensionales para almacenar y procesar calificaciones de estudiantes.

El sistema permite ingresar exactamente 8 calificaciones, validarlas y generar un reporte estadistico con informacion relevante sobre el rendimiento academico.

El programa implementa conceptos fundamentales de programacion como:
* Arreglos
* Metodos
* Ciclos
* Validacion de datos
* Manejo de errores
* Operaciones matematicas
* Formato de salida

---

## 2. Explicacion de cada metodo

* main: Metodo principal del programa. Se encarga de iniciar la ejecucion, solicitar las calificaciones mediante un ciclo, verificar su validez e invocar el reporte final.
* leerCalificaciones: Solicita al usuario una linea de texto con las notas separadas por comas. Utiliza el metodo split para dividirlas y un bloque try-catch para capturar errores de formato si se ingresan letras.
* validarCalificaciones: Evalua que el arreglo contenga los 8 elementos requeridos y que cada nota se encuentre en el rango permitido de 0 a 100.
* calcularPromedio: Suma todas las notas validas almacenadas en el arreglo y las divide entre el total de elementos para obtener la media aritmetica.
* encontrarMaximo: Recorre el arreglo secuencialmente comparando los valores para identificar y retornar la calificacion mas alta.
* encontrarMinimo: Recorre el arreglo para identificar y retornar la calificacion mas baja del grupo.
* contarAprobados: Evalua cada posicion del arreglo y cuenta cuantos alumnos obtuvieron una calificacion mayor o igual a 70.
* mostrarReporte: Recibe las calificaciones validas, calcula las metricas invocando a los metodos anteriores y despliega los resultados de forma ordenada en la consola.

---

## 3. Flujo del programa

El orden logico de ejecucion del sistema sigue los siguientes pasos secuenciales:

1. El programa inicia y solicita al usuario el ingreso de 8 calificaciones separadas por comas.
2. El metodo leerCalificaciones recibe la entrada y valida que sean exactamente 8 elementos de tipo numerico. Si falla, genera un error y solicita los datos nuevamente.
3. El metodo validarCalificaciones revisa que cada nota este entre 0 y 100. Si alguna nota se sale del rango, muestra un error y reinicia el ciclo de captura.
4. Una vez obtenidos los datos correctos, se rompe el ciclo de lectura.
5. Se ejecutan internamente los metodos estadisticos para calcular el promedio, la nota maxima, la nota minima y el conteo de aprobados y reprobados.
6. El metodo mostrarReporte imprime en pantalla las notas procesadas y los resultados estadisticos calculados.
7. El programa finaliza su ejecucion de forma segura.

---

## 4. Instrucciones de compilacion y ejecucion

Sigue estos pasos desde la terminal de comandos para compilar y ejecutar el programa en tu computadora:

1. Abre la terminal o consola del sistema.
2. Dirigete a la carpeta donde guardaste el archivo ejecutable mediante el comando cd.
3. Compila el codigo fuente de Java escribiendo el siguiente comando:
   javac CalculadoraCalificaciones.java
4. Ejecuta el programa compilado escribiendo el siguiente comando:
   java CalculadoraCalificaciones

---

## 5. Ejemplos de salida

### Caso de exito (Datos correctos)
```text
Ingrese 8 calificaciones separadas por comas:
Ejemplo: 85,92,78,88,95,75,82,90
> 85,92,78,88,95,75,82,90

--- REPORTE DE CALIFICACIONES ---
Calificaciones: 85.0 - 92.0 - 78.0 - 88.0 - 95.0 - 75.0 - 82.0 - 90.0

Promedio: 85.63
Calificacion maxima: 95.00
Calificacion minima: 75.00
Cantidad de aprobados: 8
Cantidad de reprobados: 0
Porcentaje de aprobados: 100.0%
```

### Caso de error (Cantidad incorrecta de elementos)
```text
Ingrese 8 calificaciones separadas por comas:
> 85,92,78

ERROR: Debe ingresar exactamente 8 calificaciones.

Intente nuevamente.
```

### Caso de error (Datos fuera de rango)
```text
Ingrese 8 calificaciones separadas por comas:
> 85,120,78,88,95,75,82,90

ERROR: La calificacion 120.0 esta fuera del rango permitido (0-100).

Intente nuevamente.
```
