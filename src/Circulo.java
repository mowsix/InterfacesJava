public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo(){

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public void dibujar() {

    }

    @Override
    public void rotar() {

    }
}
