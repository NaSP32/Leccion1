
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
       
       int miVariable = 10;
       System.out.println(miVariable);
       miVariable = 5;
       System.out.println(miVariable);
       //tipo String
       String miVariableCadena = "Bienvenidos"; 
       System.out.println(miVariableCadena);
       miVariableCadena = "Sigamos creciendo en programación";
       System.out.println(miVariableCadena);
         

        //Var inferencia de tipos en Java (no tengo la version 10 o+) 
        int miVariableEntera2 = 10;
        String miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //Soutv + tab 
        //para ejecutar Shift + f6
        //Reglas para definir una variable en Java

        String usuario = "Osvaldo";
        String titulo = "Igeniero";
        String union = titulo + " " + usuario;
        System.out.println("union = " + union);

        int a = 8;
        int b = 4;
        System.out.println(usuario + (a + b)); //se modifica la prioridad por los parentesis dentro del parentesis
        //Ejercicio caracteres especiales con Java
        String nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); //diagonal inversa y letra n 
        System.out.println("Tabuador: \t" + nombre); //Tabulador, un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b"+nombre); //caracter de retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'"); //Comillas simples
        System.out.println("Comillas dobles: \""+nombre+"\""); //Comillas dobles */
        //Clase Escanner 
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String usuario2 = entrada.nextLine(); //lee una linea completa de la consola, detiene la ejecucion para que el u ingrese info
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        String titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);*/
        //Ejercicio Libro
        /*Scanner scanner = new Scanner (System.in);
        //El Alquimista fue escrito por Paulo Cohelo
        System.out.println("Proporciona el título: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);*/
 /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte " + Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE );
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647; 
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo de long: "+Long.MIN_VALUE);
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE );*/
 /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de float: "+ Float.MIN_VALUE);
        System.out.println("El valor máximo de float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor mínimo de double es: " + Double.MIN_VALUE);
        System.out.println("El valor máximo de double es: " + Double.MAX_VALUE );*/
        //inferencia de tipos var y tipos primitivos
        //var numEntero = 10; //las literales sin punto, automáticamente son de tipo int
        /*int numEntero = 20; //las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        //var numFloat = 10.0; 
        float numFloat = 10.0F; //automáticamente con el punto, se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        //var numDouble = 10.0; //no lee var en java8
        double numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        //Tipos primitivos char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //indicamos a Java la asignacion con el código unicode (ver tabla)
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);*/
 /*var char varCaracter1 = '\u0024'; //indicamos a Java la asignacion con el código unicode (ver tabla)
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = (char)36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        char varCaracterSimbolo1 = '$'; //un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);*/
 /*int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        //Tipos primitivos tipos booleanos
        /* boolean varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool) { //una llave que abre y otra que cierra 
            System.out.println("La bandera es verde");

        } else {
            System.out.println("La bandera es roja");
        }

        //Algoritmo ¿Es mayor de edad?
        int edad = 18;
        //boolean adulto = edad >= 18; //esta es una expresion booleana
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } 
        else {
            System.out.println("Eres menor de edad"); 
        }*/
        //Conversion de tipos primitivos 
//       //var edad = Integer.parseInt("20");
//        //System.out.println("args = " + args);
//       /* String edad = "20";
//        System.out.println("edad = " + (edad+1));
//       double valorPi = Double.parseDouble("3.1416");
//        System.out.println("valorPi = " + valorPi);
//        
//      //Pedir un valor 
//      Scanner entrada = new Scanner(System.in);
//      System.out.println("Digite su edad: ");
//      edad = Integer.parseInt(entrada.nextLine());
//      System.out.println ("edad = " + edad );*/
//        
        //Conversion de tipos primitivos en Java parte 2
        //aca se hace con var edadTexto = String.valueOf(10); pero en versiones +10
        /*String edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        //aca tambien se hace con var var fraseChar = "Programadores".charAt(0);
        char fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(12);
        System.out.println("fraseChar = " + fraseChar);*/
 /* int num1 = 5, num2 = 4;
        int solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multiplicación = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la división = " + solucion);

        //este ejercicio va con var, pero en mi jdk, no :( 
        double solucion2 = 3.4D / num2;
        System.out.println("solucion2 resultado de la división = " + solucion2);

        solucion = num1 % num2; //guarda el residuo entero de la division, <el resto>  
        System.out.println("solucion = " + solucion);

        if (num2 % 2 == 0) 
            System.out.println("Es un número par");
         else 
            System.out.println("Es un número impar");*/
 /*int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 +=1; // Es igual que varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -=2; // Es igual que varNum2 = varNum2 - 2;
        System.out.println("varNum2 = " + varNum1);
        
        varNum1 *=5; // Es igual que varNum5 = varNum5 * 5;
        System.out.println("varNum1 = " + varNum1);
        
        varNum3 /= 4; // Es igual que varNum1 = varNum3 / 4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6; // Es igual que varNum1 = varNum1 % 1;
        System.out.println("varNum1 = " + varNum1);*/
        //Operadores Unarios: Cambio de Signo
        /* int varA =7;
        int varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//el resultado será un número negativo
        
        //Operador de Negación        
        boolean varC = true;
        boolean varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Peincremento
        int varE = 9; //Se va a modificar su valor
        int varF = ++ varE; //Simbolo antes de la variable 
        //primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //se incrementa en la unidad
        System.out.println("varF = " + varF); //va a sumar uno 
        
        //Postincremento (el símbolo va despues de la variable)
        int varG = 3;
        int varH = varG++; //Primero va el valor de la variable
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de Decremento: Predecremento
        int varI = 4;
        int varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        int varK = 8; 
        int varL = varK--; //Primero el valor de la variable, lego queda el decremento
        System.out.println("varK = " + varK); //aqui va a decrementar en 1
        System.out.println("varL = " + varL); */
        //Operadores de igualdad y relacionales
        /*int aNum = 5;
       int bNum = 4;
       boolean cNum = (aNum == bNum);
       System.out.println("cNum = " + cNum);
       
       boolean dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        String cadenaA = "Hello";
        String cadenaB = "bye bye";
        boolean cVar = cadenaA == cadenaB; //hizo una comparacion de referencias de objetos 
        System.out.println("cVar = " + cVar);
        
        boolean fVar = cadenaA.equals(cadenaB); //aca compara el contenido de los objetos string
        System.out.println("fVar = " + fVar);
        
        Operadores relacionales 
        boolean gVar = aNum != bNum; //< > <= >= == !=
        
        System.out.println('gVar = ' + gVar);*/
        int bNum = 0;
        
        if (bNum % 2 == 0) {
                System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
        int edad = 30;
        int adulto = 18;
        if (edad >= adulto){
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }
        
        /*int valorA = 7;
        int valorMinimo = 0; //creamos un rango del 0 al 10
        int valorMaximo = 10;
        boolean respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        boolean vacaciones = false;
        boolean diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al partido");
        else 
            System.out.println("Papá no puede asistir al partido");
        */
        
        //Operador ternario 
        /*boolean resultadoT = (5 >= 4) ? "Verdadero" : "Falso";
        //System.out.println("resultadoT = " + resultadoT);
        
        int numeroT = 7;
        resultadoT = (numeroT %2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);*/
        
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        int solucionAritmetica = 4+5*6/3; //14  4 + ((5*6) / 3)
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; //18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        
        
        
        
        
    }
}
