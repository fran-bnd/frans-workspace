package main.timer;

public class TimerService {

    // return a string containig number from 0 to 'number'
    public String count(int number){
        String buildingString = "";
        for(int i=0; i<=number; i++){
            buildingString = buildingString + i + " ";
            // System.out.println(buildingString);
        }
        return buildingString;
    }

    // overload example of 'count' method
    public String count(int start, int end){
        String buildingString = "";
        for(int i = start; i <= end; i++){
            buildingString = buildingString + i + " ";
        }
        return buildingString;
    }

    // only count even numbers
    public String countEvenNumbers(int start, int end){
        String buildingString = "";
        for(int i = start; i <= end; i++){
            if (i % 2 == 0){
                buildingString = buildingString + i + " ";
            }
            
        }
        return buildingString;
    }

}
