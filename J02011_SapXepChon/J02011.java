/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02011_SapXepChon;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[minPos])
                    minPos = j;
            }
            int tmp = a[i];
            a[i] = a[minPos];
            a[minPos] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
