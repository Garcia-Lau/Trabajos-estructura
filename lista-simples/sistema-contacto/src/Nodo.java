public class Nodo {

    private contacto dato;
     private Nodo siguiente;

    public contacto getDato() {
        return dato;
    }

    public void setDato(contacto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(contacto dato) {
        this.dato = dato;
    }
}
