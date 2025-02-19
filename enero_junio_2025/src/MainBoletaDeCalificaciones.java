public class MainBoletaDeCalificaciones {
    public static void main(String[] args){
        BoletaDeCalificaciones b1=new BoletaDeCalificaciones();
        //configurar el objeto
        b1.semestre=1;
        b1.nombre="Mariana Rojas Vicario";
        b1.cm1=90.5;
        b1.cm2=80.5;
        b1.cm3=95.5;
        b1.cm4=60.5;
        b1.cm5=85.5;
        b1.cm6=98.5;
        b1.cm7=96.5;
        b1.ndc=24020277;

        BoletaDeCalificaciones b2=new BoletaDeCalificaciones();
        b2.semestre=1;
        b2.nombre="Cristel Ismerai Lara Garcia";
        b2.cm1=10.0;
        b2.cm2=100;
        b2.cm3=95.0;
        b2.cm4=60.59;
        b2.cm5=100.0;
        b2.cm6=98.5;
        b2.cm7=96.5;
        b2.ndc=24020275;

        BoletaDeCalificaciones b3=new BoletaDeCalificaciones();
        b3.semestre=1;
        b3.nombre="Wendy Anai Farfan Ramirez";
        b3.cm1=70.5;
        b3.cm2=60.5;
        b3.cm3=87.5;
        b3.cm4=100;
        b3.cm5=80.0;
        b3.cm6=98.0;
        b3.cm7=99.0;
        b3.ndc=24020334;

        System.out.println(b1.obtenerDatos());
        System.out.println(b1.promedioSemestre());
        String res=b2.obtenerDatos();
        System.out.println(res);
        System.out.println(b2.promedioSemestre());
        System.out.println(b3.obtenerDatos());
        System.out.println(b3.promedioSemestre());


    }
}
