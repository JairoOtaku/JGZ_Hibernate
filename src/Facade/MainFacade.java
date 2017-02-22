package Facade;

import DAO.*;
import Utiles.MyFactory;

public class MainFacade implements MainFacadeInterf {

    private AparatoElectricoDAOInterf APE = (AparatoElectricoDAO) MyFactory.getObject("APARATOELCTRICO");
    private ComponentesDAOInterf COMP = (ComponentesDAO) MyFactory.getObject("COMPONENTES");
    private ElectrodomesticoDAOInterf ELEC = (ElectrodomesticoDAO) MyFactory.getObject("ELECTRODOMESTICO");
    private FabricantesDAOInterf FAB = (FabricantesDAO) MyFactory.getObject("FABRICANTES");
}
