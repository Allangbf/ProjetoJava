public class TesteLista {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(5);
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimirLista();
        lista.remover(1);
        lista.imprimirLista();  
    }
}