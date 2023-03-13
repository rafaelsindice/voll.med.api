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
public Endereco(DadosEndereco dados) {
	this.logradouro=dados.logradouro();
	this.bairro=dados.bairro();
	this.cep=dados.cep();
	this.cidade=dados.cidade();
	this.uf=dados.uf();
	this.numero=dados.numero();
	this.complemento=dados.complemento();
}
private String logradouro;
private String bairro;
private String cep;
private String numero;
private String complemento;
private String cidade;
private String uf;
}
