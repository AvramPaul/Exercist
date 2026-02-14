import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardsSet = new HashSet<>();
        for(String card : cards){
            if(!cardsSet.contains(card))
                cardsSet.add(card);
        }
        return cardsSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean IHaveSmthToTrade = false;
        boolean youHaveSmthToTrade = false;

        
        for(String myCard : myCollection){
            if(!theirCollection.contains(myCard))
                IHaveSmthToTrade = true;
        }
        for(String yourCard : theirCollection){
            if(!myCollection.contains(yourCard))
                youHaveSmthToTrade = true;
        }
        if(IHaveSmthToTrade && youHaveSmthToTrade)
            return true;
        return false;
    
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCollection = new HashSet<>(collections.get(0));
        for(Set<String> collection : collections.subList(1, collections.size()))
            commonCollection.retainAll(collection);

        return commonCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> commonCollection = new HashSet<>(collections.get(0));
        for(Set<String> collection : collections.subList(1, collections.size()))
            for(String card : collection)
                if(!commonCollection.contains(card))
                    commonCollection.add(card);

        return commonCollection;
    }
}
