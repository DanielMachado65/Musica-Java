package br.ufpr.tads.musica.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Album implements Serializable {
    private int id;
    private String titulo;
    private Genero genero;
    private java.util.Date dataLancamento;
    private TipoMidia tipoMidia;
    private long tempoTotal;
    
    public Album() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final Album other = (Album) obj;
        if (this.id != other.id) {
            return false;
        }
        if( !this.titulo.equals(other.titulo) ) {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the dataLancamento
     */
    public java.util.Date getDataLancamento() {
        return dataLancamento;
    }

    /**
     * @param dataLancamento the dataLancamento to set
     */
    public void setDataLancamento(java.util.Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    /**
     * @return the tipoMidia
     */
    public TipoMidia getTipoMidia() {
        return tipoMidia;
    }

    /**
     * @param tipoMidia the tipoMidia to set
     */
    public void setTipoMidia(TipoMidia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    /**
     * @return the tempoTotal
     */
    public long getTempoTotal() {
        return tempoTotal;
    }

    /**
     * @param tempoTotal the tempoTotal to set
     */
    public void setTempoTotal(long tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
    
    
    
}
