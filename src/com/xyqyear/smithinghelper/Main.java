package com.xyqyear.smithinghelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean debugMode = false;
        Scanner scan = new Scanner(System.in);
        long seed;
        if (debugMode) {
            seed = 8041252338967350698L;
        } else {
            System.out.println("请输入世界种子:");
            seed = scan.nextLong();
        }

        while (true) {
            System.out.println("请输入原料物品id （如果是两个物品则是第一个物品）:");
            int inputItemId = scan.nextInt();
            System.out.println("请输入产品物品id （忽略id的冒号后数字）:");
            int outputItemId = scan.nextInt();
            System.out.println("请输入最后三步, 空格分隔（和砧上面显示是倒着的）:");
            int[] lastThreeSteps = new int[3];
            for (int i = 0; i < 3; i++) lastThreeSteps[i] = scan.nextInt();

            System.out.println("最短步骤： （需要帮助见 https://github.com/xyqyear/TFC-SmithingHelper）");
            VirtualAnvil anvil = new VirtualAnvil(seed, inputItemId, outputItemId, lastThreeSteps);
            anvil.findMinSteps();
        }
    }
}
