package com.jesper.lobbymanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Worlds {
    private String lobby;
    private List<String> playground = new ArrayList<>();
    private Map<String,WorldType> actief = new HashMap<>();

    public Worlds (String lobby,List<String> playground){
        this.lobby = lobby;
        this.playground = playground;

    }
}
