
public class Balon {
    private double tamanio;
    private String material;
    private int peso;

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tamanio=" + tamanio +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                '}';
    }
}
