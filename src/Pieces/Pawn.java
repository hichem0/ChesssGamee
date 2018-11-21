package Pieces;

import Game.Board;

import java.util.ArrayList;


public class Pawn extends Piece {

    String BP="\u265F";
    String WP="\u2659";
    String Picture;


    public Pawn(int x, int y, Color color) {
        super(x, y, color);
        this.Picture = verifyPicture(color);
        initList();
    }

    public void initList()
    {
        possibleMoves = new ArrayList<Board.Coordinate>();

        possibleMoves.add(new Board.Coordinate(1,0));
        possibleMoves.add(new Board.Coordinate(2,0));
        possibleMoves.add(new Board.Coordinate(-1,0));
        possibleMoves.add(new Board.Coordinate(-2,0));


    }

    @Override
    public ArrayList<Board.Coordinate> validMoves(Piece[][] board) {

        ArrayList<Board.Coordinate> allowedMoves = new ArrayList<>();

        for (int i = 0; i < 4 ; i++) {
            Board.Coordinate destination = new Board.Coordinate(this.position.getX()+possibleMoves.get(i).getX(),
                    this.position.getY()+possibleMoves.get(i).getY());

            int destX = destination.getX();
            int destY = destination.getY();

            if(testBound(destX, destY))
            {
                Piece p = board[destX][destY];

                if(p.getPicture() == "-")
                {
                    allowedMoves.add(destination);
                }
                else
                {
                    if(this.getColor()!= p.getColor())
                    {
                        //Enemy Piece
                        allowedMoves.add(destination);
                    }
                }

            }
            
        }

        System.out.println("number of moves = "+allowedMoves.size());
        return allowedMoves;
    }

    @Override
    public Color getColor() {
        return this.color;
    }



    @Override
    public String getPicture() {
        return this.Picture;
    }


    @Override
    public String verifyPicture(Color color) {
        if(color == Color.BLACK)
        {

            return BP;
        }
        else
        {

            return WP;
        }
    }
}
