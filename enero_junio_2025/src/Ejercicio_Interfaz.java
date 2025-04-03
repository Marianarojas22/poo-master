/*public class Ejercicio_Interfaz {
    public static void main(String[] args){

Crear una interfaz llamada Conectable con los metodos:
-conectarDereha
-conectarIzquierda

Crear una clase concreta llamada Nodo que contenga los campos:
-nombre
-valor
Implementar la clase Nodo la interfaz, de tal manera que
 un nodo en la izquierda se conecte con el nodo a su derecha y
  autmaticamente el nodo a su derecha se conecte con el nodo  izquierdo.
  De igual manera si el nodo a la derecha se conecta al de la izquierda
  automaticamente el nodo izquierdo se conecta al derecho

        interface Conectable{
            void conectarDerecha(Nodo nodo);
            void conectarIzquierda(Nodo nodo);
        }
        public class Nodo implements Conectable {
            private String nombre;
            private int valor;
            private Nodo izquierdo;
            private Nodo derecho;

            public Nodo(String nombre, int valor) {
                this.nombre = nombre;
                this.valor = valor;
                this.izquierdo = null;
                this.derecho = null;
            }

            @Override
            public void conectarDerecha(Nodo nodo) {
                this.derecho=nodo;
                if (nodo != null && nodo.izquierdo !=this){
                    nodo.conectarIzquierda(this);
                }
            }

            @Override
            public void conectarIzquierda(Nodo nodo) {
                this.izquierdo=nodo;
                if (nodo != null && nodo.derecho !=this){
                    nodo.conectarDerecha(this);
                }
            }
            public void imprimirNodo(){
                System.out.println("Nodo: " + nombre + " valor:" + valor);
                System.out.println("Izquierda " + (izquierdo != null ? izquierdo.nombre: "null"));
                System.out.println("Derecha " + (derecho != null ? derecho.nombre: "null"));
            }
            public void main(String[] args){
                Nodo nodoA=new Nodo("A", 1);
                Nodo nodoB=new Nodo("B", 2);
                Nodo nodoC=new Nodo("C", 3);

                nodoA. conectarDerecha(nodoB);
                nodoB.conectarDerecha(nodoC);

                nodoA.imprimirNodo();
                nodoB.imprimirNodo();
                nodoC.imprimirNodo();
            }
        }
    }
}
*/