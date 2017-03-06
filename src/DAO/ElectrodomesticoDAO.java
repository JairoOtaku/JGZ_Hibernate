package DAO;

import POJOS.Electrodomestico;
import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class ElectrodomesticoDAO implements ElectrodomesticoDAOInterf {

    Electrodomestico elec;

    @Override
    public void Insert_UpdateELEC(int id, String name, String caracteristica, int apa) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        elec = new Electrodomestico();
        elec.setId(0);
        elec.setNombre(name);
        elec.setCaracteristica(caracteristica);
        //elec.setAparatoelectricos(apa);

        session.saveOrUpdate(elec); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void DeleteELEC(int id) {
        String c = "delete from ELECTRODOMESTICO where ID='" + id + "'";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel TablaElectrodomesticos() {
        DefaultTableModel tablita = new DefaultTableModel();
        Object[] fila = new Object[3];
        for (Electrodomestico as : selectAllElectrodomestico()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            tablita.addColumn("Id");
            tablita.addColumn("Nombre");
            tablita.addColumn("Caracteristicas");
            tablita.addColumn("Aparato Electrico");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = as.getId();
            fila[1] = as.getNombre();
            fila[1] = as.getCaracteristica();
            //fila[1] = as.getAparatoelectricos().getNombre().toString();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            tablita.addRow(fila);
        }
        return tablita;
    }

    @Override
    public ArrayList<Electrodomestico> selectAllElectrodomestico() {
        ArrayList<Electrodomestico> arrayelec = new ArrayList<>();

        String c = "select * from ELECTRODOMESTICO";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Electrodomestico elec = (Electrodomestico) iterador.next();
            arrayelec.add(elec);
        }
        session.close();
        return arrayelec;
    }
}
