package pokemon_herencia;

public class Pokemon {
    
    private int hp;
    private int nivel;
    private String nombre;
    private String tipo;

    public Pokemon(int nivel, String nombre, String tipo) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;
        int hp = 100;
    }


    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    private void calculaDanio(int danio) {
        this.hp -= danio;
            System.out.printf("%s recibe %d puntos de danio\n",
            this.getNombre(), danio);
    }
    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        calculaDanio((int)( Math.random() * 10 + 1));
    }
    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(),
        pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
        }
    public static void main(String[] args) {
    
    }
        public Movimiento buscarMovimientosPorNombre(String nombre){
    for(Movimiento movimiento : movimientos){
    if(movimiento.getNombre().equeals(nombre)){
        return movimiento;
            }
        }
        return null;
        }
    }
    public abstract double obtenerEfectividad(Pokemon pokemon);
}
