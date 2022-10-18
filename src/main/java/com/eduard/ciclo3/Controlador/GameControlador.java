package com.eduard.ciclo3.Controlador;

import java.util.List;
import java.util.Optional;

import com.eduard.ciclo3.Modelo.Game;
import com.eduard.ciclo3.Servicio.GameServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Game")
@CrossOrigin(origins = "*")

public class GameControlador {
     @Autowired
    private GameServicio gameservice;
    @GetMapping("/all")
    public List<Game> getGames(){
        return gameservice.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Game> getGame(@PathVariable("id") int gameId) {
        return gameservice.getGame(gameId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Game save(@RequestBody Game game) {
        return gameservice.save(game);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Game update(@RequestBody Game game) {
        return gameservice.update(game);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return gameservice.deleteGame(id);
    }
    
  
}
