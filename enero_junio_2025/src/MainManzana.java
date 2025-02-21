public class MainManzana {
    public static void main(String[] args) {
       Manzana m1=new Manzana();
        Manzana m2=new Manzana();

        m1.setPeso(4);
        m1.setColor("Amarillo");
        m1.setSabor("Acida");

        m2.setPeso(10);
        m2.setColor("verde");
        m2.setSabor("Acida");


        System.out.println(m1);
        System.out.println(m2);
    }
}

