package org.example;

public class ArrayCreator {
    public static int[] getArray(int quantity){
        int[] newArray = new int[quantity];
        int missingNumberIndex = (int) (Math.random() * quantity);
        for (int i = 0; i < quantity; i++) {
            if (i < missingNumberIndex) newArray[i] = i + 1;
            else newArray[i] = i + 2;
        }
        return newArray;
    }
}
