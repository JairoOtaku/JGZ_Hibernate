/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Aparatoelectrico;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AparatoElectricoDAO implements AparatoElectricoDAOInterf {

    Aparatoelectrico ape;

    @Override
    public void InsertAPE() {

    }

    @Override
    public void UpdateAPE() {

    }

    @Override
    public void DeleteAPE() {
    }

    @Override
    public DefaultTableModel TablaAparatos() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
