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
public interface ComponentesDAOInterf {

    public void InsertCOMP();

    public void UpdateCOMP();

    public void DeleteCOMP();

    public DefaultTableModel TablaComponentes();
}
