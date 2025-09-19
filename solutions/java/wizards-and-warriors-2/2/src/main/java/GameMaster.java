public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        return "You're a level "+character.getLevel()+" "+character.getCharacterClass()+" with "+character.getHitPoints()+" hit points.";
    }
    public String describe(Destination destination){
        return "You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.";
    }
    public String describe(TravelMethod m)
    {
        switch(m){
            case TravelMethod.WALKING:
                return "You're traveling to your destination by walking.";
            case TravelMethod.HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                return " ";
        }
    }

    public String describe(Character character, Destination destination, TravelMethod m){
                return describe(character)+" "+describe(m)+" "+describe(destination);
        
    }

        public String describe(Character character, Destination destination){
                return describe(character)+" "+describe(TravelMethod.WALKING)+" "+describe(destination);
        
    }
}
