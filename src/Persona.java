public class Persona
{
    String nombre;
    int edad;
    String ciudad;
    double sueldo;
    boolean Bono;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.sueldo= sueldo;
        this.Bono = Bono;
    }

    public String mayus(String mensaje) {
        if (mensaje != null) {
            return mensaje.toUpperCase();
        }
        return "";
    }

    public String mayoredad (int edad)
    {
        if (edad >= 18)
        {
            return " Es mayor de edad";

        } else
        {
            return " Es menor de edad";
        }
    }

    public double calcularSueldo(){
        if (Bono){
            return sueldo +20;
        }
        return sueldo;
    }
    public void mostrardatos()
    {
        System.out.println(" Nombre: "+ mayus(nombre));
        System.out.println(" Edad: "+ edad + " ("+mayoredad(edad)+")");
        System.out.println(" Ciudad: "+ mayus(ciudad));

        if (mayoredad()){
            System.out.println("De cuanto es su sueldo:"+sueldo);
            System.out.println("Bono por horas trabajadas:"+ Bono);
            System.out.println("Sueldo total a recibir: "+ calcularSueldo());

        }


    }


}

