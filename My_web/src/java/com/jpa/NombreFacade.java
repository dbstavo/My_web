/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jpa;

import com.ent.Nombre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dokie
 */
@Stateless
public class NombreFacade extends AbstractFacade<Nombre> {
   @PersistenceContext(unitName = "My_webPU")
   private EntityManager em;

   @Override
   protected EntityManager getEntityManager() {
      return em;
   }

   public NombreFacade() {
      super(Nombre.class);
   }
   
}
