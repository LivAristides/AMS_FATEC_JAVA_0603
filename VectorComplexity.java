
import java.util.Scanner;

public class VectorComplexity {

    //toda classe pode ser publica
    //nome dela tem que ser o mesmo nome do arquivo
    public static void main(String[] args) {
        //metodo main 
        //criando um vetor de numeros inteiros
        int[] vector;
        vector = new int[10];
        Scanner keyboard = new Scanner(System.in);
        int valor = 0;

        System.out.println("informe" + vector.length + "valores separados por um espaço: \n ");

        for (int indx = 0; indx < vector.length; indx++) {
            /*System.out.printf("\nvector[%d] = %d", indx, vector[indx]); */
            //format será exibido na tela; no d% será apresentado um valor [d%] a posição

            vector[indx] = keyboard.nextInt();
        }


        System.out.println("\nInforme o valor a ser pesquisado:");

        valor = keyboard.nextInt();

        for (int indx = 0; indx < vector.length; indx++) {

            if (vector[indx] == valor)
            {

                System.out.printf("\nvector[%d] = %d", indx, vector[indx]);
                break;

            }

            
        }
    }
}
