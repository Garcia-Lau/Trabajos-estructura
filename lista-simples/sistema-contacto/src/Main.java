public class Main {
    public static void main(String[] args) {

        ListaContacto lista = new ListaContacto();

        lista.insertarFinal(new contacto("ana", "3213241234", "ana@gmail.com"));
        lista.insertarFinal(new contacto("ana", "3213241234", "ana@gmail.com"));
        lista.insertarFinal(new contacto("ana", "3213241234", "ana@gmail.com"));
        lista.insertarFinal(new contacto("ana", "3213241234", "ana@gmail.com"));

        System.out.println("lista actual \n");
        lista.lista();

        System.out.println("\nBuscar ana :");
        System.out.println(lista.buscar("ana"));

        System.out.println("\neliminar andres :");
        System.out.println(lista.eliminar("andres"));

        System.out.println("\n lista actual :");

      lista.lista();
    }
}