package br.ufpr.tads.musica.model;

/**
 *
 * @author user
 */
public class PessoaParticipacao {
    private Integer pessoaId;
    private Integer participacaoId;
    
    public PessoaParticipacao() {
    }
    
    public PessoaParticipacao(Integer pessoa, Integer participacao) {
        this.pessoaId = pessoa;
        this.participacaoId = participacao;
    }
}
