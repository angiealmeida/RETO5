/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_Web.interfaces;

import Reto5_Web.modelo.Chocolate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Angie Almeida
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {

    /**
     * Lista chocolate
     * @param precio
     * @return 
     */
    public List<Chocolate> findByPriceLessThanEqual(double precio);

    //Reto 5
    /**
     * Query
     * @param description
     * @return 
     */
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Chocolate> findByDescriptionLike(String description);
}
