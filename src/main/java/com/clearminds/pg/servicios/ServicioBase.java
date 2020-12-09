package com.clearminds.pg.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.pg.bdd.ConexionBDD;
import com.clearminds.pg.excepciones.BDDExcepcion;

public class ServicioBase  {
	Connection conexion;
	public void abrirConexion() throws BDDExcepcion {
		conexion= ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion() {
		
		try {
			if(conexion!=null) {
				conexion.close();
				System.out.println("Conexion Cerrada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al cerrada la conexion");
		}
	}
	
	
	
}
