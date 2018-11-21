package Game;
import Pieces.*;
public class Board {

    private static int turn = 1;// 1 for white ,2 for black
    public Piece[][] InitBoard(){
        //create the tables for white pawn and black pawn
        Pawn[] blackPawns = new Pawn[8];
        Pawn[] whitePawns = new Pawn[8];
//create the tables for white Rook and black Rook
        Rook BK1 = new Rook(0,0, Color.BLACK);
        Rook BK2 = new Rook(0,7, Color.BLACK);

//make a loop for Blackpawn to print in console
        for (int i = 0; i < 8; i++) {
            blackPawns[i] = new Pawn(1,i,Color.BLACK);
        }
//make a loop for Whitepawn to print in console
        for (int i = 0; i < 8; i++) {
            whitePawns[i] = new Pawn(6,i,Color.WHITE);
        }

//put every pieces like knight,queen in exact coordination to print in console like a chess board
        Piece[][] board = {
                {BK1, new Knight(0,1,Color.BLACK), new Bishop(0,2,Color.BLACK),
                        new Queen(0,3,Color.BLACK), new King(0, 4, Color.BLACK), new Bishop(0, 5, Color.BLACK),
                        new Knight(0, 6, Color.BLACK), BK2},

                {blackPawns[0], blackPawns[1], blackPawns[2], blackPawns[3], blackPawns[4], blackPawns[5], blackPawns[6], blackPawns[7]},

                {new Blank_Case(2,0),new Blank_Case(2,1),new Blank_Case(2,2),new Blank_Case(2,3),
                        new Blank_Case(2,4),new Blank_Case(2,5),new Blank_Case(2,6),new Blank_Case(2,7)},

                {new Blank_Case(3,0),new Blank_Case(3,1),new Blank_Case(3,2),new Blank_Case(3,3),
                        new Blank_Case(3,4),new Blank_Case(3,5),new Blank_Case(3,6),new Blank_Case(3,7)},

                {new Blank_Case(4,0),new Blank_Case(4,1),new Blank_Case(4,2),new Blank_Case(4,3),
                        new Blank_Case(4,4),new Blank_Case(4,5),new Blank_Case(4,6),new Blank_Case(4,7)},

                {new Blank_Case(5,0),new Blank_Case(5,1),new Blank_Case(5,2),new Blank_Case(5,3),
                        new Blank_Case(5,4),new Blank_Case(5,5),new Blank_Case(5,6),new Blank_Case(5,7)},

                {whitePawns[0], whitePawns[1], whitePawns[2], whitePawns[3], whitePawns[4], whitePawns[5], whitePawns[6], whitePawns[7]},

                {new Rook(7,0, Color.WHITE), new Knight(7,1,Color.WHITE), new Bishop(7,2,Color.WHITE),
                        new Queen(7,3,Color.WHITE), new King(7, 4, Color.WHITE), new Bishop(7, 5, Color.WHITE),
                        new Knight(7, 6, Color.WHITE), new Rook(7, 7, Color.WHITE)}

        };

        return board;
    }

    public void printBoard(Piece board[][]){
        int num = 8;
        System.out.println("| ----------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(num+"| ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j].getPicture()+" | ");
            }
            System.out.println();
            System.out.println(" ----------------------------------- ");
            --num;
        }

        System.out.println("   A   B   C   D   E   F   G   H");

    }
    //class coordinate is to have getter,setter

   public static class Coordinate {
        public int x;
      public int y;



        public Coordinate(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        //Override equals method to compare 2 objects
        @Override
        public boolean equals(Object o) {

            // If the object is compared with itself then return true
            if (o == this) {
                return true;
            }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
            if (!(o instanceof Coordinate)) {
                return false;
            }

            // typecast o to Complex so that we can compare data members
            Coordinate c = (Coordinate) o;

            // Compare the data members and return accordingly
            return Integer.compare(x, c.x) == 0
                    && Double.compare(y, c.y) == 0;
        }


    }




}
