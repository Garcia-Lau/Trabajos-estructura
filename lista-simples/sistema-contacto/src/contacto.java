public class contacto {
     private String nombre;
    private String correo;
    private  String telefono;

    public contacto(String telefono, String correo, String nombre) {
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "contacto{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
