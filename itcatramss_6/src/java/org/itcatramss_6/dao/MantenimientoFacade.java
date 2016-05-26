/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itcatramss_6.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.itcatramss_6.entidades.Mantenimiento;

/**
 *
 * @author lel
 */
@Stateless
public class MantenimientoFacade extends AbstractFacade<Mantenimiento> {

    @PersistenceContext(unitName = "itcatramss_6PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MantenimientoFacade() {
        super(Mantenimiento.class);
    }
    
}
