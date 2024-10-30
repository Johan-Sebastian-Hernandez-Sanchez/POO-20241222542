package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        // Crear dos cuadrados y dos triángulos
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 5);
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 0, 0, "Azul", 10);
        Triangulo triangulo1 = new Triangulo("Triangulo1", 0, 0, "Verde", 8, 6);
        Triangulo triangulo2 = new Triangulo("Triangulo2", 0, 0, "Amarillo", 5, 4);

        // Almacenar en un array
        Forma[] formas = { cuadrado1, cuadrado2, triangulo1, triangulo2 };

        // MEJORA 1: Calcular la suma de las áreas y la media de las áreas de los cuadrados
        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
        System.out.println("Media de las áreas de los cuadrados: " +
                (contadorCuadrados > 0 ? sumaAreasCuadrados / contadorCuadrados : 0));

        // MEJORA 3: Calcular la suma de los perímetros
        double sumaPerimetros = 0;
        for (Forma forma : formas) {
            sumaPerimetros += forma.calcularPerimetro();
        }
        System.out.println("Suma de los perímetros de todas las formas: " + sumaPerimetros);
    }
}