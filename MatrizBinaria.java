public class MatrizBinaria {

    public static int encontreMaiorRetangulo(char[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return 0;
        }

        int totalLinhas = matriz.length;
        int totalColunas = matriz[0].length;
        int maiorArea = 0;

        for (int linhaAtual = 0; linhaAtual < totalLinhas; linhaAtual++) {
            for (int colunaAtual = 0; colunaAtual < totalColunas; colunaAtual++) {
                if (matriz[linhaAtual][colunaAtual] == '1') {
                    int larguraMaxima = totalColunas;

                    for (int proximaLinha = linhaAtual; proximaLinha < totalLinhas; proximaLinha++) {
                        for (int proximaColuna = colunaAtual; proximaColuna < larguraMaxima; proximaColuna++) {
                            if (matriz[proximaLinha][proximaColuna] == '0') {
                                larguraMaxima = proximaColuna;
                                break;
                            }
                        }

                        int alturaAtual = proximaLinha - linhaAtual + 1;
                        int areaAtual = (larguraMaxima - colunaAtual) * alturaAtual;

                        if (areaAtual > maiorArea) {
                            maiorArea = areaAtual;
                        }
                    }
                }
            }
        }

        return maiorArea;
    }
}
