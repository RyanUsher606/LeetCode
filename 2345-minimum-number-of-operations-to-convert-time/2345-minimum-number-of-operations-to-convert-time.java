class Solution {
    public int convertTime(String current, String correct) {
        String[] currentSplit = current.split(":");
        int currentTime  = Integer.parseInt(currentSplit[0]) * 60 + Integer.parseInt(currentSplit[1]);

        String[] correctSplit = correct.split(":");
        int correctTime = Integer.parseInt(correctSplit[0]) * 60 + Integer.parseInt(correctSplit[1]);

        int remainingTime = correctTime - currentTime;
        int operationsNeeded = 0;

        while(remainingTime > 0)
        {
            if(remainingTime >= 60) {
                remainingTime -= 60;
                operationsNeeded += 1;
            } else if(remainingTime < 60 && remainingTime >= 15){
                remainingTime -= 15;
                operationsNeeded += 1;
            } else if(remainingTime < 15 && remainingTime >= 5){
                remainingTime -= 5;
                operationsNeeded += 1;
            } else if(remainingTime < 5 && remainingTime >= 1){
                remainingTime -= 1;
                operationsNeeded += 1;
            }
        }

        return operationsNeeded;
    }
}