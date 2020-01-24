package com.xyqyear.smithinghelper;
import java.util.*;

class VirtualAnvil {
    int MAX_STEP = 10;

    long seed;
    int inputItemId;
    int outputItemId;
    int target;
    int[] lastThreeSteps;
    int sumOfLastThreeSteps = 0;
    Map<Integer, List<List<Integer>>> result = new HashMap<>();
    List<Integer> methods = Arrays.asList(-3, -6, -9, -15, 2, 7, 13, 16);

    public VirtualAnvil(long seed, int inputItemId, int outputItemId, int[] lastThreeSteps) {
        // calculate target position
        this.seed = seed;
        this.inputItemId = inputItemId;
        this.outputItemId = outputItemId;
        this.target = getTarget();
        // System.out.println(target);

        // calculate the sum of last three steps
        this.lastThreeSteps = lastThreeSteps;
        for (int i : lastThreeSteps) this.sumOfLastThreeSteps += methods.get(i-1);


        // initialize result map
        for (int i = 0; i < MAX_STEP; i++) {
            this.result.put(i, new ArrayList<>());
        }

        // calculate actual steps
        calculateSteps(new ArrayList<>(), 0);
    }

    public int getTarget() {
        return 70 + new Random(seed + inputItemId + outputItemId).nextInt(50);
    }

    private int sumOfList(List<Integer> array) {
        int sum = 0;
        for (int value : array) sum += value;
        return sum;
    }

    public void calculateSteps(List<Integer> steps, int stepNum) {
        if (sumOfList(steps) < 0 || sumOfList(steps) > 150 || stepNum > MAX_STEP-1) {
            return;
        }

        for (int i = 7; i >= 0; i--) {
            List<Integer> tempStep = new ArrayList<>(steps);
            tempStep.add(methods.get(i));
            if (sumOfList(tempStep) + sumOfLastThreeSteps == target) {
                this.result.get(stepNum).add(tempStep);
                return;
            } else {
                calculateSteps(tempStep, stepNum + 1);
            }

            // Since the minimal target is 70, 70 // 16 is 4
            if (stepNum < 4) {
                break;
            }
        }
    }

    public void findMinSteps() {
        for (int i = 4; i < MAX_STEP; i++) {
            if (!result.get(i).isEmpty()) {
                List<Integer> bestWay = result.get(i).get(0);
                for (int step : bestWay) {
                    System.out.print((methods.indexOf(step) + 1) + "->");
                }
                for (int step : lastThreeSteps) {
                    System.out.print(step + "->");
                }
                System.out.println("Done");
                // only show the shortest way
                break;
            }
        }
    }
}
