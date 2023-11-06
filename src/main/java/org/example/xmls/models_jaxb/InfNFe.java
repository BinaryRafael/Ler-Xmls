package org.example.xmls.models_jaxb;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class InfNFe {
    private String Id;
    private Ide ide;

    public String getId() {
        return Id;
    }

    @XmlAttribute(name = "Id")
    public void setId(String Id) {
        this.Id = Id;
    }

    public Ide getIde() {
        return ide;
    }

    @XmlElement(name = "ide")
    public void setIde(Ide ide) {
        this.ide = ide;
    }
}
