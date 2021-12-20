/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto5_Web.interfaces;

import Reto5_Web.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Angie Almeida
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {

    
    /**
     * Retorna las ordenes de pedido que coincidad con la zona recibida como parametro
     * @param zone
     * @return 
     */
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

    
    /**
     * Retorna las ordenes por estado
     * @param status
     * @return 
     */
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);

    
    /**
     * Para seleccionar la orden con el id maximo
     * @return 
     */
    Optional<Order> findTopByOrderByIdDesc();

}
