package br.ufpr.tads.musica.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Faixa implements Serializable {
    private int albumId;
    private int ordem;
    private Musica musica;
    private Genero genero;
    private int duracao;
    
    public Faixa() {
    }
    
    public Faixa(int ordem, Musica musica, Genero genero, int duracao) {
        this.ordem = ordem;
        this.musica = musica;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.albumId;
        hash = 29 * hash + this.ordem;
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
        final Faixa other = (Faixa) obj;
        if (this.albumId != other.albumId) {
            return false;
        }
        if (this.ordem != other.ordem) {
            return false;
        }
        if(!this.musica.equals(other.musica) ) {
            return false;
        }
        return true;
    }

    /**
     * @return the albumId
     */
    public int getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId the albumId to set
     */
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    /**
     * @return the ordem
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * @param ordem the ordem to set
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
    
}
