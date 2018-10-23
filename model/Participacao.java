package br.ufpr.tads.musica.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Participacao implements Serializable {
    private int id;
    private String descricao;
    
    public Participacao() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participacao other = (Participacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
