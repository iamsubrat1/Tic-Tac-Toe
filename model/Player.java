package model;

public class Player {


    public String name;

    public PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPeice() {
        return playingPiece;
    }

    public void setPlayingPeice(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }


}
