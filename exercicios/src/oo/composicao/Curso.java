package oo.composicao;

import java.util.ArrayList;

public class Curso {
	final String Nome; //variáveis com a identificação final, apontam pra um endereço de memória
	final ArrayList<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.Nome = nome;
	}
	
	void addAluno(String nome) {
		this.addAluno(new Aluno(nome));
	}
	
	void addAluno(Aluno aluno) {
		aluno.cursos.add(this);
		this.alunos.add(aluno);		
	}
	
}
