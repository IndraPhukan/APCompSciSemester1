public class StepTracker{
    
    int minSteps;
    int dayAmount;
    int totalSteps;
    
    public StepTracker(int steps){
        minSteps = steps;
        dayAmount = 0;
        totalSteps = 0;
        
    }
    
    public void addDailySteps(int dailySteps){
        totalSteps = dailySteps;
        dayAmount+=1;
        return;
    }
    
    public double averageSteps(){
        return totalSteps/dayAmount;
    }
    
    public int activeDays(){
        if (averageSteps() >= 10000){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    
    
}