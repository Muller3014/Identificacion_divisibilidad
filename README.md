# Calculadora de Divisibilidad en Java

## Descripción
Este proyecto es una aplicación en Java que permite comprobar si un número, incluso uno de gran tamaño, es divisible por ciertos números primos (2, 3, 5, 7 y 11) utilizando reglas matemáticas específicas. La aplicación utiliza la clase BigInteger para manejar números de tamaño arbitrario, superando las limitaciones de los tipos primitivos.

## Componentes del Proyecto

### 1. Divisibilidad
* Ubicada en el paquete "divisibilidad", la clase Divisibilidad contiene métodos estáticos que determinan si un número es divisible por:
  * 2: Comprueba si el número es par.
  * 3: Suma los dígitos del número y verifica si la suma es múltiplo de 3.
  * 5: Evalúa el último dígito del número.
  * 7: Emplea un método basado en aritmética modular, usando los residuos de las potencias de 10 módulo 7.
  * 11: Evalúa la diferencia entre la suma de dígitos en posiciones pares e impares.

### 2. Main
* La clase Main actúa como interfaz de usuario y punto de entrada de la aplicación. Permite:
  * Ingresar un número (se lee como cadena y se convierte a BigInteger).
  * Seleccionar el criterio de divisibilidad mediante un menú interactivo.
  * Mostrar el resultado indicando si el número cumple o no con la condición de divisibilidad seleccionada.

## Estructura del Proyecto

```
DivisibilidadChecker/
└── src/
    ├── divisibilidad/
    │   └── Divisibilidad.java
    └── Main.java
```

* **DivisibilidadChecker**: Directorio raíz del proyecto.
* **src**: Carpeta que contiene el código fuente.
* **divisibilidad**: Directorio (paquete) que contiene la clase Divisibilidad.java.
* **Main.java**: Archivo que contiene la clase principal con el método main.

## Requisitos
* Java JDK 8 o superior.
* Un compilador de Java (por ejemplo, javac) o un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o NetBeans.

## Compilación y Ejecución

### Compilación
1. Abra una terminal y navegue hasta el directorio raíz del proyecto (donde se encuentra la carpeta src).
2. Ejecute el siguiente comando para compilar el proyecto y generar los archivos compilados en una carpeta "bin":
```
javac -d bin src/divisibilidad/Divisibilidad.java src/Main.java
```

### Ejecución
Desde el directorio raíz del proyecto, ejecute el siguiente comando:
```
java -cp bin Main
```

## Flujo del Programa

### 1. Ingreso del Número
* El programa solicita al usuario que ingrese un número. La entrada se recibe como una cadena y se convierte a un objeto BigInteger.

### 2. Selección del Criterio
* Se muestra un menú interactivo con las opciones:
  1. Divisible entre 2
  2. Divisible entre 3
  3. Divisible entre 5
  4. Divisible entre 7
  5. Divisible entre 11

### 3. Resultado
* Tras elegir la opción deseada, el programa procesa el número utilizando el método correspondiente y muestra si el número cumple o no con la condición de divisibilidad.

## Consideraciones Técnicas
* **BigInteger**: La aplicación utiliza BigInteger para trabajar con números de tamaño arbitrario, lo que permite superar las limitaciones de los tipos primitivos como int o long.
* **Operaciones Modulares**: Los métodos de comprobación de divisibilidad emplean técnicas de aritmética modular para asegurar resultados precisos, incluso para números muy grandes.
