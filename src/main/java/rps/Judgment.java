package rps;

public class Judgment {
    public static int judge(String left, String right) {
        if (left.equals(right)) {
            return 0;
        }
        if (left.equals("가위")) {
            if (right.equals("바위")) return -1;
        }
        if (left.equals("바위")){
            if (right.equals("보")) return -1;
        }
        if (left.equals("보")){
            if (right.equals("가위")) return -1;
        }
        return 1;
    }
}
