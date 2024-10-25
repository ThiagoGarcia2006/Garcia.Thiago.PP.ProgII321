package examenthiagogarcia321;

public class Arbusto extends Planta {
    private int densidadFollaje; 

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        if (densidadFollaje < 1 || densidadFollaje > 10) {
            throw new IllegalArgumentException("La densidad de follaje debe estar entre 1 y 10.");
        }
        this.densidadFollaje = densidadFollaje;
    }

    @Override
    public void podar() {
        System.out.println("Podando el arbusto " + getNombre() + ". Densidad de follaje: " + densidadFollaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", Densidad de Follaje: " + densidadFollaje;
    }
}

