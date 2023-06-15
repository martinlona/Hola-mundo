
import java.util.Scanner;


// Nuestro priemr programa Hola Mundo
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo de Java");

        int miVariable = 10;
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
        System.out.println("Resultado: " +titulo2+" "+usuario2);
      
        
            }
}

        
        
        