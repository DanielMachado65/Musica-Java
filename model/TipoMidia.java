package br.ufpr.tads.musica.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class TipoMidia implements Serializable {
    private int id;
    private String midia;
    
    public TipoMidia() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
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
        final TipoMidia other = (TipoMidia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }
    
    
    
    
}
