public class Quest04 {

    public static void main(String[] args) {

        int[] array = {10,20,20,30,40,40,50};
        int size = array.length;

        for(int i = 0; i < size; i++){

            for(int j = i + 1; j < size; j++){

                if(array[i] == array[j]){

                    for(int k = j; k < size - 1; k++){
                        array[k] = array[k + 1];
                    }

                    size--;
                    j--;
                }
            }
        }

        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}