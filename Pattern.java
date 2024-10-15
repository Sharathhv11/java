import java.util.Scanner;

class Pattern {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            // l-numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            space -= 2;
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        int inital = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(inital++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            char c = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = n - i; j >= 1; j--) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        char c = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char c = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c);
                if (j < breakPoint) {
                    c++;
                } else {
                    c--;
                }
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            char c = 'E';
            for (int j = 0; j < i; j++) {
                System.out.print((char) (c - j));
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int intialValue = (2 * n) - 2;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < intialValue; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            intialValue -= 2;
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int init = (n*2) - 2;
        int endingSpace = 2;
       

        for(int i=1;i<=(n*2)-1;i++){

            if(i>=((n*2)/2)+1){
                
               
            //stars
            for(int j=2*n-i;j>=1;j--){
                System.out.print("*");
            }

            //space
            for(int j=0;j<endingSpace;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=2*n-i;j>=1;j--){
                System.out.print("*");
            }

            endingSpace+=2;
            
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
    
                for(int j=0;j<init;j++){
                    System.out.print(" ");
                }
    
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
    
                init-=2;
            }

           
            System.out.println();
        }
    }

    public static void pattern13(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i == 0 || i == n-1 || j==0||j==n-1){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){

                int top = i;
                int left = j;
                int right = (n*2-2)-j;
                int bottom = (n*2-2)-i;
                System.out.print(n - Math.min(Math.min(top,left),Math.min(right,bottom)) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String argu[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n = s1.nextInt();
        pattern14(n);
    }
}