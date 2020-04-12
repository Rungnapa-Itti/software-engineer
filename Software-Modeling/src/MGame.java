public class MGame {
    private int roundCount;
    private Die[] dice;
    private Board board;
    private Player[] players;




    public void playGame(int n ){

        for(roundCount = 0 ; roundCount<n ; roundCount++){
            playRound();

        }
    }

    private void playRound(){
        for(int i = 0 ; i<players.length ; i++){
            players[i].takeTurn();
        }
    }
}
