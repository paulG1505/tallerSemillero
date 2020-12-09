package com.clearminds.pg.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.pg.bdd.ConexionBDD;
import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;

public class ServicioEstudiante extends ServicioBase {
	public void insertarEstudiante(Estudiante estudiante) throws BDDExcepcion {
		abrirConexion();
		System.out.println("Insertando estudiante:" + estudiante);
		Statement stmt = null;
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if (conexion != null) {
				System.out.println("Conexion exitosa");
			}
		} catch (BDDExcepcion e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			stmt = conexion.createStatement();
			String sql = "INSERT INTO estudiantes (nombre, apelido) values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "')";
			System.out.println("Inserted records into the table...");
			System.out.println("Script:"+sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
