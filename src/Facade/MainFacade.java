package Facade;

import DAO.*;
import POJOS.Fabricantes;
import Utiles.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MainFacade implements MainFacadeInterf {

    private AparatoElectricoDAOInterf APE = (AparatoElectricoDAO) MyFactory.getObject("APARATOELECTRICO");
    private ComponentesDAOInterf COMP = (ComponentesDAO) MyFactory.getObject("COMPONENTES");
    private ElectrodomesticoDAOInterf ELEC = (ElectrodomesticoDAO) MyFactory.getObject("ELECTRODOMESTICO");
    private FabricantesDAOInterf FAB = (FabricantesDAO) MyFactory.getObject("FABRICANTES");

    public void Insert_UpdateFAB(int CIF, String DomicilioSocial) {
        FAB.Insert_UpdateFAB(CIF, DomicilioSocial);
    }

    public void DeleteFAB(int CIF) {
        FAB.DeleteFAB(CIF);
    }

    public ArrayList<Fabricantes> selectAllFabricantes() {
        return FAB.selectAllFabricantes();
    }

    public DefaultTableModel TablaFabricantes() {
        return FAB.TablaFabricantes();
    }
}
