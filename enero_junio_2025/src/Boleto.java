public class Boleto {
    private int precio;
    private String fecha;
    private String asiento;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "precio=" + precio +
                ", fecha='" + fecha + '\'' +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}

