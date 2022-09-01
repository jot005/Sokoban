package Model;

public class Position {

    private Integer _x;
    private Integer _y;

    public Position (){

    }
    public Position (Integer x, Integer y){
        _x = x;
        _y = y;
    }
    public Integer GetX(){
        return _x;
    }
    public void SetX(Integer x){
        _x = x;
    }

    public Integer GetY(){
        return _y;
    }

    public void SetY(Integer y){
        _y = y;
    }
}
