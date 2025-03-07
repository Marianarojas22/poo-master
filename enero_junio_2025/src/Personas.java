public class Personas {
    private String nombre;
    private Personas izquierda;
    private Personas derecha;
    public Personas(String nombre) {
        this.nombre = nombre;
    }
    public void asignarizquierda (Personas p){
        this.izquierda= p;
        p.derecha=this;
    }
    public void asignarderecha (Personas p){
        this.derecha= p;
        p.izquierda=this;
    }
    public void mostrarConexiones(){
        String izq;
        if(izquierda != null){
            izq=izquierda.nombre;
        } else {
            izq= "Nadie";
        }
        String der;
        if(derecha!=null){
            der=derecha.nombre;
        } else {
            der="Nadie";
        }
        System.out.println(nombre + "Tiene a la izquierda a" + izq + "Tiene a la derecha a" + der);
    }




}

