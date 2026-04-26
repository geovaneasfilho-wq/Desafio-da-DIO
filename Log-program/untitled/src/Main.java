import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de EXP que vc possuì");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Insira um valor válido");
        }
        switch (n){
            case 0:
            case 1000:
                System.out.println("Ferro");
                break;
                case 1001:
            case 2000:
                System.out.println("Bronze");
                break;
            case 2001:
            case 5000:
                System.out.println("Prata");
                break;
            case 5001:
            case 7000:
                System.out.println("Ouro");
                break;
            case 7001:
            case 8000:
                System.out.println("Platina");
                break;
            case 8001:
            case 9000:
                System.out.println("Bronze");
                break;
            case 9001:
            case 10000:
                System.out.println("Bronze");
                break;
               default:
                   System.out.println("Radiante");
        }


    }
}
