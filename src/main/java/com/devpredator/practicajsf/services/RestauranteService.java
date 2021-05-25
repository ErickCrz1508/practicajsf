/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author Erick Michel Cruz Ceron
 *Clase service que permite realizar logica de negocio para restaurantes. 
 */
public class RestauranteService {
	
	/**
	 * Metodo que permite consultar una lista de restaurantes.
	 * @return lista de restaurantes
	 */
	public List<Restaurante> consultarRestaurantes(){
		
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		Restaurante rest3 = new Restaurante();
		Restaurante rest4 = new Restaurante();
		Restaurante rest5 = new Restaurante();
		
		rest1.setNombre("McDonalds");
		rest1.setDireccion("Dirección 1.");
		rest1.setPais("Estados Unidos.");
		Gerente gerente1 = new Gerente();
		gerente1.setNombre("Armando");
		gerente1.setPrimerApellido("Cruz");
		gerente1.setSegundoApellido("Muñoz");
		rest1.setGerente(gerente1);
		
		rest2.setNombre("La vid Argentina");
		rest2.setDireccion("Dirección 2.");
		rest2.setPais("Argentina.");
		Gerente gerente2 = new Gerente();
		gerente2.setNombre("José Armando");
		gerente2.setPrimerApellido("Cruz");
		gerente2.setSegundoApellido("Ceron");
		rest2.setGerente(gerente2);
		
		rest3.setNombre("La Chilaca.");
		rest3.setDireccion("Dirección 3.");
		rest3.setPais("Chile.");
		Gerente gerente3 = new Gerente();
		gerente3.setNombre("Montserrat");
		gerente3.setPrimerApellido("Cruz");
		gerente3.setSegundoApellido("Ceron");
		rest3.setGerente(gerente3);
		
		rest4.setNombre("Cienaga.");
		rest4.setDireccion("Dirección 4.");
		rest4.setPais("Colombia.");
		Gerente gerente4 = new Gerente();
		gerente4.setNombre("Erick Michel");
		gerente4.setPrimerApellido("Cruz");
		gerente4.setSegundoApellido("Ceron");
		rest4.setGerente(gerente4);
		
		rest5.setNombre("Socarrat.");
		rest5.setDireccion("Dirección 5.");
		rest5.setPais("España.");
		Gerente gerente5 = new Gerente();
		gerente5.setNombre("Soledad");
		gerente5.setPrimerApellido("Ceron");
		gerente5.setSegundoApellido("Espinosa");
		rest5.setGerente(gerente5);
		
		restaurantes.add(rest1);
		restaurantes.add(rest2);
		restaurantes.add(rest3);
		restaurantes.add(rest4);
		restaurantes.add(rest5);
		
		return restaurantes;
	}
	

	
	

}
