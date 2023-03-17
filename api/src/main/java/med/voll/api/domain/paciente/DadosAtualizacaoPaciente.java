package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import med.voll.api.domain.endereco.DadosAtualizacaoEndereco;

public record DadosAtualizacaoPaciente(
	    Long id,
	    String nome,
	    String telefone,
	    @Valid DadosAtualizacaoEndereco endereco
	) {
	}
