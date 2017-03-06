package DAO;

import POJOS.Aparatoelectrico;
import POJOS.Electrodomestico;
import Utiles.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.*;

public class AparatoElectricoDAO implements AparatoElectricoDAOInterf {

    Aparatoelectrico ape;

    @Override
    public void Insert_UpdateAPE(int codigo, Electrodomestico electrodomestico, String descripcion) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        ape = new Aparatoelectrico();
        ape.setCodigo(codigo);
        ape.setDescripcion(descripcion);
        ape.setElectrodomestico(electrodomestico);

        session.saveOrUpdate(ape); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void DeleteAPE(int codigo) {
        String c = "delete from APARATOELECTRICO where codigo='" + codigo + "'";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel TablaAparatos() {
        DefaultTableModel tablita = new DefaultTableModel();

        Object[] fila = new Object[3];
        for (Aparatoelectrico arrayape : selectAllAparatos()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            tablita.addColumn("Codigo");
            tablita.addColumn("Descripcion");
            tablita.addColumn("Electrodomestico");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = arrayape.getCodigo();
            fila[1] = arrayape.getDescripcion();
            fila[2] = arrayape.getElectrodomestico();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            tablita.addRow(fila);
        }

        return tablita;
    }

    @Override
    public ArrayList<Aparatoelectrico> selectAllAparatos() {
        ArrayList<Aparatoelectrico> arrayape = new ArrayList<>();

        String c = "select ape from APARATOELECTRICO ape";
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Aparatoelectrico ape = (Aparatoelectrico) iterador.next();
            arrayape.add(ape);
        }
        session.close();
        return arrayape;
    }

}
