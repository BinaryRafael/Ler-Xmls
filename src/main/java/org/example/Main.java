package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.example.xmls.models_jaxb.NfeProc;

import java.io.StringReader;

public class Main {

    public static void main(String[] args) {

        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<nfeProc xmlns=\"http://www.portalfiscal.inf.br/nfe\">\n" +
                "    <NFe>\n" +
                "        <infNFe Id=\"NFe123\">\n" +
                "            <!-- Outros elementos dentro de infNFe -->\n" +
                "        </infNFe>\n" +
                "    </NFe>\n" +
                "</nfeProc>";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(NfeProc.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            NfeProc nfeProc = (NfeProc) unmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println("ID de infNFe: " + nfeProc.getNFe().getInfNFe().getId());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
