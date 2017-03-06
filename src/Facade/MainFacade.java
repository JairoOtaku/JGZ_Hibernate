package Facade;

import DAO.*;
import POJOS.Aparatoelectrico;
import POJOS.Componentes;
import POJOS.Electrodomestico;
import POJOS.Fabricantes;
import Utiles.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MainFacade implements MainFacadeInterf {

    private AparatoElectricoDAOInterf APE = (AparatoElectricoDAO) MyFactory.getObject("APARATOELECTRICO");
    private ComponentesDAOInterf COMP = (ComponentesDAO) MyFactory.getObject("COMPONENTES");
    private ElectrodomesticoDAOInterf ELEC = (ElectrodomesticoDAO) MyFactory.getObject("ELECTRODOMESTICO");
    private FabricantesDAOInterf FAB = (FabricantesDAO) MyFactory.getObject("FABRICANTES");

    @Override
    public void Insert_UpdateFAB(int CIF, String DomicilioSocial) {
        FAB.Insert_UpdateFAB(CIF, DomicilioSocial);
    }

    @Override
    public void DeleteFAB(int CIF) {
        FAB.DeleteFAB(CIF);
    }

    @Override
    public DefaultTableModel TablaFabricantes() {
        return FAB.TablaFabricantes();
    }

    @Override
    public void Insert_UpdateCOMP(int id, String nombre, String especificaciones) {
        COMP.Insert_UpdateCOMP(id, nombre, especificaciones);
    }

    @Override
    public void DeleteCOMP(int id) {
        COMP.DeleteCOMP(id);
    }

    @Override
    public DefaultTableModel TablaComponentes() {
        return COMP.TablaComponentes();
    }

    @Override
    public void Insert_UpdateELEC(int id, String name, String caracteristica, int apa) {
        ELEC.Insert_UpdateELEC(id, name, caracteristica, apa);
    }

    @Override
    public void DeleteELEC(int id) {
        ELEC.DeleteELEC(id);
    }

    @Override
    public DefaultTableModel TablaElectrodomesticos() {
        return ELEC.TablaElectrodomesticos();
    }

    @Override
    public void Insert_UpdateAPE(int codigo, Electrodomestico electrodomestico, String descripcion) {
        APE.Insert_UpdateAPE(codigo, electrodomestico, descripcion);
    }

    @Override
    public void DeleteAPE(int codigo) {
        APE.DeleteAPE(codigo);
    }

    @Override
    public DefaultTableModel TablaAparatos() {
        return APE.TablaAparatos();
    }

}
