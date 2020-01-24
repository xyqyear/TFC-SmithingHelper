package com.xyqyear.smithinghelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            long seed = 8041252338967350698L;
            System.out.println("请输入原料物品id （如果是两个物品则是第一个物品）:");
            Scanner scan = new Scanner(System.in);
            int inputItemId = scan.nextInt();
            System.out.println("请输入产品物品id （忽略冒号后）");
            int outputItemId = scan.nextInt();
            System.out.println("请输入最后三步, 空格分隔（和砧上面显示是倒着的）");
            int[] lastThreeSteps = new int[3];
            for (int i = 0; i < 3; i++) lastThreeSteps[i] = scan.nextInt();

            VirtualAnvil anvil = new VirtualAnvil(seed, inputItemId, outputItemId, lastThreeSteps);
            anvil.findMinSteps();
        }
    }
}