/**
 * @author gerson.keven
 */
package br.com.gersonk;

public class Paciente {
	
	private int codigo;
    private String nome;
    private String endereco;
    private long telefone;
    
    /**
     * @author gerson.keven
     * @since version 1
     * @see <a href="https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703" target=top>http://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703</a>
     */
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	 /**
     * @author gerson.keven
     * @since version 1
     * @see <a href="https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703" target=top>http://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703</a>
     */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 /**
     * @author gerson.keven
     * @since version 1
     * @see <a href="https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703" target=top>http://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703</a>
     */
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	 /**
     * @author gerson.keven
     * @since version 1
     * @see <a href="https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703" target=top>http://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703</a>
     */
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
    
}
