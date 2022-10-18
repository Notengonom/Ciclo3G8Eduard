package com.eduard.ciclo3.Interface;

import com.eduard.ciclo3.Modelo.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


public interface ReservationInterface extends CrudRepository <Reservation, Integer> {

    public List<Reservation> findAllByStatus (String status);

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore (Date datoUno, Date datoDos);

    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();
    
}
