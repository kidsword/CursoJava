package desafios.secao9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8, enSexo.feminino, 39);
		Aluno a2 = new Aluno("Bia", 5.8, enSexo.feminino, 29);
		Aluno a3 = new Aluno("Daniel", 9.8, enSexo.masculino, 46);
		Aluno a4 = new Aluno("Renata", 10.0, enSexo.feminino, 34);
		Aluno a5 = new Aluno("Gui", 6.8, enSexo.masculino, 20);
		Aluno a6 = new Aluno("Rebeca", 7.1, enSexo.feminino, 31);
		Aluno a7 = new Aluno("Pedro", 8.8, enSexo.masculino, 27);
		Aluno a8 = new Aluno("Laura", 5.8, enSexo.feminino, 17);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> masculinos = a -> a.sexo == enSexo.masculino;
		Predicate<Aluno> femininos = a -> a.sexo == enSexo.feminino;
		Predicate<Aluno> maiores = a -> a.idade >= 21;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

		alunos.stream()
		.filter(aprovados)		
		.filter(femininos)
		.filter(maiores)
		.map(saudacaoAprovado)
		.forEach(System.out::println);

	}

}
