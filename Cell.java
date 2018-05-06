public class Cell {

    private boolean isTaken = false;
    private String player = " ";

    public Cell() {};

    //cloning constructor
    public Cell(Cell another) {
        isTaken = another.isTaken;
        player = another.player;
    }

    public boolean getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean s) {
        isTaken = s;
    }

    public String getPlayer() {
        return player;
    }

     public void setPlayer(String p) {
        if (isTaken) {
            throw new CellAlreadyTakenException("Already Taken");
        }
        player = p;
        isTaken = true;
    }
}