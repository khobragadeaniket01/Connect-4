package Main;

public class Player {
    protected String name;
    protected String tag;
    protected int nbDisc;
    protected int score;

    public Player(String name, String tag, int nbDisc, int score) {
        this.name = name;
        this.nbDisc = nbDisc;
        this.score = score;
        this.tag = tag;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public String getPlayerTag() {
        return tag;
    }

    public void setPlayerTag(int nbDisc) {
        this.tag = tag;
    }

    public int getPlayerDiscNumber() {
        return nbDisc;
    }

    public void setPlayerDiscNumber(int nbDisc) {
        this.nbDisc = score;
    }

    public int getPlayerScore() {
        return score;
    }

    public void setPlayerScore(int score) {
        this.score = score;
    }
}
