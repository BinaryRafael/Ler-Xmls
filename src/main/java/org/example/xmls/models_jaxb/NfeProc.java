package org.example.xmls.models_jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
public class NfeProc {

    private NFe NFe;

    public NFe getNFe() {
        return NFe;
    }

    @XmlElement(name = "NFe")
    public void setNFe(NFe NFe) {
        this.NFe = NFe;
    }
}
