package br.ufop.cleide;

/* Created by cleid on 11/12/2017.
 */

public class Doctor {


    private String name;
    private String specialty;
    private String phone;
    private int crm;

    public Doctor(int crm,String name, String specialty,String phone) {
        this.crm = crm;
        this.name = name;
        this.specialty = specialty;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getCrm(){return crm;  }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getPhone(){
        return this.phone;
    }


}