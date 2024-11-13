public class SortSelection {
    public static void main(String[]args){
        int temp=0;
        int min;
    int [] arr={4,9,8,1,5,7};
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
        min=i;
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
        System.out.println("\nSorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
