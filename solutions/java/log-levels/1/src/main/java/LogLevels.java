public class LogLevels {
    
    public static String message(String logLine) {
        String[] word = logLine.split(": ");
            return word[1].trim();
    }

    public static String logLevel(String logLine) {
        //String[] loglevel = logLine.split("]");
        //return loglevel[0].substring(1).toLowerCase();
        //sau cu regex sau cu 
        return logLine.substring( logLine.indexOf("[")+1, logLine.indexOf("]") ).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
