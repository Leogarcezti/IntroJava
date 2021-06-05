// 1 - Nome do pacote
package intro;

// 2 - Referência as bibliotecas


// 3 - Classe (local de escrita do código)
public class Medidas {
        // 3.1 - Atributos - Características

        // 3.2 - Métodos e Funções
    public static void main(String[] args){
        calcularAreaModoCurto();
        calcularAreaModoExtenso();
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

}