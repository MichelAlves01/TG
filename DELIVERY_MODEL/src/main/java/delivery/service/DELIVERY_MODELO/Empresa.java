package delivery.service.DELIVERY_MODELO;

import java.util.List;

public class Empresa {
	
	private int cpfCnpj;
	private String nome;
	private String endereco;
	private Cidade cidade;
	private int telefoneFixo;
	private int telefoneMovel;
	private int cep;
	private String email;
	private double raio;
	private int usaAgenda;
	private double latitude;
	private double longitude;
	private double avaliacao;
	private List<Produto> produto;
	private List<Users> users;
	
	public int getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(int cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public int getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(int telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public int getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(int telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public int getUsaAgenda() {
		return usaAgenda;
	}
	public void setUsaAgenda(int usaAgenda) {
		this.usaAgenda = usaAgenda;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	
}
