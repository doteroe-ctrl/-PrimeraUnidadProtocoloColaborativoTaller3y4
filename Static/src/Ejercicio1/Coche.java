package Ejercicio1;


public class Coche {
    String Marca;
    String Modelo;
    
    
    static int Contadordecoches= 0;
    static void mostrarContador(){
        System.out.println("Coches creados: " + Contadordecoches);
    }

    public Coche( String Marca ,String Modelo ) {
    this.Marca= Marca;
    this.Modelo= Modelo;
    Contadordecoches++;}
    public static void main(String[] args) {
     Coche c1 = new Coche("Kia", "Rio");
     Coche c2 = new Coche("Nissan", "Sentra");
     Coche c3 = new Coche("BMW", "Serie 3");   
     Coche.mostrarContador();
    }
}
