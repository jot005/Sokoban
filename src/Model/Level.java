package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level {

    private Field [][] _map = new Field[10][10];
    private boolean _isFinished;
    private List<MoveableObject> _boxes;
    public Level (){

        for (Field[] row: _map)
        {
            Arrays.fill(row,new Field());
        }

        _boxes = new ArrayList<>();
        _isFinished = false;
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

    public List<MoveableObject> GetBoxes(){
        return _boxes;
    }


}
