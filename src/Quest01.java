import java.util.Scanner;

public class Quest01 {

    public static void main(String[] args) {

        int[] array = new int[10];
        int size = 5;

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert position: ");
        int position = sc.nextInt();

        System.out.print("Insert value: ");
        int value = sc.nextInt();

        for(int i = size; i > position; i--){
            array[i] = array[i - 1];
        }

        array[position] = value;
        size++;

        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}