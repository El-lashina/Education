package Module2_Collections.Example15;

public class Repost {
    private String nik;
    private int numberRepost;

    public String getNik() {
        return nik;
    }

    public int getNumberRepost() {
        return numberRepost;
    }

    public void setNumberRepost(int numberRepost) {
        this.numberRepost = numberRepost;
    }

    public Repost(String nik, int numberRepost) {
        this.nik = nik;
        this.numberRepost = numberRepost;
    }

    @Override
    public String toString() {
        return " reposted " +  nik + " " + numberRepost;
    }
}
