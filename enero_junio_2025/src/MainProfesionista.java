public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista p1=new Profesionista();
        Profesionista p2=new Profesionista();

        p1.setAntiguedad(15);
        p1.setCarrera("Ingeniera");
        p1.setNombre("Mariana Rojas Vicario");
        p1.setCedula("MAR#23629");


        p2.setAntiguedad(10);
        p2.setCarrera("Doctora");
        p2.setNombre("Monserrat Rojas Vicario");
        p2.setCedula("MAR#23629");

        System.out.println(p1);
        System.out.println(p2);
    }
}
