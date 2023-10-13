import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        sc.close();

        for (int e=50; e>=0; e--) {
            System.out.println("Contagem regressiva:" + e);
        }

        }
    }