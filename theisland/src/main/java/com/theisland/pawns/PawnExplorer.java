package com.theisland.pawns;

import com.theisland.pawns.enums.PawnExplorerColors;

public class PawnExplorer extends Pawn {

    /**
     * Know if the player is saved or not
     * If ( {@code isAlive == false} or {@code isAlive == true} ) AND {@code status == null}, the {@code PawnExplorer} isn't initialized yet
     */
    private Boolean isAlive;
    /**
     * Value of an Explorer Pawn in game points
     */
    private Integer treasureAmount;
    /**
     * is the player is a Swimmer or not
     */
    private Boolean isSwimmer;
    private PawnExplorerColors color;


    // Getters & Setters

    public Boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Integer getTreasureAmount() {
        return treasureAmount;
    }
    public void setTreasureAmount(Integer treasureAmount) {
        this.treasureAmount = treasureAmount;
    }
    
    public Boolean getIsSwimmer() {
        return isSwimmer;
    }
    public void setIsSwimmer(Boolean isSwimmer) {
        this.isSwimmer = isSwimmer;
    }

    public PawnExplorerColors getColor() {
        return color;
    }
    public void setColor(PawnExplorerColors color) {
        this.color = color;
    }
}
