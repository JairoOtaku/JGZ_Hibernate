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

    private AparatoElectricoInterf APE = (AparatoElectrico) MyFactory.getObject("APARATOELCTRICO");
    private ComponentesInterf COMP = (Componentes) MyFactory.getObject("COMPONENTES");
    private ElectrodomesticoInterf ELEC = (Electrodomestico) MyFactory.getObject("ELECTRODOMESTICO");
    private ProveedoresInterf PROV = (Proveedores) MyFactory.getObject("PROVEEDORES");
}
