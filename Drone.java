public class Drone
{
        private boolean turnedOn;
        private Battery battery;
        private Motor motor;
    
    public Drone()
    {
        turnedOn = false;
        Battery bat = new Battery(1000);
        Motor mot = new Motor(100);
    }
    
    public Drone(double newConsum) {
        turnedOn = false;
        Battery bat = new Battery(1000);
        Motor mot = new Motor(newConsum);
    }
    
    public void turnOnDrone() {
        if(battery.getCurrentBattery() >= 50) {
            turnedOn = true;
            battery.useBattery(10);
        } else {
            System.out.println("A bateria tem que ter no mínimo 50 mAh para ligar o drone.");
        }
    }
    
    public void turnOffDrone() {
        turnedOn = false;
    }
    
    public void chargeBattery() {
        if(turnedOn != true) {
            battery.fullChargeBattery();
        } else {
            System.out.println("Para que o drone carregue tem que estar desligado.");
        }
    }
    
    public void changeBattery(Battery newBat) {
        if(turnedOn == false) {
            if(newBat.getMaxBattery() >= 500) {
                Battery bat2 = new Battery(1000);
            } else {
                System.out.println("A bateria tem que ter pelo menos 500 mAh.");
            }
        } else {
            System.out.println("O drone tem que estar desligado para a troca de baterias.");
        }
    }
    
    public void fly() {
        if(turnedOn = true) {
            if(motor.getConsumption() < battery.getCurrentBattery()) {
                motor.turnMotorOn();
                battery.useBattery(motor.getConsumption());
            }
            
        }
    }
    
    

    
}
