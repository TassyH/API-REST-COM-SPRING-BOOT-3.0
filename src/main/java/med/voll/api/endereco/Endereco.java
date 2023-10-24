package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	
	private String cep;
	private String logradouro;
	private String cidade;
	private String bairro;
	private String numero;
	private String complemento;
	private String uf;
	
	public Endereco(DadosEndereco dados) {
		this.cep = dados.cep();
		this.cidade = dados.cidade();
		this.bairro = dados.bairro();
		this.uf = dados.uf();
		this.logradouro = dados.logradouro();
		this.complemento = dados.complemento();
		this.numero = dados.numero();
		
		
	}

	public void atualizarEndereco(DadosEndereco dados) {

		if(dados.cep() != null) {
			this.cep = dados.cep();
		}
		if(dados.logradouro() != null) {
			this.logradouro = dados.logradouro();
		}
		if(dados.cidade() != null) {
			this.cidade = dados.cidade();
		}
		if(dados.bairro() != null) {
			this.bairro = dados.bairro();
		}
		if(dados.uf() != null) {
			this.uf = dados.uf();
		}
		if(dados.complemento() != null) {
			this.complemento = dados.complemento();
		}
		if(dados.numero() != null) {
			this.complemento = dados.numero();
		}
		
	}

}
