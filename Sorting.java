import java.util.*;

public class Sorting{

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void efficientBubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            boolean swaped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;

                }
            }
            if(!swaped){
                break;
            }
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0 ;i<n;i++){
            int min = i;
            for(int j=i+1 ; j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void mSort(int arr[],int low,int mid,int high){

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }
   
    public static void mergeSort(int arr[],int low ,int high){
        if(low >= high){
            return ;
        }

        int mid = (low + high) /2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        mSort(arr, low, mid, high);

    }

    public static int partationReverse(int arr[],int low,int high){

        int pivot = arr[low];

        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] >= pivot && i<high){
                i++;
            }

            while(arr[j] < pivot && j > low){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;


        return j;
    }

    public static void quickSortReverse(int arr[],int low,int high){
        if(low < high){
            int pIndex = partationReverse(arr,low,high);

            quickSortReverse(arr, low, pIndex-1);
            quickSortReverse(arr, pIndex+1, high);
        }
    }

    public static int partation(int arr[],int low,int high){
        int pivot = arr[low];

        int i = low ;
        int j = high;

        while(i<j){
            while( arr[i] <= pivot && i<=high-1){
                i++;
            }

            while(arr[j] > pivot && j>=low+1){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;


        return j;
    }

    public static void quickSort(int arr[],int low ,int high){
        if(low < high){
            int pIndex = partation(arr,low,high);

            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ;i++){
            int j =i;
            while( j>0  && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void recursiveBubbleSort(int arr[],int n){
        if(n >0){

           for(int i=0;i<n;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
           }
            recursiveBubbleSort(arr, --n);
        }
    }
    
    public static void recursiveInsertionSort(int arr[],int n){
        if(n >= arr.length) return;

        int j = n;
        while(j>0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }

        recursiveInsertionSort(arr, ++n);

    }

    public static void main(String argu[]){

        int arr[] = {9,3,2,5,1,6,34,12};

        recursiveInsertionSort(arr,0);

        System.out.println(Arrays.toString(arr));


    }
}