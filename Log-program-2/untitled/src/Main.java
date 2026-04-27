public class Main {
    public static void main(String[] args) {
        RankingGame(3, 100);
    }
     static void RankingGame(int derrotas, int vitorias){
        int resultado = vitorias - derrotas;
        String ranking = " ";

if (resultado < 0){
    ranking ="Vitorias negativo";
}
      else if (resultado <= 10){
    ranking ="Ferro";
}
     else if (resultado <= 20){
    ranking ="Bronze";;
}
       else if (resultado <= 50){
    ranking ="Prata";;
}
       else if (resultado <= 80){
    ranking ="Ouro";;
}
       else if (resultado <= 90){
    ranking ="Diamante";;
       }
       else if (resultado <= 100){
    ranking ="Lendário";;
}
       else {
    ranking ="Imortal";;
       }
       System.out.println("O herói tem saldo de " + resultado + " está no nível de " + ranking);



    }

}
