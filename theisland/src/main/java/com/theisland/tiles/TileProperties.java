package com.theisland.tiles;

import java.util.Arrays;
import java.util.List;

import com.theisland.tiles.enums.TileActions;

public class TileProperties {


    /**
     * List of possible {@code TileActions} that can be behind a {@code TileBeach}
     */
    final static public List<TileActions> TILE_BEACH_ACTION = Arrays.asList(    // Fixed List size because this list shouldn't change size
        TileActions.GREEN_PLACE_WHALE,
        TileActions.GREEN_PLACE_SHARK,
        TileActions.GREEN_PLACE_BOAT,

        TileActions.RED_MOVE_BOAT,
        TileActions.RED_DOLPHIN_HELP,
        TileActions.RED_MOVE_SNAKE,
        TileActions.RED_MOVE_SHARK,
        TileActions.RED_MOVE_WHALE,

        TileActions.DEF_KILL_SHARK
    );


    /**
     * List of possible {@code TileActions} that can be behind a {@code TileForest}
     */
    final static public List<TileActions> TILE_FOREST_ACTIONS = Arrays.asList(    // Fixed List size because this list shouldn't change size
        TileActions.GREEN_PLACE_WHALE,
        TileActions.GREEN_PLACE_SHARK,
        TileActions.GREEN_PLACE_BOAT,
        TileActions.GREEN_PLACE_WHIRLPOOL,

        TileActions.RED_DOLPHIN_HELP,
        TileActions.RED_MOVE_SNAKE,
        TileActions.RED_MOVE_SHARK,
        TileActions.RED_MOVE_WHALE,

        TileActions.DEF_KILL_SHARK,
        TileActions.DEF_KILL_WHALE
    );


    /**
     * List of possible {@code TileActions} that can be behind a {@code TileMountain}
     */
    final static public List<TileActions> TILE_MOUNTAIN_ACTIONS = Arrays.asList(    // Fixed List size because this list shouldn't change size
        TileActions.GREEN_PLACE_SHARK,
        TileActions.GREEN_PLACE_WHIRLPOOL,
        TileActions.GREEN_PLACE_VOLCANO,

        TileActions.DEF_KILL_SHARK,
        TileActions.DEF_KILL_WHALE
    );


    /**
     * Number of tiles that can be in game
     */

    final static public Integer AMOUNT_TILE_BEACH = 16;
    final static public Integer AMOUNT_TILE_FOREST = 16;
    final static public Integer AMOUNT_TILE_MOUNTAIN = 8;
    // Total Tiles = 40
    final static public Integer AMOUNT_TILE_TOTAL = AMOUNT_TILE_BEACH + AMOUNT_TILE_FOREST + AMOUNT_TILE_MOUNTAIN;
}
