package Model;

import java.awt.geom.Dimension2D;

public class Settings {

    private Integer _volume;
    private String _gamePath = "";
    private Dimension2D _windowSize;
    private boolean isFullScreen;

    public Settings (){

        _volume = 50;
        _windowSize.setSize(1280,800);
        isFullScreen = false;
    }

    public void SetGamePath(String gamePath){
        _gamePath = gamePath;
    }
    public String GetGamePath(){
        return _gamePath;
    }

    public Dimension2D GetWindowSize(){
        return _windowSize;
    }

    public void SetWindowSize(Dimension2D windowSize){
        _windowSize = windowSize;
    }
}
