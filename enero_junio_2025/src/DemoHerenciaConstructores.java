import java.lang.annotation.ElementType;
public class DemoHerenciaConstructores {
    public static void main(String[] args) {
        Elefante dumbo=new Elefante("Elephantidae", "Mamifero", "Asiatica", 4000 );
        System.out.println(dumbo);

        Animal animal=new Animal("Canis lupus", "Mamifero");
        System.out.println(animal);
    }
}
/* abstrac */
class Animal{
   private String especie;
     private String tipo_nacimiento;

    public Animal(String especie, String tipo_nacimiento) {
        this.especie = especie;
        this.tipo_nacimiento = tipo_nacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", tipo_nacimiento='" + tipo_nacimiento + '\'' +
                '}';
    }
    public Animal(){}
}

class Elefante extends Animal{
    private String raza;
   private  double peso;


    public Elefante(String especie, String tipo_nacimiento, String raza, double peso) {
        super(especie, tipo_nacimiento);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                ", especie='" + super.getEspecie() + '\'' +
                ", tipo_nacimiento='" + super.getTipo_nacimiento() + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                '}';
    }
    public Elefante(){}

}