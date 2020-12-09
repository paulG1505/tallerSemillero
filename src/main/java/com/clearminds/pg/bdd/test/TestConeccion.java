package com.clearminds.pg.bdd.test;

import java.sql.*;

import com.clearminds.pg.bdd.ConexionBDD;
import com.clearminds.pg.excepciones.BDDExcepcion;

public class TestConeccion {

	public static void main(String[] args) {
		try {
			Connection conexion= ConexionBDD.obtenerConexion();
			if(conexion!=null) {
				System.out.println("Conexion exitosa");
			}
		} catch (BDDExcepcion e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
