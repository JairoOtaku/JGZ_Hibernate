package DAO;

import POJOS.Fabricantes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public interface FabricantesDAOInterf {

    public void Insert_UpdateFAB(int CIF, String DomicilioSocial);

    public void DeleteFAB(int CIF);

    public ArrayList<Fabricantes> selectAllFabricantes();

    public DefaultTableModel TablaFabricantes();
}
