public class MainMousse {
    public static void main(String[] args){
        Mousse m1= new Mousse();
        //instanciamiento
        Mousse m2=new Mousse("Logitech");
        Mousse m3= new Mousse("Razer", "DeathAdder");
        Mousse m4=new Mousse("corsair", "Harpoon", "Blanco");
        //m1 es un objeto
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
