class TwelveDays {
    public String[] gifts = {
        "two Turtle Doves,",
        "three French Hens,",
        "four Calling Birds,",
        "five Gold Rings,",
        "six Geese-a-Laying,",
        "seven Swans-a-Swimming,",
        "eight Maids-a-Milking,",
        "nine Ladies Dancing,",
        "ten Lords-a-Leaping,",
        "eleven Pipers Piping,",
        "twelve Drummers Drumming,"
    };

    public String ordinals[] = {
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth"
    };
    
    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder();
        verse.append("On the "+ordinals[verseNumber-1]+" day of Christmas my true love gave to me: ");
        if(verseNumber > 1){
            for(int i=verseNumber-2; i>=0; i--)
                verse.append(gifts[i] + " ");
            verse.append("and ");
        }
        verse.append("a Partridge in a Pear Tree.\n");

        return verse.toString();
    }

    
    String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder();
        for(int i=startVerse; i<=endVerse - 1; i++){
            verses.append(verse(i)+"\n");            
        }
        verses.append(verse(endVerse));
        return verses.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}
