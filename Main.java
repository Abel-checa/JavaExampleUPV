
// La clase Main va a ser la que ejecute el codigo, asi que aqui es donde de normal tendriamos el flujo del codigo
public class Main {
    public static void main(String[] args) { 
        // Esta es nuestra funcion main la cual recoge unos argumentos, pero nos centraremos en el codigo interno del cuerpo de la funcion 

        // Aqui vamos a ver dos formas de declarar el objeto de clase Persona
        Persona p1; // Esta forma es con varios pasos , en la que le digo que va a ser del tipo persona y que el nombre de la variable es p1
        p1 = new Persona(); // Instancia o inicializacion de el objeto, es decir que aqui p1 ya es un objeto del tipo persona

        // La gran diferencia es que cuando la declaras simplemente le estas diciendo el tipo de dato, cuando hacemos new Persona ya es un objeto
        p1.Inicializar("Abel", 20); // Al ser un objeto del tipo persona tendra acceso a todos los metodos de clase, aqui ya se le dan unos valores

        Persona p2 = new Persona(); // Esta es la forma completa, diciendo el tipo e instanciando la clase
        p2.Inicializar("Andrea", 17);

        // De las dos maneras p1 y p2 pueden utilizar cualquier metodo de Persona
        p1.MayorEdad();
        p2.MayorEdad();

        p1.PrintPersona();
        p2.PrintPersona();

    }
}