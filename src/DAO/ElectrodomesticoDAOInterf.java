package DAO;

import POJOS.Electrodomestico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public interface ElectrodomesticoDAOInterf {

    public void Insert_UpdateELEC(int id, String name, String caracteristica, int apa) ;

    public void DeleteELEC(int id);

    public DefaultTableModel TablaElectrodomesticos();

    public ArrayList<Electrodomestico> selectAllElectrodomestico();
}
