package rps;

public enum RPS {
    ROCK("바위", "rock"),
    PAPER("보", "paper"),
    SCISSORS("가위", "scissors");

    private String koreanRPS;
    private String englishRPS;

    private RPS(String korRPS, String engRPS) {
        this.koreanRPS = korRPS;
        this.englishRPS = engRPS;
    }
    public String getKorRPS() {
        return koreanRPS;
    }
}
