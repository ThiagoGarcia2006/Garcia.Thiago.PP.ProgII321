package examenthiagogarcia321;

public class Arbol extends Planta {
    
    private double alturaMaxima;

    public Arbol(String nombre, String ubicacion, String clima, double alturaMaxima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void podar() {
        System.out.println("Podando el árbol " + getNombre() + ". Altura máxima: " + alturaMaxima + " metros.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Altura Máxima: " + alturaMaxima + " metros";
    }
    
}

