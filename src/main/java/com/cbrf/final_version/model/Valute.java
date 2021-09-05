package com.cbrf.final_version.model;

public class Valute {

    private int numCode;
    private String charCode;
    private int nominal;
    private String name;
    private double value;


    public int getNumCode() {
        return numCode;
    }

    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Valute [NumCode =" + numCode + ", CharCode " + charCode + ", Nominal " + nominal + ", Name " + name + ", Value " + value + "]";
    }
}
