public class LogLine {
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevel = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]"));
        switch(logLevel){
            case "TRC":
                return LogLevel.TRACE;
                
            case "DBG":
                return LogLevel.DEBUG;
                
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
                String logLevel = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]"));
        switch(logLevel){
            case "TRC":
                return LogLevel.TRACE.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            case "DBG":
                return LogLevel.DEBUG.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            case "INF":
                return LogLevel.INFO.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            case "WRN":
                return LogLevel.WARNING.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            case "ERR":
                return LogLevel.ERROR.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            case "FTL":
                return LogLevel.FATAL.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
            default:
                return LogLevel.UNKNOWN.getShortFormat()+":"+logLine.substring(logLine.indexOf(" ")+1);
        }
    }
}
