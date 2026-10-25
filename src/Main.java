import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el nombre de la persona:");
        String nombre= sc.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese la cuidad:");
        String ciudad = sc.nextLine();

        System.out.println("Ingrese su salario: ");
        int sueldo = sc.nextInt();

        sc.nextLine();

        System.out.println("Tiene 40h de trabajo? Si/No (bono);");
        String Bono = sc.nextLine();

        Persona p = new Persona(nombre, edad, ciudad);


        p.mostrardatos();




    }
}