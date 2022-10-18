package com.eduard.ciclo3.Interface;

import com.eduard.ciclo3.Modelo.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}
