package models;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Password {
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";

    private Integer longitud;
    private String contraseña;

    public Password() {
        this.longitud=8;
        this.contraseña=generarPassword();
    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        this.contraseña =generarPassword();
    }
    private String generarPassword(){
        String caracteres= MINUSCULAS+MAYUSCULAS + NUMEROS;
        StringBuilder chars = new StringBuilder();
        String pass="";

        //generar mayusculas
        for(int i=0;i<2;i++)
        {
            chars.append(mayAleatorio());
        }
        //generar numeros
        for(int i=0;i<5;i++)
        {
            chars.append(numAleatorio());
        }
        //generar minusculas
        for(int i=0;i<1;i++)
        {
            chars.append(minAleatorio());
        }

        while (pass.length()<longitud)
        {
            if(!esFuerte(pass)){
                int pos= ((int) (Math.random() * chars.length()));
                String caracter= String.valueOf(chars.charAt(pos));
                pass+=caracter;
                chars = new StringBuilder(chars.toString().replaceFirst(caracter, ""));
            }
            else {
                pass+=caracteres.charAt((int) (Math.random()*caracteres.length()));
            }
        }

        return pass;
    }

    private Boolean esFuerte(String pass)
    {
        int contMay=0;
        int contNum=0;
        int contMin=0;

            for (int i = 0; i < pass.length(); i++) {
                char letra = pass.charAt(i);
                contMay += contarCaracteres(letra, MAYUSCULAS);
                contMin += contarCaracteres(letra, MINUSCULAS);
                contNum += contarCaracteres(letra, NUMEROS);
            }


        return contMay>=2 && contNum>=5 && contMin>=1;

    }

    private int contarCaracteres(char caracter,String palabra){
        return (int) palabra.toString().chars().filter(letra->letra==caracter).count();
    }

    private String numAleatorio(){
        return String.valueOf(NUMEROS.charAt((int) (Math.random() * NUMEROS.length())));
    }
    private String mayAleatorio(){
        return String.valueOf(MAYUSCULAS.charAt((int) (Math.random() * MAYUSCULAS.length())));
    }
    private String minAleatorio(){
        return String.valueOf(MINUSCULAS.charAt((int) (Math.random() * MINUSCULAS.length())));
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}