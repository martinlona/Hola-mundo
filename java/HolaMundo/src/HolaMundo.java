
import java.util.Scanner;

// Nuestro priemr programa Hola Mundo
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo de Java");

        /* int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo Sting
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
        // Var - interferncia de tipo en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVaraibleEntera2 = " + miVariableEntera2);
        System.out.println("miVaraibleCadena2 = " + miVariableCadena2);
        // soutv - tab
        // Para ejecutar SHIFT + F& es la tecla para mayusculas

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio: Caracteres especiales con Java
        
        var nombre = "Natalia";
        System.out.println("NUeva linea: \n"+nombre);// Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);//Caracter de retroceso
        System.out.println("nombre = " + nombre);
        
        // Clase Scanner
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite su nombre: " );
        var usuario2 = entrada.nextLine();                                           
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo:");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " +titulo2+" "+usuario2);*/
 /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
            System.out.println("Solucion de la suma : " + solucion);
            
        solucion = num1 - num2;
            System.out.println("Solucion de la resta: " + solucion);
            
        solucion = num1 * num2;
            System.out.println("Solucion de la multiplicacion:" + solucion);
            
        solucion = num1 / num2;
            System.out.println("Solucion de la division :" + solucion);
            
        var solucion2 = 3.4 / num2;
            System.out.println("Solucion de la division :" + solucion2);
            
        solucion = num1 % num2;//Guarda el residuo entero de la division
            System.out.println("Solucion :" + solucion);// 5/4
            
        if (num1 % 2 == 0) 
                System.out.println("El numero es par");
        else
                System.out.println("El numero es impar");
        
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;// Una operacion
            System.out.println("varNum3 :" + varNum3);
            
        varNum1 += 1; // varNum1 = varNum1 + 1;
            System.out.println("varNum1 :" + varNum1);
        varNum2 -= 2;
            System.out.println("varNum2 :"  + varNum2);
        varNum3 *= 5;
            System.out.println("varNum3: " + varNum3);
        varNum1 /= 4;
            System.out.println("varNum1 :" + varNum1);
        varNum2 %= 6;
            System.out.println("varNum2 : "+ varNum2);*/
        // Operadores Unarios: Cambio de signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA:" + varA);
        System.out.println("varB:" + varB);

        // Operador de Negacion
        var varC = true;// Esta literal por default en JAva es del tipo booleano
        var varD = !varC;// Aqui lo que esta haciendo es invertir el valor
        System.out.println("varC:" + varC);
        System.out.println("varD:" + varD);

        // Operadores Unarios de Incremento: Preincremeto
        var varE = 9;//Se va a modificar su valor
        var varF = ++varE;//Simbolo antes de la variable
        // Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE:" + varE);// Se incrementa en la unidad
        System.out.println("varF:" + varF);//Va a sumar uno            

        //Postincremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++;// Primero el valor de la variable, despues el incremento
        System.out.println("varG:" + varG);
        System.out.println("varH:" + varH);

        // Operadores unarios de decremtno:Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI:" + varI);//La variable esta con decremnto
        System.out.println("varJ:" + varJ);

        //Postdecremento
        var varK = 8;
        var varL = varK--;//Primero el valor de la variable, luego queda el decremetno
        System.out.println("varK:" + varK);// Aqui va a decremetnar en 1
        System.out.println("varL:" + varL);

        // Operadores de iguldad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum:" + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum :" + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = (cadenaA == cadenaB);
        System.out.println("cVar :" + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVAr :" + fVar);

        var gVar = aNum > bNum;// > >= < <0 == !=
        System.out.println("gVar :" + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= 18)
         {
            System.out.println("Es un adulto");
        } else {
            System.out.println("No es adulto");
        }*/
    
        
        //Operador condiconal And
        /*
        var valorA = 7;
        var valorMinimo = 0;// Rango del 1 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if ( respuesta)
            System.out.println("Esta dentro del rango establecido");
        else
            System.out.println("Esta fuera del rango establecido");
        
        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("El papa puede asistir");
        else
            System.out.println("El papa no puede asistir");
        
        //Operador ternario
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT :" + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT :" + resultadoT);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
        System.out.println("z" + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3;// 4 + ((5*6)/3)
        System.out.println("solucionAritemtica: "+ solucionAritmetica);

        solucionAritmetica = ( 4 + 5 ) * 6 / 3;
        System.out.println("solucionAritmetica: " + solucionAritmetica);
        */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = entrada.nextDouble();
        double area = base*altura;
        double perimetro = (base *2) + (altura * 2);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        
        
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo numeor:");
        int n2 = Integer.parseInt(entrada.nextLine());
        int mayor = n1 > n2 ? n1 : n2;
        System.out.println("El mayor es :" + mayor);*/
        
        
        
        
        
        
                    
    }
}
