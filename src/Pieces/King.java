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
        initList();
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

    public void initList()
    {
        possibleMoves = new ArrayList<Board.Coordinate>();

        possibleMoves.add(new Board.Coordinate(2,0));
       possibleMoves.add(new Board.Coordinate(0,1));
       possibleMoves.add(new Board.Coordinate(1,1));
        possibleMoves.add(new Board.Coordinate(-1,-1));
        possibleMoves.add(new Board.Coordinate(-1,0));
        possibleMoves.add(new Board.Coordinate(0,-1));
        possibleMoves.add(new Board.Coordinate(1,-1));
        possibleMoves.add(new Board.Coordinate(-1,1));









    }



    @Override
    public ArrayList<Board.Coordinate> validMoves(Piece[][] board) {

        ArrayList<Board.Coordinate> allowedMoves = new ArrayList<>();

        for (int i = 0; i < possibleMoves.size(); i++) {
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
}
