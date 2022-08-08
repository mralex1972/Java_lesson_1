public class task1 {
    public static void main (String[] args) {        
        int[] arr = new int[] {1, 2, 0, 3, 0, 4, 5, 6, 7};
        printArr(arr);
        System.out.println();
        if (arr.length > 1){
            for(int i = 0; i < arr.length - 1; i++){
                if (arr[i] == 0){
                    for(int j = arr.length - 2; j >= i; j--){
                        arr[j + 1] = arr[j];
                    } 
                    i++;                   
                }
            }
        }
        printArr(arr);        
    }
    static void printArr(int[] array){
        for(int i: array){
            System.out.print(i + " ");
        }
    }
}