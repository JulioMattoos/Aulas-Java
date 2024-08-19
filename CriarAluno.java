Expackage AulaAgrVai;

public class Principal {
	
	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		Estudante estudante3 = new Estudante();
		
		
		
		estudante1.nomeEstudante = "Julio";
		estudante1.nomeCursoMatriculado ="Engenharia de Software";
		estudante1.idadeEstudante = 20;
		
		
		estudante2.nomeEstudante = "Paulinho";
		estudante2.nomeCursoMatriculado ="Educacao Fisica";
		estudante2.idadeEstudante = 39;
		
		
		estudante3.nomeEstudante = "Zezin";
		estudante3.nomeCursoMatriculado ="Engenharia de Software";
		estudante3.idadeEstudante = 38;
		
	
		
		System.out.println("Estudante 1" + estudante1);
		System.out.println("Estudante 2" + estudante2);
		System.out.println("Estudante 3" + estudante3);
		
		
	}

}
