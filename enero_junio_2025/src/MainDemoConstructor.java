import java.util.Arrays;

public class MainDemoConstructor {
    public static void main(String[] args){
        //aqui se esta invocando al constructor
        DemoConstuctor_01 obj=new DemoConstuctor_01();
        System.out.println(obj.atributo1);
        obj.atributo1="nuevo valor";
        DemoConstuctor_01 obj2=new DemoConstuctor_01("Este es mi valor");
        System.out.println(obj2.atributo1);

        DemoConstuctor_01 obj3=new DemoConstuctor_01("Valor String",20.5);
        //Demo contstructor de double String

}
}