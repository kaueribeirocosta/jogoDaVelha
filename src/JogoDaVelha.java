import java.util.Scanner;

public class JogoDaVelha {

    public static char[] retornaVetorChar(){
        char[] vetor = new char[9];
        for(int i = 0; i < 9; i++){
            vetor [i] = ' ';
            
        }
        return vetor; 
    }

    public static void mostrarVetor(char[] vetor, int tamanho){
        for(int i = 0; i < tamanho; i++){
            if(i % 3 == 0){
                System.out.println("");

            }

            System.out.printf("|%c|", vetor[i]);
        }
    }

    public static char[] computadorJoga(char[] vetor){
        for(int i = 0; i < 9; i++){
            if(vetor[i] == ' '){
                vetor[i] = 'x';

                return vetor;

            }
        }

        return vetor; 
    }
    
    public static char[] escolhaUsuario(char[] vetor){
        Scanner teclado = new Scanner(System.in);
        int posicao;

        for(int i = 1; i < 10; i++){
            System.out.printf("|%d|", i);

            if(i % 3 == 0){
                System.out.println(" ");
            }
        }

        posicao = teclado.nextInt(); 
        while(vetor[posicao - 1] != ' '){
            posicao = teclado.nextInt(); 
        }
        vetor[posicao - 1] = 'O';

        return vetor; 
    }
    
    public static boolean alguemGanhou(char[] vetor){
        if(vetor[0] == vetor[1] && vetor[1] == vetor[2]){
            if(vetor[0] != ' '){
                System.out.printf("O %c ganhou!", vetor[0]);
                return true; 
            }
        }

        if(vetor[3] == vetor[4] && vetor[4] == vetor[5]){
            if(vetor[3] != ' '){
                System.out.printf("O %c ganhou!", vetor[0]);
                return true; 
            }
        }

        if(vetor[6] == vetor[7] && vetor[7] == vetor[8]){
            if(vetor[6] != ' '){
                System.out.printf("O %c ganhou!", vetor[6]);
            }
        }

        return false;
        }
    
    
    public static void main(String[] args) throws Exception {
        char[] vetor = retornaVetorChar();

        for(int i = 0; i < 9; i++){
            escolhaUsuario(vetor);
            computadorJoga(vetor);
            mostrarVetor(vetor, 9 );

            if(alguemGanhou(vetor) == true){
                break; 
            }
        }

    

    }
}
