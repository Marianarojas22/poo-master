import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExcepcionVerificada {
    public static void  main(String[] args) throws Exception{
        try {
            FileInputStream f = new FileInputStream("Hola.txt");
        } catch (FileNotFoundException objetoExcepcion){
            System.out.println("Ha concurrido el siguiente error " + objetoExcepcion.getMessage());
        }
    }
}
