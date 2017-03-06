package DAO;

import POJOS.Componentes;
import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class ComponentesDAO implements ComponentesDAOInterf {

    Componentes comp;

    @Override
    public void Insert_UpdateCOMP(int id, String nombre, String especificaciones) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        comp = new Componentes();
        comp.setId(id);
        comp.setNombre(nombre);
        comp.setEspecificaciones(especificaciones);

        session.saveOrUpdate(comp); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void DeleteCOMP(int id) {
        String c = "delete from COMPONENTES where id='" + id + "'";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel TablaComponentes() {
        DefaultTableModel tablita = new DefaultTableModel();

        Object[] fila = new Object[3];
        for (Componentes comp : selectAllComponentes()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            tablita.addColumn("ID");
            tablita.addColumn("Nombre");
            tablita.addColumn("Especificaciones");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = comp.getId();
            fila[1] = comp.getNombre();
            fila[2] = comp.getEspecificaciones();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            tablita.addRow(fila);
        }

        return tablita;
    }

    @Override
    public ArrayList<Componentes> selectAllComponentes() {
        ArrayList<Componentes> arraycom = new ArrayList<>();

        String c = "select c from COMPONENTES c";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Componentes p = (Componentes) iterador.next();
            arraycom.add(p);
        }
        session.close();
        return arraycom;
    }
}
