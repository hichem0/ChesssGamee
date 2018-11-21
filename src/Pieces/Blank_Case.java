package Pieces;


import Game.Board;

import java.util.ArrayList;

public class Blank_Case extends Piece{

    String EMPTY="-";
    String Picture;

    public Blank_Case(int x, int y) {
        super(x, y);

        this.Picture = EMPTY;

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
        return null;
    }
}
