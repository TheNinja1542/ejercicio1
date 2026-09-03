package EjerciciosLunes.BancoPepitoPerez;

public class Cliente {
    int turno;
    String nombre;
    String tramite;

    public Cliente(int turno, String nombre, String tramite){
        this.turno = turno;
        this.nombre = nombre;
        this.tramite = tramite;

    }
    public void Mostrar(){
        System.out.println("Turno: " + turno + " " +  "Nombre: " + nombre + " " + "Tramite: " + tramite);
    }
}
