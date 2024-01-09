import java.util.Scanner;

public class One {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe aqui sua idade:");
        int idade = sc.nextInt();

        int idadeEmDias = idade * 365;

        System.out.println("Sua idade em dias é: " + idadeEmDias);
        sc.close();
    }
}
