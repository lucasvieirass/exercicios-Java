import java.util.Scanner;
public class Uri1008{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int num, qtd;
            float valorS, resp;

            num = teclado.nextInt();
            qtd = teclado.nextInt();
            valorS = teclado.nextFloat();
            resp = valorS * qtd;

            System.out.println("NUMBER = " + num);
            System.out.printf("SALARY = U$ %.2f\n",resp);
        }
}