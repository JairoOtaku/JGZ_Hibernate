package Facade;

import POJOS.*;
import javax.swing.table.DefaultTableModel;

public interface MainFacadeInterf {

    public void Insert_UpdateFAB(int CIF, String DomicilioSocial);

    public void DeleteFAB(int CIF);

    public DefaultTableModel TablaFabricantes();

    public void Insert_UpdateCOMP(int id, String nombre, String especificaciones);

    public void DeleteCOMP(int id);

    public DefaultTableModel TablaComponentes();

    public void Insert_UpdateELEC(int id, String name, String caracteristica, int apa);

    public void DeleteELEC(int id);

    public DefaultTableModel TablaElectrodomesticos();

    public void Insert_UpdateAPE(int codigo, Electrodomestico electrodomestico, String descripcion);

    public void DeleteAPE(int codigo);

    public DefaultTableModel TablaAparatos();
}
