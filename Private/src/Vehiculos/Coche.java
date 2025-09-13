package Vehiculos;
public class Coche {
    private String marca, modelo;
    private int velocidadMaxima;

    public void acelerar(int incremento){
        if (incremento > 0){
            velocidadMaxima ++;
            System.out.println("Se ha incrementado");

        } else {
            System.out.println("El incremento debe ser positivo");
        }
    }


}
