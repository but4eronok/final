package com.cbrf.final_version.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ValCurs implements Serializable {
    ArrayList<Valute> valutes = new ArrayList<Valute>();

    public ArrayList<Valute> getValutes() {
        return valutes;
    }

    public void setValutes(ArrayList<Valute> valutes) {
        this.valutes = valutes;
    }
}
