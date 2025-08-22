package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }



    public Game getGame() {
        return this.game;
    }

    public GameList getGameList() {
        return this.gameList;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public int hashCode() {
        return 31 * (game != null ? game.hashCode() : 0) + (gameList != null ? gameList.hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
         if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BelongingPK other = (BelongingPK) obj;
        return (game != null ? game.equals(other.game) : other.game == null) &&
               (gameList != null ? gameList.equals(other.gameList) : other.gameList == null);
    }


}
