package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.example.xmls.models_jaxb.Pessoa;

import java.io.StringReader;

public class Teste {
    public static void main(String[] args) {
        String xmlString = "<pessoa><nome>João</nome><idade>30</idade></pessoa>";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Pessoa.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Pessoa pessoa = (Pessoa) unmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
