package models;

import java.util.Arrays;
import java.util.Locale;

public class Password {
    private static final String[] MINUSCULAS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s","t", "u", "v", "w", "x", "y", "z"};

    private static final String[] MAYUSCULAS= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] NUMEROS= {"0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private Integer longitud;
    private String contraseña;

    public Password() {
        this.longitud=8;
    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        this.contraseña =generarPassword();
    }
    private String generarPassword(){
        String pass="";
        String characters= Arrays.toString(MAYUSCULAS) + Arrays.toString(MINUSCULAS) + Arrays.toString(NUMEROS);
        for(int i=0;i<longitud;i++)
        {

        }
        return pass;
    }

    private Boolean esFuerte(String pass)
    {
        int contMay=0;
        int contNum=0;
        int contMin=0;
        for (int i=0;i<longitud;i++)
        {
            char letra=pass.charAt(i);
            contMay+=contarCaracteres(letra, Arrays.toString(MAYUSCULAS));
            contMin+=contarCaracteres(letra, Arrays.toString(MINUSCULAS));
            contNum+=contarCaracteres(letra, Arrays.toString(NUMEROS));
        }

        return contMay>=2 && contNum>=5 && contMin>=1;

    }

    private int contarCaracteres(char caracter,String palabra){
        return (int) palabra.toString().chars().filter(letra->letra==caracter).count();
    }

}