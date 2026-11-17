/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package useaitolearn;

import java.util.Scanner;

/**
 *
 * @author QUINONES_CPE113
 */
public class Useaitolearn {

    /**
     * @param args the command line arguments
     */
    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }
        return (double) total / count;
    }

    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total (whole number): ");
        int userTotal = input.nextInt();

        System.out.print("Enter count (whole number): ");
        int userCount = input.nextInt();

        double userResult = computeAverage(userTotal, userCount);
        System.out.println("Your test (" + userTotal + ", " + userCount + ") -> Result: " + userResult);

        input.close();
    }
}
