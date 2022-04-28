package Questao3;

public class Cadastro {
	
	String item, autor, descricao, data, local;	


	public Cadastro(String item, String autor, String descricao, String data, String local) {
		
		this.item = item;
		this.autor = autor;
		this.descricao = descricao;
		this.data = data;
		this.local = local;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	

	public String getLocal() {
		return data;
	}

	public void setLocal(String data) {
		this.data = data;
	}
	
}
