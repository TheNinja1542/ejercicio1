package EjerciciosLunes.CarreraConejos;

import java.util.Random;

class conejo {
    private int pocicion;
    private final String nombre;
    Random randon = new Random();

    public conejo(String nombre){
        this.pocicion = 0;
        this.nombre = nombre;
    }

    public void salto(){
        int opcion = randon.nextInt();

        switch (opcion){
            case 0: pocicion += 0; break;
            case 1: pocicion -= 1; break;
            case 2: pocicion += 1;break;
            case 3: pocicion += 2;break;
        }
    }
    public int getPocicion(){
        return pocicion;
    }
    public String getNombre(){
        return nombre;
    }
}