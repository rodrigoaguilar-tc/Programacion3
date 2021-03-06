package utils;

public class Ciudad {

    /**
     * Todas las complejidades O(1) ya que todos son getters y setters. El toString = O(1)
     */
    private int id;
    private String nombre;
    private int estacionesDeServicio;
    private boolean tieneBalanza;
    private boolean tieneRadar;
    private int tallerMecanicos;

    public Ciudad(int id, String nombre, int estacionesDeServicio, boolean tieneBalanza, boolean tieneRadar,
            int tallerMecanicos) {
        this.id = id;
        this.nombre = nombre;
        this.estacionesDeServicio = estacionesDeServicio;
        this.tieneBalanza = tieneBalanza;
        this.tieneRadar = tieneRadar;
        this.tallerMecanicos = tallerMecanicos;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneBalanza() {
        return tieneBalanza;
    }

    public void setTieneBalanza(boolean tieneBalanza) {
        this.tieneBalanza = tieneBalanza;
    }

    public int getEstacionesDeServicio() {
        return estacionesDeServicio;
    }

    public void setEstacionesDeServicio(int estacionesDeServicio) {
        this.estacionesDeServicio = estacionesDeServicio;
    }

    public boolean isTieneRadar() {
        return tieneRadar;
    }

    public void setTieneRadar(boolean tieneRadar) {
        this.tieneRadar = tieneRadar;
    }

    public int getTallerMecanicos() {
        return tallerMecanicos;
    }

    public void setTallerMecanicos(int tallerMecanicos) {
        this.tallerMecanicos = tallerMecanicos;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
