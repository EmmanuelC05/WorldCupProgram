/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldcuptournament;

/**
 *
 * @author manny
 */
public record BubbleSort<T extends Comparable<T>>(T[] arr) {
    public void sort() {
        for (int g = 0; g < arr.length - 1; g++) {
            boolean didSwap = false;
            for (int j = 0; j < arr.length - g - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }
    
}
