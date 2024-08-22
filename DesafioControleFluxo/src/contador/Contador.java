package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {

            contar (parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException ex) {
            ex.printStackTrace();
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;
            for (int i = 0 ; i < contagem; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        } else{
            throw new ParametrosInvalidosException();
        }
        
    }
}
