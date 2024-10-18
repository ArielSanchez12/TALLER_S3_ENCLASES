public class Jugador {
    private String avatar;
    private int edad;
    private String pais;
    private int num_jugador;
    private int saltos = 2;


    public Jugador(String avatar, int edad, String pais, int num_jugador) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
        this.num_jugador = num_jugador;
    }


    public void patear(){
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                ", edad: " + edad + ", pais: " + pais +
                ", ha realizado la accion patear");
    }

    public void correr(){
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                ", edad: " + edad + ", pais: " + pais +
                ", ha realizado la accion correr");
    }

    public void saltar(int saltos){
        saltos += saltos;
        System.out.println("El jugador " + num_jugador + " de nombre: " + avatar +
                ", edad: " + edad + ", pais: " + pais +
                ", ha realizado la accion saltar " + saltos + " veces");
    }
}
