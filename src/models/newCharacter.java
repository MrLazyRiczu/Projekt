package models;


import interfaces.NewCharInterface;
import interfaces.StandardInterface;

/**
 * Class Person
 */
public class newCharacter extends BasicData implements StandardInterface, NewCharInterface {





    public  String[] CharacterData() {
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