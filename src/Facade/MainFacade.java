/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import DAO.*;
import Utiles.MyFactory;

/**
 *
 * @author Usuario
 */
public class MainFacade implements MainFacadeInterf {

    private AparatoElectricoDAOInterf APE = (AparatoElectricoDAO) MyFactory.getObject("APARATOELCTRICO");
    private ComponentesDAOInterf COMP = (ComponentesDAO) MyFactory.getObject("COMPONENTES");
    private ElectrodomesticoDAOInterf ELEC = (ElectrodomesticoDAO) MyFactory.getObject("ELECTRODOMESTICO");
    private FabricantesDAOInterf PROV = (FabricantesDAO) MyFactory.getObject("PROVEEDORES");
}
