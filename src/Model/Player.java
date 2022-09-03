package Model;

public class Player extends MoveableObject {

    private WalkDirection _walkDirection = WalkDirection.Down;

    public Player (){

    }

    public WalkDirection GetWalkDirection (){

        return _walkDirection;
    }

    public void SetWalkdirection (WalkDirection walkDirection){

        _walkDirection = walkDirection;
    }



}
