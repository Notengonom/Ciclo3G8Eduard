package com.eduard.ciclo3.Interface;

import com.eduard.ciclo3.Modelo.Game;
import org.springframework.data.repository.CrudRepository;


public interface GameInterface extends CrudRepository <Game, Integer> {
    
}
