import java.util.Scanner;

public class Quest03 {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};
        int size = 5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Value to remove: ");
        int value = sc.nextInt();

        int position = -1;

        for(int i = 0; i < size; i++){
            if(array[i] == value){
                position = i;
                break;
            }
        }

        if(position != -1){

            for(int i = position; i < size - 1; i++){
                array[i] = array[i + 1];
            }

            size--;
        }

        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}