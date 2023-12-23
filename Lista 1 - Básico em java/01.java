import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner wr = new Scanner(System.in);
        int qtd = wr.nextInt();
        if (qtd<12){
            System.out.printf("R$%.2f\n", qtd*1.3);
        } else {
            System.out.printf("R$%d,00", qtd);
        }
    }
}
