import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EXC 1
        // Crear un vector de X posiciones y por consola ir pasando sus respectivos valores Integer.
        // Luego determinar si hay (y cuántos) número 3 e imprimirlo por consola.

/*        int vector [] = new int[5];
        Scanner scanner = new Scanner (System.in);

        for (int i=0; i<vector.length; i++) {
            System.out.println("Write a number for the Vector");
            vector[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i<vector.length; i++) {
            if (vector[i] == 3) {
                count += 1;
            }
        }

        if (count == 0) {
            System.out.println("The are no numbers 3 in the Vector.");
        } else {
            System.out.println("The count of numbers 3 is: " + count);
        }*/

        // EXC 2
        // Crear una matriz de 4x4 que te permita ingresar 3 notas de 4 alumnos diferentes.
        // En la última fila, agregar los promedios de las 3 notas.
        // Luego, mostrar todo por pantalla.

        Double matrix [][] = new Double[4][4];
        Scanner scanner = new Scanner(System.in);
        Double count = 0.0;

        for (int r=0; r<4; r++) {
            for (int c=0; c<3; c++) {
                System.out.println("Write the notes for the student n° " + (r+1));
                matrix[r][c] = scanner.nextDouble();
                count = count + matrix[r][c];
            }

            matrix[r][3] = count/3;
            count = 0.0;
        }
        for (int r=0; r<4; r++) {
            System.out.println("The grades for the student n° " + (r+1) + " are: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Grade " + (c+1) + " is: " + matrix[r][c]);
            }
            System.out.println("The average of the grades is: " + matrix[r][3]);
        }
    }
}