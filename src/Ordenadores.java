import java.util.Arrays;

public class Ordenadores {
    public static <T extends Comparable<T>>
    void selectionSort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    T temp = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = temp;
                }

            }
        }
    }


    public static <T extends Comparable<T>>
    void bubbllesort(T[] a) {
        int lenght = a.length;
        boolean trocou = false;
        for (int i = 0; i < lenght -1 ; i++) {
            System.out.println(i);
            for (int j = lenght; j > i + 1; j--) {
                if (a[j - 1].compareTo(a[j - 2]) < 0) {
                    trocou = true;
                    T tmp = a[j - 1];
                    a[j - 1] = a[j - 2];
                    a[j - 2] = tmp;
                }
                if (!trocou) {
                    System.out.println("Não trocou! interrompendo execução");
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        Integer[] numeros = {3,1,4,6,2,10,24,11,2,7};
        Integer[] worstCase = {1,2,3,4,5,6,7,8,9};
        System.out.println("Números antes da ordenação: " + Arrays.toString(numeros));
        Ordenadores.selectionSort(numeros);
        System.out.println("Números após a ordenação: " + Arrays.toString(numeros));
        System.out.println("Números antes da ordenação: " + Arrays.toString(worstCase));
        Ordenadores.selectionSort(worstCase);
        System.out.println("Números após a ordenação: " + Arrays.toString(worstCase));

        String[] nomes = {"Ana", "Debora", "Bruno", "Joao", "Carlos"};
        Ordenadores.selectionSort(nomes);
        System.out.println("Nomes ordenados:" + Arrays.toString(nomes));
    }

}
