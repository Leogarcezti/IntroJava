// 1 - Nome do pacote
package intro;

// 2 - Referência as bibliotecas

import com.sun.xml.internal.bind.v2.TODO;

// 3 - Classe (local de escrita do código)
public class Medidas {
        // 3.1 - Atributos - Características

        // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Cálculo de Areas");
        //TODO chamar os calculos no método main

        }
    //Calculo de área - Exemplo: Tamanho de tapete ou piso
    public void calcularAreaModoExtenso(){
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;

        System.out.print("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m," + " a área é de= " +resultado + " m².");
    }

    //Calculo de área reduzido
    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.print("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m," + " a área é de= " +largura * comprimento + " m².");

    }

}