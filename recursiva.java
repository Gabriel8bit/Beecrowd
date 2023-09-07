public static void bubbleSort(int[] vetor) {
    int aux = 0;
    boolean troca;
    for (int i = 0; i < vetor.length - 1; i++) {
        troca = false;
        for (int j = 0; j < vetor.length - i - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
                troca = true;
            }
        }
        if (!troca) {
            // Nenhuma troca foi feita nesta iteração, o vetor já está ordenado
            break;
        }
    }
}