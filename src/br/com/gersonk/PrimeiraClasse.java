/**
 * @author gerson.keven
 */
package br.com.gersonk;

/**
 * 
 */
public class PrimeiraClasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Olá Gerson");
		
		Paciente paciente = new Paciente();
		
		paciente.setCodigo(1);
		System.out.println(paciente.getCodigo());
		paciente.setNome("Joãozinho");
		System.out.println(paciente.getNome());
		paciente.setEndereco("Rua teste");
		System.out.println(paciente.getEndereco());
		paciente.setTelefone(88121458);
		System.out.println(paciente.getTelefone());
	
		
		// Foi criado um objeto e desenvolvido algumas variáveis para ser exibido
		// Também adicionei comentários em Javadoc em cada variável da classe Paciente.

	}

}
