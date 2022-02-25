package com.juank.json;

public class Test {

	public static void main(String[] args) {

		Consulta consulta = new Consulta(105, 104126, 103891, "01:00:00", "2018-12-03", 62586, 99.77f);

		consulta.addCandidate(new Candidate("1", "133", "GUSTAVO PETRO","MOVIMIENTO ALTERNATIVO INDÍGENA Y SOCIAL - MAIS - Y GSC \"COLOMBIA HUMANA\"", 2849331, 84.69f));
		consulta.addCandidate(new Candidate("2", "13A", "CARLOS CAICEDO", "G.S.C. \"FUERZA CIUDADANA\"", 514978, 15.30f));

		String jsonConsulta = consulta.toJson();

		System.out.println(jsonConsulta);

	}

}
