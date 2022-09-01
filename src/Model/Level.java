package Model;

public class Level {

    private Field [][] _map = new Field[10][10];
    private boolean _isFinished;
    private MoveableObject[] _boxes;

    public Level (){

    }

    public Field[][] GetMap(){
        return _map;
    }

    public boolean GetIsFinished (){
        return _isFinished;
    }

    public void SetIsFinished(boolean isFinished){
        _isFinished = isFinished;
    }

    public MoveableObject[] GetBoxes(){
        return _boxes;
    }


}
