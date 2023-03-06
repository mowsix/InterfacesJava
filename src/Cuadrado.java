public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado(){
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public void dibujar() {

    }
}
