class Droid {
    // Defining a Droid
    String Name;
    int batteryLevel;

    // constructor
    Droid(String droidName) {
        Name = droidName;
        batteryLevel = 100;
    }

    // Doing Droid Things
    public void performTask(String task) {
        System.out.println(Name + " performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    // Energy Report
    public void energyReport() {
        System.out.println("Droid's batteryLevel: " + batteryLevel);
    }

    // Energy Transfer
    public void energyTransfer(Droid droid, int energy) {
        System.out.println(Name + " transferring energy to " + droid.Name);
        batteryLevel = batteryLevel - energy;
        droid.batteryLevel = droid.batteryLevel + energy;
    }

    public String toString() {
        return "Hello, I'm the droid: " + Name;
    }

    // Decalaring Instances of Drone
    public static void main(String[] args) {
        Droid newDroid = new Droid("Codey");
        System.out.println(newDroid);
        newDroid.performTask("Dancing");
        newDroid.energyReport();

        Droid anotherDroid = new Droid("Monica");
        anotherDroid.performTask("Leviating");
        anotherDroid.energyReport();

        newDroid.energyTransfer(anotherDroid, 20);
        anotherDroid.energyReport();
        newDroid.energyReport();
        

    }

}
