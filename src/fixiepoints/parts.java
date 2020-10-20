package fixiepoints;

public class parts implements bicycle{
    private String _part;
    private int _score;

    public parts(String part,
                int score) {
        _part = part;
        _score = score;
    }
    public String getPart() {return _part;}
    public int getScore() {return _score;}

}

