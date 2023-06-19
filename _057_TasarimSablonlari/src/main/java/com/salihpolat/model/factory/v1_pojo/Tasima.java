package com.salihpolat.model.factory.v1_pojo;

public abstract class Tasima {

    private ETasimaTipi tasimaTipi = null;

    public Tasima(ETasimaTipi tasimaTipi) {
        this.tasimaTipi = tasimaTipi;
        yapialcakAraislem();
    }

    private void yapialcakAraislem() {
        // nesne oluşturma sırasında yapmak istediğiniz işlemler var ise burada yer alabilir.
    }

    // Hazırlık
    protected abstract void hazirlikIslemleriniYap();

    public ETasimaTipi getTasimaTipi() {
        return tasimaTipi;
    }

    public void setTasimaTipi(ETasimaTipi tasimaTipi) {
        this.tasimaTipi = tasimaTipi;
    }

}