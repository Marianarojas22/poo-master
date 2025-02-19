public class MainPersona {
    public static void main(String[] args){
        Persona p1=new Persona(); //instanciamiento

        //configurar el objeto dando valores a sus atrubutos
        p1.nombre="Leonardo";
        p1.genero="Masculino";
        p1.estatura=1.72;
        p1.peso=57;
        p1.edad=18;

        //usando uno de los metodos de la clase
        System.out.println(p1.obtenerDatos());

        Persona p2=new Persona();
        p2.nombre="Emiliano";
        p2.genero="Masculino";
        p2.estatura=1.61;
        p2.peso=42.;
        p2.edad=18;

        String res=p2.obtenerDatos();
        System.out.println(res);

        System.out.println(p1.calcular_imc());
        System.out.println(p2.calcular_imc());

    }
}
