package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosdetalhadoMedico(Long id,
String nome,
String Email,
String crm, 
String telefone,
Especialidade especialidade,
Endereco endereco) {
	public DadosdetalhadoMedico(Medico medico) {
		
		this(medico.getId(), medico.getNome(), medico.getEmail(),medico.getCrm(),medico.getTelefone(),
				medico.getEspecialidade(), medico.getEndereco());
		
	}

}
