import models.Password;
import models.Persona;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre=scanner.nextLine();
        System.out.println("Ingrese una edad: ");
        Integer edad=scanner.nextInt();
        System.out.println("Ingrese un sexo: ");
        char sexo= (char) scanner.nextInt();
        System.out.println("Ingrese un peso: ");
        Integer peso=scanner.nextInt();
        System.out.println("Ingrese una altura: ");
        Integer altura=scanner.nextInt();
        Persona persona1=new Persona(edad,nombre,sexo,peso,altura);
        Persona persona2=new Persona(nombre,edad,sexo);
        Persona persona3=new Persona();

        persona3.setPeso(84);
        persona3.setAltura(180);
        persona3.setEdad(20);
        persona3.setNombre("Jero");
        HashMap<String, Persona> personas=new HashMap<>();

        personas.put(persona1.getDni(),persona1);
        personas.put(persona2.getDni(),persona2);
        personas.put(persona3.getDni(),persona3);
*/
        Password password=new Password(8);

        System.out.println(password);




    }
}