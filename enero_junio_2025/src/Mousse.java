public class Mousse {
    //Atributos
   private String marca;
   private String modelo;
   private String color;
   //private modificador de acceso

//Encapsulamiento
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    //toString
    public String toString() {
        return "Mousse{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    //Constructor
    public Mousse(){
    }
    public Mousse(String marca){
        this.marca =marca;
    }
    public Mousse (String marca, String modelo){
        this.marca =marca;
        this.modelo = modelo;
    }
    public Mousse (String marca, String modelo, String color){
        this.marca =marca;
        this.modelo = modelo;
        this.color =color;
    }
}
