package DAO;

import POJOS.Fabricantes;
import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class FabricantesDAO implements FabricantesDAOInterf {

    Fabricantes fab;

    @Override
    public void Insert_UpdateFAB(int CIF, String DomicilioSocial) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        fab = new Fabricantes();
        fab.setCif(CIF);
        fab.setDomicilioSocial(DomicilioSocial);

        session.saveOrUpdate(fab); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void DeleteFAB(int CIF) {
        String c = "delete from Fabricante where CIF='" + CIF + "'";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel TablaFabricantes() {
        DefaultTableModel tablita = new DefaultTableModel();
        Object[] fila = new Object[2];
        for (Fabricantes as : selectAllFabricantes()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            tablita.addColumn("CIF");
            tablita.addColumn("Domicilio Social");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = as.getCif();
            fila[1] = as.getDomicilioSocial();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            tablita.addRow(fila);
        }
        return tablita;
    }

    @Override
    public ArrayList<Fabricantes> selectAllFabricantes() {
        ArrayList<Fabricantes> arrayfab = new ArrayList<>();

        String c = "select f from FABRICANTES f";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Fabricantes p = (Fabricantes) iterador.next();
            arrayfab.add(p);
        }
        session.close();
        return arrayfab;
    }

}
