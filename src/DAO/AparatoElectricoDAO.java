package DAO;

import POJOS.Aparatoelectrico;
import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class AparatoElectricoDAO implements AparatoElectricoDAOInterf {

    Aparatoelectrico ape;

    @Override
    public void Insert_UpdateAPE() {

    }

    @Override
    public void DeleteAPE() {
    }

    @Override
    public DefaultTableModel TablaAparatos() {
        DefaultTableModel tablita = new DefaultTableModel();
        return tablita;
    }
}
