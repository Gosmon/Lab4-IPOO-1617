public class Battery {
        private double maxBattery;// em mAh
        private double currentBattery; // em mAh
       
    public Battery(double maxCharge) {
     if(maxCharge > 0) {
         maxBattery = maxCharge;
         currentBattery = 0.0;
     } else {
         maxBattery = 1000.0;
         currentBattery = 0.0;
     }
    }
 
    public void setMaxBattery(double newBattery) {
        if(newBattery >= 0) {
            maxBattery = newBattery;
        } else {
            System.out.println("O valor da bateria tem que ser igual ou superior a 0.");
        }
    }
 
    public void setCurrentBattery(double newBattery) {
        if(newBattery >= 0 & newBattery <= maxBattery) {
            currentBattery = newBattery;
        } else {
            System.out.println("O valor da bateria tem que estar entre 0 e a bateria máxima.");
        }
    }
 
    public double getMaxBattery() {
        return maxBattery;
    }
 
    public double getCurrentBattery() {
        return currentBattery;
    }
 
    public void fullChargeBattery() {
        maxBattery -= (maxBattery * 0.01);
        currentBattery = maxBattery;
    }
 
    public void unchargeFullBattery() {
        currentBattery = 0.0;
    }
    
    public boolean useBattery(double amount) {
        if(amount > 0 & amount < currentBattery) {
            currentBattery -= amount;
            return true;
        } else {
            System.out.println("Impossível gastar essa quantia de bateria.");
            return false;
        }
    }
    
    public double getPercentage() {
        double battery;
        double percentage; 
        battery = (currentBattery * 100);
        percentage = battery / maxBattery;
        return percentage;
    }
    
   
}