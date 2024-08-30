/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Cristof Zzz
 */
public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce el primer número:");
        Integer num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        Integer num2 = scanner.nextInt();
        System.out.println("Introduce el tercer número:");
        Integer num3 = scanner.nextInt();

        
        Integer[] numbers = {num1, num2, num3};

       
        Arrays.sort(numbers, Collections.reverseOrder());

        
        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce un número entre 0 y 9999:");
        int num = scanner.nextInt();

        
        if (num >= 0 && num <= 9999) {
            
            int cifras = String.valueOf(num).length();
            System.out.println("El número tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número está fuera del rango permitido.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce una nota entre 0 y 10:");
        float nota = scanner.nextFloat();

        
        if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota fuera del rango permitido.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

       
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();

        
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();

        
        System.out.println("Introduce el año:");
        int año = scanner.nextInt();

        
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (año > 0)) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();

        
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();

        
        System.out.println("Introduce el año:");
        int año = scanner.nextInt();

        
        boolean fechaValida = false;

        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 1 && dia <= 31) {
                fechaValida = true;
            }
        } 
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                fechaValida = true;
            }
        } 
        else if (mes == 2) {
            if (dia >= 1 && dia <= 28) {
                fechaValida = true;
            }
        }

        
        if (fechaValida && año > 0) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Introduce la hora (0-23):");
        int hora = scanner.nextInt();

        
        System.out.println("Introduce los minutos (0-59):");
        int minutos = scanner.nextInt();

        
        System.out.println("Introduce los segundos (0-59):");
        int segundos = scanner.nextInt();

        
        if ((hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)) {
            
            segundos++;

            
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }

            
            System.out.println("La hora en el segundo siguiente es: " + hora + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        
        do {
            
            System.out.println("Introduce un número (un número negativo para salir):");
            numero = scanner.nextInt();

            
            if (numero >= 0) {
                
                int cuadrado = numero * numero;
                
                System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            } else {
                
                System.out.println("Número negativo introducido. Saliendo...");
            }

        } while (numero >= 0); 
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sueldos = new double[10];
        double suma = 0;
        int mayoresDe1000 = 0;

        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Introduce el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
            suma += sueldos[i];
            if (sueldos[i] > 1000) {
                mayoresDe1000++;
            }
        }

        
        System.out.println("La suma total de los sueldos es: " + suma);

        
        System.out.println("Número de sueldos mayores de 1000 €: " + mayoresDe1000);
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        
        do {
            System.out.print("Introduce un número entre 0 y 10: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);

        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

public class ejercicioos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[6];
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Introduce la nota del alumno " + (i + 1) + " (0-10): ");
                notas[i] = scanner.nextInt();
            } while (notas[i] < 0 || notas[i] > 10);

            
            if (notas[i] >= 5) {
                aprobados++;
            } else if (notas[i] == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        
        System.out.println("Número de alumnos aprobados: " + aprobados);
        System.out.println("Número de alumnos condicionados (nota 4): " + condicionados);
        System.out.println("Número de alumnos suspensos: " + suspensos);
    }
}
