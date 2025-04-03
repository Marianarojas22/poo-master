import java.io.FileInputStream;

/*excepciones son errores que ocurren dentro de la ejecución del código
existen excepciones verificadas y no verificadas
v: el ide te dice que hay un error
nv: el ide no te dice que hay un error
las excepciones también son clases
se pueden atender
un error a diferencia de una excepción es algo de lo que no te puedes recuperar
 */

public class DemoExcepciones {
    public static void main(String[] args) {
        PruebaExcepcion pe=new PruebaExcepcion();
        try {
            pe.creaArreglo();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Mi mensaje de excepcion");
        }

    }
}

class PruebaExcepcion{
    public void creaArreglo() throws IndexOutOfBoundsException{
        int arreglo []= new int[10];
        arreglo[11]=30;

    }
}