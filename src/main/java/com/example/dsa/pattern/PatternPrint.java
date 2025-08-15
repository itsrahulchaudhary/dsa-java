package com.example.dsa.pattern;

public class PatternPrint {

    public static void main(String[] args) {
      int n=5;
      print11(n);

    }

    public static void print1(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print3(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print4(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void print5(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print6(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print7(int n){
        for(int i = 0; i<n; i++){
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int k= 0; k<2*i+1; k++){
                System.out.print("*");
            }
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print8(int n){
        for(int i=0; i<n; i++){
            // space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int k=0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print9(int n){
        print7(n);
        print8(n);
    }

    public static void print10(int n){
        for(int i=1; i<=2*n-1; i++){
            int star = i;
            if(i>n){
                star = 2*n-i;
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print11(int n){
        for(int i=0; i<n; i++){
            int start;
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j = 0; j<=i; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

}
