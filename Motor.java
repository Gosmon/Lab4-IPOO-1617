public class Motor
{
        private double consumption;
        private boolean turnedOn;
    
    public Motor(double newConsumption)
    {
        turnedOn = false;
        if(newConsumption > 1.0) {
            consumption = newConsumption;
        } else {
            consumption = 1.0;
        }
    }
    
    public void setConsumption(double newConsum) {
        if(newConsum > 1.0) {
            consumption = newConsum;
        } else {
            consumption = 1.0;
        }
    }
    
    public void setTurnedOn(boolean state) {
        turnedOn = state;
    }
    
    public boolean getTurnedOn() {
        return turnedOn;
    }
    
    public double getConsumption() {
        return consumption;
    }
    
    public void turnMotorOn() {
        turnedOn = true;
    }
    
    public void turnMotorOff() {
        turnedOn = false;
    }
  
}
