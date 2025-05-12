package es.curso.spring08;

public class Direccion {
    private TipoVia tipoVia;
    private String nombreVia;
    private String codigoPostal;
    private String numero;

    public TipoVia getTipoVia() { 
    	return tipoVia; 
    }
    public void setTipoVia(TipoVia tipoVia) { 
    	this.tipoVia = tipoVia; 
    }

    public String getNombreVia() { 
    	return nombreVia; 
    }
    public void setNombreVia(String nombreVia) { 
    	this.nombreVia = nombreVia; 
    }

    public String getCodigoPostal() { 
    	return codigoPostal; 
    }
    public void setCodigoPostal(String codigoPostal) { 
    	this.codigoPostal = codigoPostal; 
    }

    public String getNumero() { 
    	return numero; 
    }
    public void setNumero(String numero) { 
    	this.numero = numero; 
    }
}
