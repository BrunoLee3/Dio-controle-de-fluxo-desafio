import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametro2 = scanner.nextInt();

        try {
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e){
            //e.printStackTrace();
            System.out.println("O segundo paramêtro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;
        for (int i=0; i<contagem; i++){
            System.out.println("Imprimindo número " + i);
        }
    }
}
