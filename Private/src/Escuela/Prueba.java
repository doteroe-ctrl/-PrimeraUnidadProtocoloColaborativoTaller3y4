package Escuela;
public class Prueba {
    public static void main(String[] args) {
        
    

    Estudiante e1 = new Estudiante();

    e1.setNombre("Daniel"); //accedemos atraves de setters que son public
    e1.setEdad(20);
    e1.setNotaPromedio(4.5);

    // e1.nombre = "daniel"; //no se puede acceder porque el atributo es private

    }

}
