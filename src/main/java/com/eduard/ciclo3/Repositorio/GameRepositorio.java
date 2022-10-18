package com.eduard.ciclo3.Repositorio;


import java.util.List;
import java.util.Optional;

import com.eduard.ciclo3.Interface.GameInterface;
import com.eduard.ciclo3.Modelo.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class GameRepositorio {
    @Autowired
    private GameInterface gameInterface;
    
      public List<Game> getAll(){
        return (List<Game>) gameInterface.findAll();
    }

    public Optional<Game> getGame(int id){
        return gameInterface.findById(id);
    }

    public Game save(Game game){
        return gameInterface.save(game);
    }
    
     public void delete(Game game){
         gameInterface.delete(game);
    }
    
     
    
}
