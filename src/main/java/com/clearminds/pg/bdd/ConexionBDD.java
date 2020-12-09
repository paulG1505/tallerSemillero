package com.clearminds.pg.bdd;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import com.clearminds.pg.excepciones.BDDExcepcion;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) {
		try {
			FileReader reader = new FileReader("conexion.properties");
			Properties p = new Properties();
			p.load(reader);
			String res= (p.getProperty(propiedad));
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public static Connection obtenerConexion() throws BDDExcepcion{

		try {
			FileReader reader = new FileReader("conexion.properties");
			Properties p = new Properties();
			p.load(reader);
			String usuario= (p.getProperty("usuario"));
			String password= (p.getProperty("password"));
			String url=(p.getProperty("urlConexion"));
			return DriverManager.getConnection(url+"user="+usuario+";"+"password="+password+";");	
		}catch (Exception e) {
			e.printStackTrace();
			throw new BDDExcepcion("no se puede conectar a la base de datos");
		}
	}
	
}
