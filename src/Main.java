import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        //variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        //A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        //diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        //variable C.

        int n = 10;
        double a = 10.22;
        char c = 'C';
        int representacion = (int) c;
        System.out.println(n);
        System.out.println(a);
        System.out.println(c);
        System.out.println(n + a);
        System.out.println(a - n);
        System.out.println("El valor ASCII es: " + representacion);

        //2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
        //variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
        //por pantalla una serie de operaciones entre ellas.

        int x = 50;
        int y = 100;
        double m = 20.44;
        double l = 70.08;
        System.out.println(y / x);
        System.out.println(y * x);
        System.out.println(m + l);
        System.out.println(l / m);

        //3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
        //escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        //valor a 3, duplicar su valor.

        int numero1 = 70;
        System.out.println(numero1 + 77);
        System.out.println(numero1 - 3);
        System.out.println(numero1 * 2);

        //4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        //cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        //valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

        int numeroA = 8;
        int numeroB = 23;
        System.out.println(numeroB);
        int numeroC = 10;
        System.out.println(numeroC);
        int numeroD = 49;
        numeroB = numeroC;
        numeroC = numeroA;
        System.out.println(numeroB);
        System.out.println(numeroC);
        numeroA = numeroD;
        numeroD = numeroB;
        System.out.println(numeroA);
        System.out.println(numeroD);

        //5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        //continuación mostrar un mensaje indicando si A es par o impar.

        int numeroParOImpar = 33;
        if(numeroParOImpar % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

        //6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        //continuación mostrar un mensaje indicando si el valor de B es positivo o negativo

        int posOneg = -2;
        if(posOneg > 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }

        //7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        //continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        //si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        //100.

        int numeroX = 120;
        if(numeroX > 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }

        if(numeroX % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

        if(numeroX % 5 == 0){
            System.out.println("El numero es multiplo de 5");
        }
        else{
            System.out.println("El numero NO es multiplo de 5");
        }

        if(numeroX % 10 == 0){
            System.out.println("El numero es multiplo de 10");
        }
        else{
            System.out.println("El numero NO es multiplo de 10");
        }

        if(numeroX > 100){
            System.out.println("El numero es mayor que 100");
        } else if (numeroX < 100) {
            System.out.println("El numero es menor que 100");
        }
        else {
            System.out.println("El numero es igual que 100");
        }

        //8. Programa Java que lea un nombre y muestre por pantalla:
        //“Buenos días, {NOMBRE}”.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresá tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos días " + nombre);

        //9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        //ese número y lo muestre por pantalla.

        System.out.println("Por favor ingresá un número entero: ");
        int ingreseNro = scanner.nextInt();
        System.out.println("El doble de " + ingreseNro + " es " + ingreseNro * 2);
        System.out.println("El triple de " + ingreseNro + " es " + ingreseNro * 3);

        //10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
        //centígrados

        System.out.println("Ingrese la temperatura Fahrenheit que desea convertir: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura en Celsius es: " + celsius);

        //11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        //muestra por pantalla la longitud y el área de la circunferencia.

        System.out.println("Ingresa el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);

        //12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        System.out.print("Ingresa la velocidad en km/h: ");
        double velocidadKmh = scanner.nextDouble();
        double velocidadMs = velocidadKmh * 1000 / 3600;
        System.out.println("La velocidad en m/s es: " + velocidadMs);

        //13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
        //longitud de la hipotenusa según el teorema de Pitágoras.

        System.out.print("Ingresa la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

        //14. Programa que calcula el volumen de una esfera.

        System.out.print("Ingresa el radio de la esfera: ");
        double radioX = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radioX, 3);

        System.out.println("El volumen de la esfera es: " + volumen);

        //15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

        System.out.print("Ingresa la longitud del lado a: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado b: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado c: ");
        double ladoC = scanner.nextDouble();

        // Calcular el semiperímetro
        double s = (ladoA + ladoB + ladoC) / 2;

        // Calcular el área del triángulo utilizando la fórmula de Herón
        double areaTriangulo = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        System.out.println("El área del triángulo es: " + areaTriangulo);

        //16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.

        System.out.print("Ingresa un número de 3 cifras: ");
        int numero = scanner.nextInt();

        int cifraCentenas = numero / 100;
        int cifraDecenas = (numero % 100) / 10;
        int cifraUnidades = numero % 10;

        System.out.println("Cifra de las centenas: " + cifraCentenas);
        System.out.println("Cifra de las decenas: " + cifraDecenas);
        System.out.println("Cifra de las unidades: " + cifraUnidades);

        //17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
        //posiciones impares.

        //18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
        //segundos respectivamente, y comprueba si la hora que indican es una hora válida.

        System.out.print("Introduce la hora (entre 0 y 23): ");
        int hora = scanner.nextInt();
        System.out.print("Introduce los minutos (entre 0 y 59): ");
        int minutos = scanner.nextInt();
        System.out.print("Introduce los segundos (entre 0 y 59): ");
        int segundos = scanner.nextInt();

        // Comprobamos si la hora es válida
        boolean horaValida = (hora >= 0 && hora <= 23) && (minutos >= 0 && minutos <= 59) && (segundos >= 0 && segundos <= 59);

        if (horaValida) {
            System.out.println("La hora " + hora + ":" + minutos + ":" + segundos + " es una hora válida.");
        } else {
            System.out.println("La hora " + hora + ":" + minutos + ":" + segundos + " no es una hora válida.");
        }
    }
} 