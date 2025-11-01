
public class Cooperativa {
    public Equipo[] catalogo = new Equipo[10];

    public void init() {
        catalogo[0] = new Equipo("EQ01", "Sensor Humedad", 1.2, true, false, true);
        catalogo[1] = new Equipo("EQ02", "Estación Meteorológica", 2.8, true, false, true);
        catalogo[2] = new Equipo("EQ03", "Dron Riego", 6.5, true, true, true);
        catalogo[3] = new Equipo("EQ04", "Cámara Multiespectral", 3.3, true, false, true);
        catalogo[4] = new Equipo("EQ05", "Válvula Inteligente", 1.1, false, true, true);
        catalogo[5] = new Equipo("EQ06", "Sensor PH", 1.4, true, false, false);
        catalogo[6] = new Equipo("EQ07", "Panel Solar", 0.0, false, false, true);
        catalogo[7] = new Equipo("EQ08", "Dron Monitoreo", 5.9, true, true, false);
        catalogo[8] = new Equipo("EQ09", "Sensor Nutrientes", 1.6, true, false, false);
        catalogo[9] = new Equipo("EQ10", "Rociador Autónomo", 4.5, false, true, true);
    }

    public void listarEquipos() {
        for (int i = 0; i < catalogo.length; i++) {
            catalogo[i].mostrarInfo();
        }
    }

    public void buscarPorId(String id) {
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].id.equalsIgnoreCase(id)) {
                catalogo[i].mostrarInfo();
                return;
            }
        }
        System.out.println("Equipo no encontrado.");
    }

    public void buscarPorNombre(String nombre) {
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].nombre.equalsIgnoreCase(nombre)) {
                catalogo[i].mostrarInfo();
                return;
            }
        }
        System.out.println("Equipo no encontrado.");
    }

    public void ordenarPorConsumo() {
        for (int i = 0; i < catalogo.length-1; i++) {
            for (int j = i+1; j < catalogo.length; j++) {
                if (catalogo[i].consumoElectrico > catalogo[j].consumoElectrico) {
                    Equipo temp = catalogo[i];
                    catalogo[i] = catalogo[j];
                    catalogo[j] = temp;
                }
            }
        }
        System.out.println("Catálogo ordenado por consumo eléctrico.\n");
    }
}
