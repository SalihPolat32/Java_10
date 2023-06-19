package com.salihpolat.model.factory.v2_pojo;
/**
 * DocumentFactory sınıfı bir fabrika tasarım şablonu implementasyonudur.
 */
public class DocumentFactory {
    /**
     * Kullanıcının istediği tipte bir doküman oluşturur
     */
    public static IDocument builder(final String type) {

        if (type.equalsIgnoreCase("WORD")) {
            return new Word();
        }if (type.equalsIgnoreCase("PDF")) {
            return new Pdf();
        } else if (type.equalsIgnoreCase("TEXT")) {
            return new Text();
        } else {
            throw new RuntimeException("Doküman tipi belli degil!");
        }
    }
}