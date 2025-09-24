class CollatzCalculator {
    
    int computeStepCount(int start) {
        if(start <= 0)
            throw new IllegalArgumentException("Only positive integers are allowed");

        return collatz(start, 0);
    }
    
    int collatz(int start, int counter){
        int isEven = 0;
        if(start > 1){
            isEven = start%2;
            return collatz(start*(2* isEven ) + isEven + start/(2-isEven), counter + 1);
        }
        return counter;
    }
}
