package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("\n--- Calculadora en Java ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Conversión de Celsius a Fahrenheit");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = suma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
            }
        }