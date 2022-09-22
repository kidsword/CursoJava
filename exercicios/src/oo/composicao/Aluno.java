package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	final String Nome; //variáveis com a identificação final, apontam pra um endereço de memória
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.Nome = nome;
	}
	
	void addCurso(String nome) {
		this.addCurso(new Curso(nome));
	}
	
	void addCurso(Curso curso) {
		curso.alunos.add(this);
		this.cursos.add(curso);		
	}
	
}
