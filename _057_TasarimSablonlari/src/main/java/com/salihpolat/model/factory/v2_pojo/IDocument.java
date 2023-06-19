package com.salihpolat.model.factory.v2_pojo;

// Değişik türde doküman türleri oluşturmak için tanımlanan arayüz.
public interface IDocument {
    /**
     * Dokümanın tipini veren metotd
     * @return String doküman tipi (pdf, word, text ....)
     */
    public String getDocumentType();
}