package Pieces;

import Game.Board;

import java.util.ArrayList;

public class Knight extends Piece {


    String BN="\u265E";
    String WN="\u2658";
    String Picture;


    public Knight(int x, int y, Color color) {
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

            return BN;
        }
        else
        {

            return WN;
        }
    }


        }



