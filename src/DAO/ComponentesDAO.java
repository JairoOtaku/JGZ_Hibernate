/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Componentes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ComponentesDAO implements ComponentesDAOInterf {

    Componentes comp;

    @Override
    public void InsertCOMP() {

    }

    @Override
    public void UpdateCOMP() {

    }

    @Override
    public void DeleteCOMP() {
    }

    @Override
    public DefaultTableModel TablaComponentes() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
