package Game;

import Pieces.Piece;
import sun.plugin.dom.core.CoreConstants;

import java.util.ArrayList;

public class Update_Board {

    public Update_Board(){}
//this methode is just to plit "," because the user when he enter his move he entrer like this D2,D3
    public String[] readAction(String input)
    {
        String[] output;
        output = input.split(",");
        return output;
    }

    public Board.Coordinate convert(String input)
    {
        Board.Coordinate destination = new Board.Coordinate(-1,-1);
        int x,y = -1;
        char a = input.charAt(0);
        switch (a)
        {
            case 'A' : y = 0; break;
            case 'B' : y = 1; break;
            case 'C' : y = 2; break;
            case 'D' : y = 3; break;
            case 'E' : y = 4; break;
            case 'F' : y = 5; break;
            case 'G' : y = 6; break;
            case 'H' : y = 7; break;

        }

        x = Character.getNumericValue(input.charAt(1))-8;
        destination.setX(Math.abs(x));
        destination.setY(y);

        return destination;
    }

//this methode to do permutation making a update in chessboard
    public Piece[][] permute(Board.Coordinate init, Board.Coordinate dest, Piece[][] board)
    {
        Piece p1 = board[init.getX()][init.getY()];
        Piece p2 = board[dest.getX()][dest.getY()];

        board[init.getX()][init.getY()].updatePosition(dest.getX(), dest.getY());
        board[dest.getX()][dest.getY()].updatePosition(init.getX(), init.getY());

        board[init.getX()][init.getY()] = p2;
        board[dest.getX()][dest.getY()] = p1;

        return board;
    }


}
