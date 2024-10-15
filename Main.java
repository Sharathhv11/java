import java.util.Arrays;

class Main {

    public static int findLargest(int arr[]) {
        int high = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (high < arr[i])
                high = arr[i];
        }

        return high;
    }

    public static int secondLargest(int arr[]) {
        int n = arr.length;

        int large = arr[0];

        int second = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                second = large;
                large = arr[i];
            }

            else if (arr[i] < large && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static boolean isSorted(int arr[]) {

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (!(arr[i] <= arr[i + 1])) {
                return false;
            }
        }

        return sorted;
    }

    public static int firstUniqueElement(int arr[]){

        int n = arr.length;

       int i = 0;

       for(int j=1;j<n;j++){
        if(arr[i] != arr[j]){
            arr[i+1] = arr[j];
            i++;
        }
       }


        return i+1;
    }
    
    public static void main(String argu[]) {

        int arr[] = {1,1,2,3,3,4 };

        System.out.println(firstUniqueElement(arr));

        System.out.println(Arrays.toString(arr));
    }
}