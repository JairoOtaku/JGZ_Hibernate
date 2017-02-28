
package DAO;

import POJOS.Componentes;import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class ComponentesDAO implements ComponentesDAOInterf {

    Componentes comp;

    @Override
    public void Insert_UpdateCOMP() {

    }


    @Override
    public void DeleteCOMP() {
    }

    @Override
    public DefaultTableModel TablaComponentes() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
