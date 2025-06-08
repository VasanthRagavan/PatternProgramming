import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        pattern15(n);
        sc.close();
    }


    public static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
       for(int i = 0;i<n;i++){
        for(int j = 0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }

    public static void pattern3(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }

     public static void pattern4(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = 0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 0;i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        int space  = n-1;
            int stars = 1;  
        for(int i = 0;i<n;i++){
            for(int j = 0;j< space;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<stars;j++){
                System.out.print("*");
            }
             for(int j = 0;j< space;j++){
                System.out.print(" ");
            }
            space = space-1;
            stars+=2;

            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void pattern9(int n){
        int space  = n-1;
            int stars = 1;  
        for(int i = 0;i<n;i++){
            for(int j = 0;j< space;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<stars;j++){
                System.out.print("*");
            }
             for(int j = 0;j< space;j++){
                System.out.print(" ");
            }
            space = space-1;
            stars+=2;
            System.out.println();
            
        }
          for( int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        for(int i = 0;i<(2*n-1);i++){
            int stars = i<= n ? i : (2*n-i);
            for(int j = 0;j<stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

            
    }

     public static void pattern11(int n){
        for(int i = 0;i<n;i++){
            int start = 1;
            for(int j = 0;j<=i;j++){
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
     }

      public static void pattern12(int n){
        for(int i = 0;i< n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(j);
            }
            for(int j =1;j<2*(n-1-i);j++){
                System.out.print(" ");
            }
             for(int j = i;j>=0;j--){
                System.out.print(j);
             }
            System.out.println();

        }
      }

      public static void pattern13(int n){
          int number = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((number)+" ");
                number ++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i = 0;i<n;i++){
            for(char j = 'A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for(int i = 0;i<n;i++){
            for(char j = (char)('A'+ n-1);j>='A'+n-i-1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    



}


    





    