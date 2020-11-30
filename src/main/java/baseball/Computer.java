package baseball;

import utils.RandomUtils;

public class Computer {
    int[] answer = new int[Constant.NUMBER_LEN];
    boolean[] alreadyUse = new boolean[Constant.MAX_VALUE + 1];

    public Computer () {
        for (int i = 0; i < Constant.NUMBER_LEN; i++) {
            int num = RandomUtils.nextInt(Constant.MIN_VALUE, Constant.MAX_VALUE);

            if (!alreadyUse[num]) {
                alreadyUse[num] = true;
                answer[i] = num;
            } else {
                i--;
            }
        }
    }
}
