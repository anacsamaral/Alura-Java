package pulse.alura.primeiroprojeto;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        String mensagem;

        System.out.println("Informe seu nome:");
        nome = leitura.nextLine();
        mensagem = "Tudo bem?";

        System.out.println("Olá, " + nome);
        System.out.println(mensagem);
    }
}
