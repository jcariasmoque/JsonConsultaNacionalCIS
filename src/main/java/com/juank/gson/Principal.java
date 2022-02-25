package com.juank.gson;

import com.google.gson.Gson;
import com.juank.gson.Candidate;
import com.juank.gson.Consulta;

public class Principal {

	public static void main(String[] args) {

		Consulta consulta = new com.juank.gson.Consulta(105, 104.126, 103.891, "01:00:00", "2018-12-03", 62.586, 99.77f);
		
		consulta.addCandidate(new Candidate("1", "133", "GUSTAVO PETRO","MOVIMIENTO ALTERNATIVO INDÍGENA Y SOCIAL - MAIS - Y GSC \"COLOMBIA HUMANA\"", 2.849331, 84.69f));
		consulta.addCandidate(new Candidate("2", "13A", "CARLOS CAICEDO", "G.S.C. \"FUERZA CIUDADANA\"", 514.978, 15.30f));
		
		Gson gson = new Gson();
		String consultado = gson.toJson(consulta);
		
		System.out.println(consultado);

	}

}
