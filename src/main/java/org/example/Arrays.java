package org.example;

public class Arrays {
    public static void main(String[] args) {
        int[][] nums = new int[5][6];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
