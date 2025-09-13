package Ejercicio3;

public class sinerror {
    int Edad;

    void setEdad(int nuevaEdad) {
        this.Edad = nuevaEdad;
    }

    public static void main(String[] args) {
        sinerror c1 = new sinerror();
        c1.setEdad(10);
        System.out.println("Edad: " + c1.Edad);
    }
}


