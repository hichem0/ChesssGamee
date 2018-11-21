package Pieces;

import Game.Board;

import java.util.ArrayList;

public class Rook extends Piece {


    String image;

    public Rook(int x, int y, Color color) {
        super(x, y, color);
        this.image = verifyPicture(color);
    }
    String BR="\u265C";
    String WR="\u2656";
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

            return BR;
        }
        else
        {

            return WR;
        }
    }

}
