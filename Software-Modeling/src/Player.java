public class Player {
    private String name;
    private Die[] die;
    private Board board;
    private Piece piece;


    public void takeTurn(){
        int fv = 0;
        for(int i = 0 ; i<die.length ; i++){
            die[i].roll();
            fv+= die[i].getFaceValue();
        }
        Square oldLoc =  piece.getLocatin();
        Square newLoc =  board.getSquare(oldLoc,fv);
        piece.setLocatin(newLoc);

    }
}
