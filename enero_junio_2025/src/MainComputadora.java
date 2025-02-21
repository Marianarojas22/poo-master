public class MainComputadora {
    public static void main(String[] args) {
        Computadora c1=new Computadora();
        Computadora c2=new Computadora();

        c1.setProcesador("Intel i7");
        c1.setAlmacenamiento(512);
        c1.setMemoriaRam(16);

        c2.setProcesador("Intel i5");
        c2.setAlmacenamiento(512);
        c2.setMemoriaRam(4);

        System.out.println(c1);
        System.out.println(c2);
    }
}


