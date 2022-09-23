package lambdas;

@FunctionalInterface
public interface Calculo {
	//interfaces funcionais podem ter apenas um método, com exceção apenas se outro método for 'default' ou 'static'
	double executar(double a, double b);
	default String legal() {
		return "legal";
	}
	static String muitoLegal() {
		return "muitoLegal";
	}
}
