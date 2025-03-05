//CONSTRUCTOR un metodo especial que es invocado
//en el proceso de instanciamiento de la clase
//es publico, se llama igual que la classe y no tiene tipo de retorno
public class DemoConstuctor_01{

    String atributo1;
    double atributo2;
    String atributo3;
    public DemoConstuctor_01(){//Constructor por default
        System.out.println("Creando al constructor");// aunque no se veia existia
        atributo1="Nuevo valor";
    }


    public DemoConstuctor_01(String valor){ //(String)
        atributo1=valor;
    }

    public DemoConstuctor_01(double valor1, String valor2){ //(double, String)
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstuctor_01(double valor1){ //double
        atributo2=valor1;
    }

    public DemoConstuctor_01(String valor2, double valor1){
        atributo1=valor2;
        atributo2=valor1;
    }

    public DemoConstuctor_01(String valor, String valor2){
        atributo3=valor;
        atributo1=valor2;
    }

}