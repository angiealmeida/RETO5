/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto5_Web.repositorio;

import Reto5_Web.modelo.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto5_Web.interfaces.InterfaceChocolate;

/**
 *
 * @author Angie Almeida
 */
@Repository
public class ChocolateRepositorio {

    @Autowired
    private InterfaceChocolate repository;

    /**
     * Lista chocolate
     * @return 
     */
    public List<Chocolate> getAll() {
        return repository.findAll();
    }

    /**
     * Optional
     * @param reference
     * @return 
     */
    public Optional<Chocolate> getClothe(String reference) {
        return repository.findById(reference);
    }

    /**
     * Crear
     * @param chocolate
     * @return 
     */
    public Chocolate create(Chocolate chocolate) {
        return repository.save(chocolate);
    }

    /**
     * Actualizar
     * @param chocolate 
     */
    public void update(Chocolate chocolate) {
        repository.save(chocolate);
    }

    /**
     * Eliminar
     * @param chocolate 
     */
    public void delete(Chocolate chocolate) {
        repository.delete(chocolate);
    }
    //Reto 5

    /**
     * Lista chocolate, precio
     * @param precio
     * @return 
     */
    public List<Chocolate> gadgetsByPrice(double precio) {
        return repository.findByPriceLessThanEqual(precio);
    }

    //Reto 5
    /**
     * Lista chocolate, descripción
     * @param description
     * @return 
     */
    public List<Chocolate> findByDescriptionLike(String description) {
        return repository.findByDescriptionLike(description);
    }
}
