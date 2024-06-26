package com.theisland.main;

import com.theisland.enums.WindowNames;

public class EnvironmentVariables {

    // To know if it's necessary to center the window 
    private Boolean resetWindowPosition;
    private WindowNames currentWindow;
    private boolean refreshWindow;
    // Make us able to know if the "GameWindow" already has been initialized at least once (not very useful at the moment)
    private boolean isGameWindowInitialized;
    
    private GameVariables gameVariables;



    public void initVariables() {
        this.resetWindowPosition = true;
        this.currentWindow = WindowNames.MAIN_MENU;
        this.refreshWindow = true;
        this.gameVariables = new GameVariables();
        this.isGameWindowInitialized = false;
    }


    // Getters & Setters


    public Boolean getResetWindowPosition() {
        return resetWindowPosition;
    }
    public void setResetWindowPosition(Boolean resetWindowPosition) {
        this.resetWindowPosition = resetWindowPosition;
    }

    public WindowNames getCurrentWindow() {
        return currentWindow;
    }
    public void setCurrentWindow(WindowNames currentWindow) {
        this.currentWindow = currentWindow;
    }

    public Boolean getRefreshWindow() {
        return refreshWindow;
    }
    public void setRefreshWindow(boolean refreshWindow) {
        this.refreshWindow = refreshWindow;
    }

    public GameVariables getGameVariables() {
        return gameVariables;
    }
    public void setGameVariables(GameVariables gameVariables) {
        this.gameVariables = gameVariables;
    }

    public boolean getIsGameWindowInitialized() {
        return isGameWindowInitialized;
    }
    public void setIsGameWindowInitialized(boolean isGameWindowInitialized) {
        this.isGameWindowInitialized = isGameWindowInitialized;
    }
}
