
package orga;

/**
 *
 * @author IKAROS
 */
public class Usuario {
    String nombre, password;
    int puntuacion, tiempo;

    public Usuario(String nombre, String password, int puntuacion, int tiempo) {
        this.nombre = nombre;
        this.password = password;
        this.puntuacion = puntuacion;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
