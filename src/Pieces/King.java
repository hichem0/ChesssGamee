package Pieces;

import Game.Board;

import java.util.ArrayList;

public class King extends Piece {

    String BK="\u265A";
    String WK="\u2654";
    String image;

    public King(int x, int y, Color color) {
        super(x, y, color);
        this.image = verifyPicture(color);
    }

    @Override
    public ArrayList<Board.Coordinate> validMoves(Piece[][] board) {
        return null;
    }



    @Override
    public String getPicture() {
        return this.image;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public String verifyPicture(Color color) {
        if(color == Color.BLACK)
        {

            return BK;
        }
        else
        {

            return WK;

        }
    }
}
