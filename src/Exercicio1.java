import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros ?");
        int j = sc.nextInt();

        int i;
        int total = 0;
        for (i=1; i<=j; i++)
        {
            System.out.println("Numero ?" );
            int numero = sc.nextInt();
            total = numero + total;
        }
        total=total/j;
        System.out.printf("A media é %d \n",total);
    }
}
