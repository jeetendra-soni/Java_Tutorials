import java.util.*;
public class Patterns {
    public static void main(String args[]){
        // SquarPattern();
        // TringlePattern();
        // ReverseTringlePattern();
        // HollowRectanglePattern();
        // DimondPattern();
        // RectanglePattern();
        HalfPiramidPattern();
    }

    static void SquarPattern(){
        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter a number gretter than 1 :-\n");
         int number = sc.nextInt();

        System.out.println("\n\nSquar Pattern Printed below:-\n");
        for(int i = 1; i<=number; i++){
            for(int j =1; j<=number; j++){
                System.out.print("* "); 
            }
            System.out.println(" ");
        }
        sc.close();
    }



    static void RectanglePattern(){

        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter No. of ROW:-\n");
         int row = sc.nextInt();

         System.out.println("\nEnter No. of Column:-\n");
         int column = sc.nextInt();

         System.out.println("\n\nRectangle Pattern Printed below:-\n");
        for(int i = 1; i<=row; i++){
            for(int j =1; j<=column; j++){
                System.out.print("* "); 
            }
            System.out.println(" ");
        }
        sc.close();
    }


    static void HollowRectanglePattern(){

        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter No. of ROW:-\n");
         int row = sc.nextInt();

         System.out.println("\nEnter No. of Column:-\n");
         int column = sc.nextInt();

         System.out.println("\n\nHollow Rectangle Pattern Printed below:-\n");
        for(int i = 1; i<=row; i++){
        
            for(int j =1; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("* "); 
                }else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }


    static void TringlePattern(){
        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter any odd number gretter than 1 :");
         int number = sc.nextInt();

        System.out.println("\n\nYour Pattern Printed below:-\n");
        for(int i = 1; i<=(number+1)/2; i++){

            for(int j =i; j<=(number-1)/2; j++){
                System.out.print(" "); 
            }

            // loop for actual value print
            for(int k =1; k<=i*2-1; k++){
                System.out.print("* "); 
            }

            for(int l =i; l<=(number-1)/2; l++){
                System.out.print(" "); 
            }
            System.out.print("\n");
        }
        sc.close();
    }


    static void ReverseTringlePattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter any odd number gretter than 1: ");
        int number = sc.nextInt();
        
        System.out.println("\n\nYour Pattern printed below-\n");
        for(int i = 1; i<= (number+1)/2; i++){
            
            for(int j=1 ; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=number ; k>=i*2-1; k--){
                System.out.print("*");
            }
            for(int l=1 ; l<=i-1; l++){
                System.out.print(" ");
            }
            System.out.println("\n");
        }

        sc.close();
    }

    static void HalfPiramidPattern(){
        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter a number gretter than 1 :-\n");
         int number = sc.nextInt();

        System.out.println("\n\nSquar Pattern Printed below:-\n");
        for(int i = 1; i<=number; i++){

            // loop for actual value print
            for(int j =1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println(" ");
        }
        sc.close();
    }

    static void DimondPattern(){
        Scanner sc = new Scanner(System.in);

         System.out.println("\nEnter a number gretter than 1 :-\n");
         int number = sc.nextInt();

        System.out.println("\n\nYour Pattern Printed below:-\n");
        for(int i = 1; i<=(number+1)/2; i++){

            for(int j =i; j<=(number-1)/2; j++){
                System.out.print(" "); 
            }

            // loop for actual value print
            for(int k =1; k<=i*2-1; k++){
                System.out.print("*"); 
            }

            for(int l =i; l<=(number-1)/2; l++){
                System.out.print(" "); 
            }
            System.out.print("\n");
        }

        for(int m = 1; m<= (number+1)/2; m++){
            
            for(int n=1; n<=m-1; n++){
                System.out.print(" ");
            }
            for(int o=number ; o>=m*2-1; o--){
                System.out.print("*");
            }
            for(int p=1; p<=m-1; p++){
                System.out.print(" ");
            }
            System.out.print ("\n");
        }

        sc.close();
    }

}
