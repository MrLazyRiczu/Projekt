package models;

import interfaces.TemplateInterface;
import interfaces.StandardInterface;

public class templates extends BasicData implements StandardInterface, TemplateInterface {



    public String[] TemplateData() {
        return new String[]{
                "klasa: " + this.getKlasa(),
                "name: " + this.getName(),
                "age: " + this.getAge(),
                "origin: " + this.getOrigin(),
                "gender: " + this.getGender(),
                "affiliation: " + this.getAffiliation(),
        };
    }

    @Override
    public void sumUp(String opt) {
        System.out.println(CHOICE + opt);
    }


}
