package models;

public class Persona {
    public static final char HOMBRE='h';
    public static final char MUJER='M';
    public static final Integer BAJO_PESO=-1;
    public static final Integer PESO_NORMAL=0;
    public static final Integer SOBREPESO=1;
    private Integer edad;
    private String nombre;
    private String dni;
    private char sexo;
    private Integer peso;
    private Integer altura;

    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.sexo = Persona.HOMBRE;
        this.peso = 0;
        this.altura = 0;
        this.dni = generaDNI();
    }
    public Persona(String nombre, Integer edad, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.dni = generaDNI();
    }

    public Persona(Integer edad, String nombre, char sexo, Integer peso, Integer altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer calcularIMC()
    {
        Double result= (getPeso()/Math.pow(getAltura(),2))/100;
        if(result<20) return Persona.BAJO_PESO;
        if (20<=result&&result<=25) return Persona.PESO_NORMAL;
        return Persona.SOBREPESO;
    }

    public Boolean mayorDeEdad()
    {
        return edad >= 18;
    }

    private Boolean comprobarSexo(char sexo){
        Boolean result=sexo==Persona.HOMBRE||sexo==Persona.MUJER;
        if(!result){
            this.sexo=Persona.HOMBRE;
        }
        return result;
    }

    private String generaDNI()
    {
        StringBuilder dni= new StringBuilder();
        for (int i=0;i<8;i++)
        {
            dni.append(Math.random() * 9);
        }
        return dni.toString();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
}
