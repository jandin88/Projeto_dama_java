package boardgame;

import ladygame.Color;

public abstract class  Piece {
    protected Position position;
    private Board board;


    public Piece(Board board) {
        this.board = board;
        this.position =null;
    }




    public Board getBoard(){
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position){
        return possibleMoves()[position.getRows()][position.getColumns()];
    }
    public boolean isThereAnyPossibleMoves(){
        boolean[][] mat=possibleMoves();
        for(int i =0;i< mat.length;i++){
            for(int j=0;j< mat.length;j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    
}
