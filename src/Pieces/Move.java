package Pieces;

public class Move {
    private int x;
    private int y;
    private int color;
    public void move(int x, int y){
        if(moveIsLegal(x, y)){
            this.x = x;
            this.y = y;
        }
    }

    private boolean moveIsLegal(int x, int y) {
        return true;
    }
    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

}
