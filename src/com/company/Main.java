package com.company;




import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int [][] m={{1,99,91,11,44}, {0,10,9,9,11},{3,23,21,5,20},{13,4,45,66,88},{11,0,1,20,56}};
        System.out.println("    Before Sorting");
        System.out.println("=======================");
        for(int[]i:m){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("\n    After Sorting");
        System.out.println("=======================");
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length-1; k++) {
                    if(m[i][k]>m[i][k+1]){
                        int temp=m[i][k];
                        m[i][k]=m[i][k+1];
                        m[i][k+1]=temp;
                    }
                }
            }
        }for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j]+"  ");
            System.out.println();

        }
    }
}

