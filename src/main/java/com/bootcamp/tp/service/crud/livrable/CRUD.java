/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.tp.service.crud.livrable;

import com.bootcamp.tp.constantes.AppConstants;
import com.bootcamp.tp.dao.LivrableRepository;
import com.bootcamp.tp.entities.Livrable;

/**
 *
 * @author ARESKO
 */
public class CRUD implements AppConstants {
    
    public static void Create(Livrable livrable){
        LivrableRepository lr = new LivrableRepository(persistanceUnit);
        
    }
}
