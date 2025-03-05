public class DemoString {
    public static void main(String[] args) {
        //String es la clase
        String nombre = new String( "Shakira");
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        nombre=nombre.toUpperCase();
        System.out.println(nombre);

       // System.out.println(nombre.equals("Nikki Nicole"));
        System.out.println(nombre.equals("SHAKIRA"));

        //Crear una rutina para dada una frase, buscar si existe la palabra "Amor"
    }

}

