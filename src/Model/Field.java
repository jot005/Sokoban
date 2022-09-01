package Model;

public class Field {
    private FieldType _type;

    public Field (){
        _type = FieldType.Empty;
    }
    public Field(FieldType type){
        _type = type;
    }

    public FieldType GetType(){
        return _type;
    }

    public void SetType(FieldType type){
        _type = type;
    }
}
