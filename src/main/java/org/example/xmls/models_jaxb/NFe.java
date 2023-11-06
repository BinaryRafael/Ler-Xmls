package org.example.xmls.models_jaxb;

import jakarta.xml.bind.annotation.XmlElement;

public class NFe {

    private InfNFe infNFe;

    public InfNFe getInfNFe() {
        return infNFe;
    }

    @XmlElement(name = "infNFe")
    public void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
    }
}
