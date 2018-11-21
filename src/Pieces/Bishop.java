package Pieces;

import Game.Board;

import java.util.ArrayList;
//this class is for bishop

public class Bishop extends Piece {

    //declare the variables
    String BB="\u265D";
    String WB="\u2657";
    String Picture;


    public Bishop(int x, int y, Color color) {
        super(x, y, color);
        this.Picture = verifyPicture(color);
    }

    @Override
    public ArrayList<Board.Coordinate> validMoves(Piece[][] board) {
        return null;
    }



    @Override
    public String getPicture() {
        return this.Picture;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public String verifyPicture(Color color) {
        if(color == Color.BLACK)
        {

            return BB;
        }
        else
        {

            return WB;
        }
    }


}
