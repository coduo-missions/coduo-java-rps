package rps.util.coduo;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * ⚠️ 해당 클래스의 코드는 수정할 수 없습니다‼️
 */
public final class RandomTool {

    public static String pickRSP() {
        final int randomNumber = Randoms.pickNumberInRange(1, 3);
        if (randomNumber == 1) {
            return "rock";
        }

        if (randomNumber == 2) {
            return "scissors";
        }

        return "paper";
    }
}
