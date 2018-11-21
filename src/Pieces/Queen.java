package Pieces;

import Game.Board;

import java.util.ArrayList;

public class Queen extends Piece {


   String BQ="\u265B";
   String WQ="\u2655";
    String image;


    public Queen(int x, int y, Color color) {
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

            return BQ;
        }
        else
        {

            return WQ;
        }
    }


}
