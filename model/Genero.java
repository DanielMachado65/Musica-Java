package br.ufpr.tads.musica.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Genero implements Serializable {
    private int id;
    private String nome;
    
    public Genero() {
        id = -1;
        nome = null;
    }
    
    public Genero(int id) {
        this.id = id;
        nome = null;
    }
    
    public Genero(String nome) {
        this.id = -1;
        this.nome = nome;
    }
    
    public Genero(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
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
        final Genero other = (Genero) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
