public class Quest02 {

    public static void main(String[] args) {

        int[] array = new int[5];
        int size = 5;

        for(int i = 0; i < size; i++){
            array[i] = i + 1;
        }

        int newValue = 99;

        if(size == array.length){

            int[] newArray = new int[array.length * 2];

            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }

            array = newArray;
        }

        array[size] = newValue;
        size++;

        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}