// 1 - Nome do pacote
package intro;

// 2 - Referência as bibliotecas


import java.util.Scanner;

// 3 - Classe (local de escrita do código)
public class Medidas {
        // 3.1 - Atributos - Características

        // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software
        // Utilizar a classe Scanner do Java para ler a escolha do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U    D E   O P Ç Õ E S: ");
        System.out.println("c - Calcular Area modo curto: ");
        System.out.println("d - Contar até 10:  ");
        System.out.println("e - Calcular Area modo extenso: ");
        System.out.println("i - If Simples: ");
        System.out.println("r - Contagem regressiva de 10 a 0: ");
        System.out.println("Qual a opção desejada: ");
        String opcao = scanner.next();


        //String opcao = "curto";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu contar té 10");
                contarAte10();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar a Contagem Regressiva");
                contagemRregressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não está na lista");
                break;

        }

    }

    public static void ifSimples(){
        // Condicional = Verificar uma condição - Pazer uma pergunta
        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }


        public static void calcularAreaModoCurto(){
            System.out.println("Cálculo de Areas Modo Curto");
            //Calculo de área reduzido

                int largura = 4;
                int comprimento = 3;

                System.out.print("Para a largura de " + largura + "m e o comprimento de "
                        + comprimento + "m," + " a área é de= " +largura * comprimento + " m².");
        }

    //Calculo de área - Exemplo: Tamanho de tapete ou piso
    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de Areas Modo Extenso");
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;

        System.out.print("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m," + " a área é de= " +resultado + " m².");
    }
public static void contarAte10(){

        // Loops ou repetições
        // for = repetição incondicional
    System.out.println("Contagem ascendente");

    for(int numero = 1; numero <= 10; numero++){
        System.out.println(numero);
    }

}
public static void contagemRregressiva(){
    System.out.println("Contagem Regressiva");

    for(int numero = 10; numero > -1; numero--){
        System.out.println(numero);
    }
}

}