package rps.util.model;

public class Judge {

    public static final int COMPUTER_WIN = -1;
    public static final int USER_WIN = 1;
    public static final int DRAW = 0;


    public static int judge(Computer com, User user) {
        if (com.peekRSP().getKorRsp().equals(user.peekRSP().getKorRsp())) {
            return DRAW;
        }
        if (com.peekRSP().getKorRsp().equals("가위") && user.peekRSP().getKorRsp().equals("보")) {
            return COMPUTER_WIN;
        }
        if (com.peekRSP().getKorRsp().equals("바위") && user.peekRSP().getKorRsp().equals("가위")) {
            return COMPUTER_WIN;
        }
        if (com.peekRSP().getKorRsp().equals("보") && user.peekRSP().getKorRsp().equals("바위")) {
            return COMPUTER_WIN;
        }
        return USER_WIN;
    }
}
