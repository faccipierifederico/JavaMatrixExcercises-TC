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

/*        Double matrix [][] = new Double[4][4];
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
        }*/


        // EXC 3
        // Realizar 3 vectores diferentes. En el primero colocar ciudades, y en los otros dos temperaturas mínimas y máximas respectivamente.
        // Luego mostrar por pantalla qué ciudad tubo T mínima y cuál la máxima.

/*        String cities[] = new String[5];
        Double min[] = new Double[5];
        Double max[] = new Double[5];

        Scanner city = new Scanner(System.in);
        Scanner temp = new Scanner(System.in);

        for (int i=0; i< cities.length; i++) {
            System.out.println("Write the name of the city " + (i+1));
            cities[i] = city.nextLine();

            System.out.println("Write the min T of the city " + (i+1));
            min[i] = temp.nextDouble();

            System.out.println("Write the max T of the city " + (i+1));
            max[i] = temp.nextDouble();
        }

        Double minium = 99999.00;
        int posMin = -1;

        for (int i=0; i< cities.length; i++) {
            if (min[i]<minium) {
                minium = min[i];
                posMin = i;
            }

        }

        Double maximum = -99999.00;
        int posMax = -1;

        for (int i=0; i< cities.length; i++) {
            if (max[i]>maximum) {
                maximum = max[i];
                posMax = i;
            }
        }
        System.out.println("The minium T was: " + minium);
        System.out.println("And happened in: " + cities[posMin]);
        System.out.println("The maximum T was: " + maximum);
        System.out.println("And happened in: " + cities[posMax]);*/

        // EXC 4
        // La idea es hacer una app para una empresa de viajes con 6 destinos y en 3 turnos disponibles. La gente tiene que ir y sacar sus vuelos.

        int flights[][] = new int [6][3];

        Scanner scanner = new Scanner(System.in);

        for (int r=0; r<6; r++) {
            for (int c=0; c<3; c++) {
                System.out.println("Write the number of seats available for the destination: " + r + " time: " + c);
                flights[r][c] = scanner.nextInt();
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        String flag = "";
        int destination, time, seats;

        while (!flag.equalsIgnoreCase("finish")) {
            System.out.println("Write the N° of the destination");
            destination = scanner.nextInt();
            System.out.println("Write the time of the flight");
            time = scanner.nextInt();
            System.out.println("Write the amount of seats");
            seats = scanner.nextInt();

            if (destination >= 0 && destination <= 5) {
                if (time >= 0 && time <= 2) {
                    if (flights[destination][time] >= seats) {
                        System.out.println("Your reservation was a succes");
                        flights[destination][time] = flights[destination][time] - seats;
                    } else {
                        System.out.println("There is no seat available");
                    }
                } else {
                    System.out.println("The time of the flight no exists. Choose between 0 and 2");
                }
            } else {
                System.out.println("The destination of the flight no exists. Choose between 0 and 5");
            }

            System.out.println("Do you want to continue buying? If you want, write anything. If you don't, write 'finish'.");
            flag = scanner1.next();
        }
     }
}