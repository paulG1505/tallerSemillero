package com.clearminds.pg.servicios;

import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;

public class ServicioEstudiante  extends ServicioBase{
	public void insertarEstudiante(Estudiante estudiante) throws BDDExcepcion {
		ServicioBase ser= new ServicioBase();
		ser.abrirConexion();
		System.out.println("Insertando estudiante:"+ estudiante.toString());
		ser.cerrarConexion();
	}
}
