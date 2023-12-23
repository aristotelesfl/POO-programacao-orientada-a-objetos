import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner wr = new Scanner(System.in);
        int A = wr.nextInt();
        int B = wr.nextInt();
        int C = wr.nextInt();
        if (A<B+C && B<A+C && C<B+A){
            if (A==B && B==C){
                System.out.println("Equilátero");
            } else if (A!=B && B!=C && A!=C){
                System.out.println("Escaleno");
            } else {
                System.out.println("Isóceles");
            }
        }
        else {
            System.out.println("""
                    Obs.: Três dimensões conseguem formar um triângulo, quando cada uma
                    dessas dimensões, individualmente, for menor que a soma das outras
                    duas dimensões.""");
        }

    }
}
