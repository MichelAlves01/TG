package delivery.service.DELIVERY_MODELO;

import java.util.List;

public class UsuarioMob {
	
	private String email;
	private String nome;
	private List<Pedido> pedidos;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
}
