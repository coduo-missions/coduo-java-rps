package rps.util.model;

public enum RPS {
    SCISSOR("가위", "scissors"),
    ROCK("바위", "rock"),
    PAPER("보", "paper");

    private String korRsp;
    private String engRsp;

    private RPS(String kor, String eng) {
        this.korRsp = kor;
        this.engRsp = eng;
    }

    public String getKorRsp() {
        return korRsp;
    }
}
