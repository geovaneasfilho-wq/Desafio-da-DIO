public class Personagem {
    private String nome;
    private int age;
    private String tipo;
    private String ataque;

    public Personagem(String nome, int age, String tipo, String ataque) {
        this.nome = nome;
        this.age = age;
        this.tipo = tipo;
        this.ataque = ataque;
    }
    void escrever(){
        System.out.print("O " + this.tipo + " atacou usando " + this.ataque );
    }

}
