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

            return BQ;
        }
        else
        {

            return WQ;
        }
    }
    public void initList()
    {
        possibleMoves = new ArrayList<Board.Coordinate>();

        for (int x=1; x< 8;x++) {
            for (int y = 1; y < 8; y++) {

                possibleMoves.add(new Board.Coordinate(x,-y));
                possibleMoves.add(new Board.Coordinate(-x,-y));
                possibleMoves.add(new Board.Coordinate(-x,y));
                possibleMoves.add(new Board.Coordinate(-x,-y));

            }


        }




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
