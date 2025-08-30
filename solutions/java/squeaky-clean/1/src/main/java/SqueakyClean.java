class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder output = new StringBuilder();
        for(int i=0; i<identifier.length(); i++)
            {
                char letter = identifier.charAt(i);
                switch(letter){
                    case ' ':
                        output.append('_');
                        break;
                    case '-':
                        i++;
                        letter = identifier.charAt(i);
                        output.append(Character.toUpperCase(letter));
                        break;
                    default:
                        char[][] leetspeak = {{'4', '3', '0', '1', '7'}, 
                                            {'a', 'e', 'o', 'l', 't'}
                                             };
                        for(int j = 0; j<leetspeak[0].length; j++)
                            if(letter == leetspeak[0][j]){
                                output.append(leetspeak[1][j]);
                                break;
                            }
                        if(letter >= 'A' && letter <= 'z')
                            output.append(letter);
                        break;
                    }
                }
        return output.toString();
    }
}
