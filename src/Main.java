import Game.Update_Board;
import Game.Board;
import Pieces.Color;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Color turn;

    public static void main(String[] args) {
        // Init Board
        Board b = new Board();
        Update_Board updateBoard = new Update_Board();

        Piece[][] board = b.InitBoard();
        b.printBoard(board);


        while (true) {
            //Enter your move

            if (turn == Color.BLACK) {
                System.out.println("Enter your move player1 : (ex:D2,D3) ");
                Scanner scanner = new Scanner(System.in);
                String move = scanner.nextLine();
                String[] splitedMove = updateBoard.readAction(move.toUpperCase());


                Board.Coordinate selectedPieceCoord = updateBoard.convert(splitedMove[0]);
                Board.Coordinate destCoord = updateBoard.convert(splitedMove[1]);


                //Check for Valid Moves
                ArrayList<Board.Coordinate> list = new ArrayList<>();
                list = board[selectedPieceCoord.getX()][selectedPieceCoord.getY()].validMoves(board);

                if (list.contains(destCoord)) {

                    System.out.println("Movement accepted !");
                    board = updateBoard.permute(selectedPieceCoord, destCoord, board);
                    b.printBoard(board);

                } else {

                    System.out.println("Movement Denied !");

                }


            } else {
                System.out.println("Enter your move player1 : (ex:D2,D3) ");
                Scanner scanner = new Scanner(System.in);
                String move = scanner.nextLine();
                String[] splitedMove = updateBoard.readAction(move.toUpperCase());


                Board.Coordinate selectedPieceCoord = updateBoard.convert(splitedMove[0]);
                Board.Coordinate destCoord = updateBoard.convert(splitedMove[1]);


                //Check for Valid Moves
                ArrayList<Board.Coordinate> list = new ArrayList<>();
                list = board[selectedPieceCoord.getX()][selectedPieceCoord.getY()].validMoves(board);

                if (list.contains(destCoord)) {

                    System.out.println("Movement accepted ");
                    board = updateBoard.permute(selectedPieceCoord, destCoord, board);
                    b.printBoard(board);

                } else {

                    System.out.println("Movement Denied ");

                }

            }
        }
    }}