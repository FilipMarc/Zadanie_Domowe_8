package arrays;

import java.util.Random;

public class MirrorArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        MirrorArrays.mirrorArray(array);


    }

    public static void mirrorArray(int[] tab){
        for (int j= tab.length -1; j >=0 ; j--) {
            System.out.print(tab[j]+ " ");
        }
    }

    // Wiem że powinno być innaczej zapisane ale nie wiem jak innaczej to zrobić.
    // Domyślam się że powinienem jakoś String w pętli zrobić ale i tak nie wiem jak :P
}
