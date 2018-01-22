package br.ufop.cleide;

/**
 * Created by cleid on 11/12/2017.
 */

public class Medicines {

    private String name;
    private String dosage;
    private String duration;
    private String indications;

    public Medicines(String name, String dosage, String duration, String indications) {
        this.name = name;
        this.dosage = dosage;
        this.duration = duration;
        this.indications = indications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }



}
