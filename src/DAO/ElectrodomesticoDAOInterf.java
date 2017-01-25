/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public interface ElectrodomesticoDAOInterf {

    public void InsertELEC();

    public void UpdateELEC();

    public void DeleteELEC();

    public DefaultTableModel TablaElectrodomesticos();
}
