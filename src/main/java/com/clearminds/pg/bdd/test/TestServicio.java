package com.clearminds.pg.bdd.test;

import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;
import com.clearminds.pg.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvEstudiante= new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Juan", "Perez"))
			;
		} catch (BDDExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
