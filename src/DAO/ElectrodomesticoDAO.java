/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Electrodomestico;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ElectrodomesticoDAO implements ElectrodomesticoDAOInterf {

    Electrodomestico elec;

    @Override
    public void InsertELEC() {

    }

    @Override
    public void UpdateELEC() {

    }

    @Override
    public void DeleteELEC() {
    }

    @Override
    public DefaultTableModel TablaElectrodomesticos() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
