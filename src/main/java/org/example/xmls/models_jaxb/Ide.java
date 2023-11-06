package org.example.xmls.models_jaxb;

import jakarta.xml.bind.annotation.XmlElement;

public class Ide {
    private String cUF;
    private String cNF;
    private String natOp;
    private String mod;
    private String serie;
    private String nNF;
    private String dhEmi;
    private String tpNF;
    private String idDest;

    public String getCUF() {
        return cUF;
    }

    @XmlElement(name = "cUF")
    public void setCUF(String cUF) {
        this.cUF = cUF;
    }

    @XmlElement(name = "cNF")
    public void setCNF(String cNF) {
        this.cNF = cNF;
    }

    @XmlElement(name = "natOp")
    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    @XmlElement(name = "mod")
    public void setMod(String mod) {
        this.mod = mod;
    }

    @XmlElement(name = "serie")
    public void setSerie(String serie) {
        this.serie = serie;
    }

    @XmlElement(name = "nNF")
    public void setNNF(String nNF) {
        this.nNF = nNF;
    }

    @XmlElement(name = "dhEmi")
    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    @XmlElement(name = "tpNF")
    public void setTpNF(String tpNF) {
        this.tpNF = tpNF;
    }

    @XmlElement(name = "idDest")
    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    // Inclua os demais atributos e métodos getters e setters aqui
}
