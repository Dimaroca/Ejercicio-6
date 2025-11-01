public class Equipo {
    public String id;
    public String nombre;
    public double consumo;
    public boolean medible;
    public boolean accionable;
    public boolean registrable;

    public Equipo(String id, String nombre, double consumo, boolean medible, boolean accionable, boolean registrable) {
        this.id = id;
        this.nombre = nombre;
        this.consumo = consumo;
        this.medible = medible;
        this.accionable = accionable;
        this.registrable = registrable;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Consumo: " + consumo + " kWh");
        if (medible) System.out.println("- Medible");
        if (accionable) System.out.println("- Accionable");
        if (registrable) System.out.println("- Registrable");
        System.out.println();
    }
}
