package Pieces;

import Game.Board;

import java.util.ArrayList;

public abstract class Piece {

    Board.Coordinate position;
    Color color;
    ArrayList<Board.Coordinate> possibleMoves;

    public Piece(int x, int y, Color color)
    {
        this.position = new Board.Coordinate(x,y);
        this.color = color;
    }

    public Piece (int x, int y)
    {
        this.position = new Board.Coordinate(x, y);
    }

    public void updatePosition(int x, int y)
    {
        this.position = new Board.Coordinate(x,y);
    }

    public Piece getPiece()
    {
        return this;
    }

    public boolean testBound(int x, int y)
    {
        if (x>7 || x<0 || y>7 || y<0 )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public int x;
    public int y;
    public abstract ArrayList<Board.Coordinate> validMoves(Piece[][] board);



    public abstract String getPicture();

    public abstract  Color getColor() ;



    public abstract String verifyPicture(Color color);

   /* public boolean moveIsLegal(int x, int y) {
        return true;
   }   */




}
