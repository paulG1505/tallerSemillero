package com.clearminds.pg.bdd.test;

import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;
import com.clearminds.pg.servicios.ServicioEstudiante;

public class TetsActualizarEstudiante {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvEstudiante= new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Juanito!!", "Mendoza",3 ))
			;
		} catch (BDDExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		
	}
}
