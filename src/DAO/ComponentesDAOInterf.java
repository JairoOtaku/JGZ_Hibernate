package DAO;

import POJOS.Componentes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public interface ComponentesDAOInterf {

    public void Insert_UpdateCOMP(int id, String nombre, String especificaciones);

    public void DeleteCOMP(int id);

    public DefaultTableModel TablaComponentes();

    public ArrayList<Componentes> selectAllComponentes();
}
