
package DAO;

import POJOS.Electrodomestico;
import javax.swing.table.DefaultTableModel;


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
