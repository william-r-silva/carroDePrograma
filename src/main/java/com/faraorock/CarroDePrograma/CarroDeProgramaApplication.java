package com.faraorock.CarroDePrograma;

import com.faraorock.CarroDePrograma.Persistencia.FilialRepository;
import com.faraorock.CarroDePrograma.Persistencia.MecanicaParceiraRepository;
import com.faraorock.CarroDePrograma.Persistencia.CarroRepository;
import com.faraorock.CarroDePrograma.Persistencia.ContratanteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarroDeProgramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroDeProgramaApplication.class, args);
	}
	
	@Bean
	public ContratanteRepository run(ContratanteRepository cr) {
		
		return cr;
	}
	
	@Bean
	public FilialRepository run2(FilialRepository fr) {
		
		return fr;
	}

	@Bean
	public CarroRepository run3(CarroRepository car) {
		
		return car;
	}
	
	@Bean
	public MecanicaParceiraRepository run4(MecanicaParceiraRepository mpr) {
		
		return mpr;
	}
}
