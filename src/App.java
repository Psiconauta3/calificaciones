import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
    Scanner dato=new Scanner(System.in); //guarda el nombre
    Scanner dato2=new Scanner(System.in); //guarda las notas
    Scanner dato5=new Scanner(System.in); //guarda el total de estudiantes
    
    int totalEstudiantes=0;
    int suma=0;
    double promedio=0;
   
    System.out.println("Coloque el numero de estudiantes a ingresar");
    totalEstudiantes=dato5.nextInt();
    System.out.println("Muy bien, a continuacion ingrese la informacion para " + totalEstudiantes +  " estudiantes:");
    
    for (int estudiantes =0; estudiantes < totalEstudiantes; estudiantes++) {  
        int i;
        String nombre="";
        int nota1, nota2, nota3;
        nota1=nota2=nota3=0;
        System.out.println("Ingresa el nombre del estudiante"); //nombre de cada estudiante
        nombre=dato.nextLine();
    
        System.out.println("Ingrese la primer calificacion de " + nombre); //primer nota
        nota1=dato2.nextInt();
    
        System.out.println("Ingrese la segunda calificacion de " + nombre); //segunda nota
        nota2=dato2.nextInt();
    
        System.out.println("Ingrese la tercera calificacion de " + nombre); //tercer nota
        nota3=dato2.nextInt();
    
        //obtener el promedio por estudiante
        int[] notas = {nota1, nota2, nota3}; //almacena las notas
        for (i =0; i < notas.length; i++) {
            suma += notas[i];
            promedio = suma / 3;
        }
        System.out.println("El promedio de "+nombre +" es: " + promedio);
            
        //determina si aprobo o no
        if (promedio >= 6) {
            suma=0;
            promedio=0;
            System.out.println(nombre + " aprobo");
         
        }   else if (promedio < 6) {
            System.out.println(nombre + " reprobo");
        }
    
    }
}
}