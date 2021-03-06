package com.mozaicworks.tictactoe;


public class Player {

    private final String name;
    private Player(String name){

        this.name = name;
    }

    public static Player X() {
        return new Player("X");
    }

    public static Player O() {
        return new Player("0");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (name != null ? !name.equals(player.name) : player.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
