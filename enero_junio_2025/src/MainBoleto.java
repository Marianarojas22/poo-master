public class MainBoleto {
    public static void main(String[] args) {
      Boleto b1=new Boleto();
        Boleto b2=new Boleto();

        b1.setPrecio(9);
        b1.setFecha("13/10/2024");
        b1.setAsiento("E5");

        b2.setPrecio(15);
        b2.setFecha("12/02/2025");
        b2.setAsiento("F7");


        System.out.println(b1);
        System.out.println(b2);
    }
}
