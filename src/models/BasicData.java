package models;


public abstract class BasicData {

    public String name = "none", gender= "none", klasa= "none", origin= "none", affiliation= "none";

    public int age, tempNum;
   // public int stamina =0, durability =0, focus =0, weapSkill =0, stealth =0, tech=0, strenght= 0, agility = 0, sP = 64;



    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKlasa() {
        return this.klasa;
    }
    public void setKlasa(String klasa) {this.klasa = klasa;
    }
    public String getOrigin() {
        return this.origin;
    }
    public  void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAffiliation() {
        return this.affiliation;
    }
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getNum() {return String.valueOf(this.tempNum);}
    public void setNum(int tempNum) {this.tempNum = tempNum;}


    public String getAge() {
        return String.valueOf(this.age);
    }

    public void setAge(int age) {this.age = age;
    }

    public void breakLine() {
        System.out.println("----------------------------");
    }


}