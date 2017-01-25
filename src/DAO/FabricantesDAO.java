/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Fabricantes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FabricantesDAO implements FabricantesDAOInterf {

    Fabricantes fab;

    @Override
    public void InsertFAB() {

    }

    @Override
    public void UpdateFAB() {

    }

    @Override
    public void DeleteFAB() {
    }

    @Override
    public DefaultTableModel TablaFabricantes() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
