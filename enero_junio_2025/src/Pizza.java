public class Pizza {
    private String tamanio;
    private int precio;
    private int tiempoPreparacion;


    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }

    //constructor
    public Pizza(){
    }
    public Pizza(int precio){this.precio = precio;}
    public Pizza(String tamanio, int tiempoPreparacion){
        this.precio = precio;
        this.tamanio = tamanio;
        this.tiempoPreparacion = tiempoPreparacion;
    }
}
