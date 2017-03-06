package DAO;

import POJOS.Aparatoelectrico;
import POJOS.Electrodomestico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public interface AparatoElectricoDAOInterf {

    public void Insert_UpdateAPE(int codigo, Electrodomestico electrodomestico, String descripcion);

    public void DeleteAPE(int codigo);

    public DefaultTableModel TablaAparatos();

    public ArrayList<Aparatoelectrico> selectAllAparatos();
}
