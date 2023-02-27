public class BubbleSort {
    void bubble_sort(int arr[], int n) {
        int i, j, temp;
        int flag = 0;
        for (i = 0; i < n - 1; i++) {
            flag = 0;
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {2,7,9,5,4,6,-1,3,10,8};

        System.out.println("Unsorted List is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        obj.bubble_sort(arr,arr.length);
        System.out.println("\nSorted List is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }