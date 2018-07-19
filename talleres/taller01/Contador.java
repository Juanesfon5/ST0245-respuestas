public class Contador {
    private String id;
    private int contador;

    public Contador(String id) {
        this.id = id;
        contador = 0;
    }

    public void incrementar() {
        contador += 1;
    }

    public int incrementos() {
        return contador;
    }

    public String toString() {
        return String.format("Contador '%s': %d", id, contador);
    }
}
