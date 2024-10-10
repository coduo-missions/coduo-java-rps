package rps;

public enum RPS {
    ROCK("바위", "rock"),
    PAPER("보", "paper"),
    SCISSORS("가위", "scissors");

    private String korRPS;
    private String engRPS;

    private RPS(String korRPS, String engRPS) {
        this.korRPS = korRPS;
        this.engRPS = engRPS;
    }
    public String getKorRPS() {
        return korRPS;
    }
}
