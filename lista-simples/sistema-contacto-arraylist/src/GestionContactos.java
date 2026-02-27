import java.util.ArrayList;

public class GestionContactos {

    private ArrayList<contacto> lista;

    public GestionContactos() {
        lista = new ArrayList<>();
    }

    public void insertar(contacto contacto) {
        lista.add(contacto);
        System.out.println("Contacto agregado");
    }

    public contacto buscar(String nombre) {
        for (contacto contacto : lista) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public boolean eliminar(String nombre) {
        contacto contacto = buscar(nombre);
        if (contacto != null) {
            return lista.remove(contacto);
        }
        return false;
    }

    public void listar() {
        for (contacto contacto : lista) {
            System.out.println(contacto);
        }
    }
}