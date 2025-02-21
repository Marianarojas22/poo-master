public class MainBalon {
    public static void main(String[] args) {
        Balon b1=new Balon();
        Balon b2=new Balon();

        b1.setPeso(300);
        b1.setTamanio(50);
        b1.setMaterial("Cuero");

        b2.setPeso(350);
        b2.setTamanio(40);
        b2.setMaterial("Cuero");


        System.out.println(b1);
        System.out.println(b2);
    }
}
