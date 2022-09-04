package Model;

import java.util.List;

public class Game {

    private List<Level> _levels;
    private Level _currentLevel;
    private Settings _settings;
    private Player _player;
    public Game (){

    _player = new Player();
    _settings = new Settings();
    CreateLevels();

    }

    private void CreateLevels(){

        _settings.GetGamePath();
    }

    public Level GetCurrentLevel(){
        return _currentLevel;
    }

    public void SetCurrentLevel(Level currentLevel){
        _currentLevel = currentLevel;
    }

    public Player GetPlayer(){
        return _player;
    }

}
