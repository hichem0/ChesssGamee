package Pieces;

import Game.Board;

import java.util.ArrayList;

public class Rook extends Piece {


    String image;

    public Rook(int x, int y, Color color) {
        super(x, y, color);
        this.image = verifyPicture(color);
        initList();
    }
    String BR="\u265C";
    String WR="\u2656";





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
    public void initList()
    {
        possibleMoves = new ArrayList<Board.Coordinate>();

        for (int x=0; x< 8;x++) {
            for (int y = 0; y < 8; y++) {

                possibleMoves.add(new Board.Coordinate(0,-y));
                possibleMoves.add(new Board.Coordinate(0,y));
                possibleMoves.add(new Board.Coordinate(x,0));
                possibleMoves.add(new Board.Coordinate(-x,0));



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
