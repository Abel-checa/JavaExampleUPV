
public class Persona { // Esta es la declaracion de la clase donde le damos el nombre de Persona 

    // Atributos de clase Persona (Persona.name y Persona.age)
    private String name;
    private int age;

    // Metodo de Clase --> Ya que es un metodo al que solo se puede acceder desde la clase persona
    public void Inicializar(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Metodo de Clase --> Ya que es un metodo al que solo se puede acceder desde la clase persona
    public void PrintPersona(){
        System.out.println("Nombre:"+this.name);
        System.out.println("Edad:"+this.age);
    }
    // Metodo de Clase --> Ya que es un metodo al que solo se puede acceder desde la clase persona
    public void MayorEdad(){
        if(this.age >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }
}
