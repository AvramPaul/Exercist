class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

    public String toString(){return "";}
}

class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    
    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter{
    boolean spellPrepared = false;

    void prepareSpell(){
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable(){
        return !spellPrepared;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
     int getDamagePoints(Fighter fighter){
         return spellPrepared ? 12 : 3;
     }
}