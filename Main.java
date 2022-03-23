// import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int[] valores = {6,3,4,8,2,10,9,7,1};
        Arvore arvore = new Arvore();
        for (int i = 0; i < valores.length; i++) {
            System.out.println("================== laço: " + (i+1) + " - incluindo: " + valores[i]);
            arvore.inserir(valores[i]);
        }
        System.out.println("Preparando para imprimir...");
        arvore.imprimir();
    }
}
