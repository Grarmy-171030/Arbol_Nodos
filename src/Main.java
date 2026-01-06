public class Main {
    static void imprimirArbol(nodo nodo, int nivel){
        if(nodo != null){
            imprimirArbol(nodo.derecha, nivel +1);
            //Espacios
            for(int i = 0; i < nivel; i++){
                System.out.print("   ");
            }
            System.out.println(nodo.dato);
            imprimirArbol(nodo.izquierda, nivel +1);
        }
    }
    static void inorden(nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecha);
        }
    }
    static void preorden(nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }
    static void postorden(nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    public static void main(String[] args) {
        //Arbol vacio
        nodo arbolvacio = null;
        //Nodo raiz
        nodo raiz=new nodo("A");
        //SubArbol izquierdo primer termino
        raiz.izquierda=new nodo("B");
        //hijos del primer termino
        raiz.izquierda.izquierda=new nodo("D");
        //hijos de D
        raiz.izquierda.izquierda.izquierda=new nodo("G");
        raiz.izquierda.izquierda.derecha=new nodo("H");
        //Hijos de H
        raiz.izquierda.izquierda.derecha.izquierda=new nodo("k");
        raiz.izquierda.izquierda.derecha.derecha=new nodo("L");
        //Hijos de K
        raiz.izquierda.izquierda.derecha.izquierda.derecha=new nodo("N");
        //SubArbol derecha primer termino
        raiz.derecha=new nodo("C");
        //Hijos de C
        raiz.derecha.izquierda=new nodo("E");
        raiz.derecha.derecha=new nodo("F");
        //Hijo de E
        raiz.derecha.izquierda.izquierda=new nodo("I");
        //Hijos de F
        raiz.derecha.derecha.derecha=new nodo("J");
        raiz.derecha.derecha.derecha.derecha=new nodo("M");
        //Hijo de M
        raiz.derecha.derecha.derecha.derecha.izquierda=new nodo("O");
        imprimirArbol(raiz, 0);
        System.out.print("Recorrido Inorden: ");
        inorden(raiz);
        System.out.println();
        System.out.print("Recorrido Preorden: ");
        preorden(raiz);
        System.out.println();
        System.out.print("Recorrido Postorden: ");
        postorden(raiz);
        System.out.println();



    }

}