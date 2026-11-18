// Part A

public class VirtualPet {
    private String name;
    private int initialWeight;
    private int ageYears;
    private int ageMonths;
    private int energy;
    private int happiness;

    public VirtualPet(String name){
        this.name = name;
        this.initialWeight = 5;
    }

    public String getName(){
        return name;
    }

    public int getInitialWeight(){
        return initialWeight;
    }

    public int getAgeYears(){
        return ageYears;
    }

    public int getAgeMonths(){
        return ageMonths;
    }

    public int getHappinessLevel(){
        return happiness;
    }

    public int getEnergy(){
        return energy;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setInitialWeight(int initialWeight){
        this.initialWeight = initialWeight;
    }

    public void setAgeYears(int ageYears){
        this.ageYears = ageYears;
    }

    public void setAgeMonths(int ageMonths){
        this.ageMonths = ageMonths;
    }

    public void setHappinessLevel(int happiness){
        this.happiness = happiness;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public String toString(){
        return name + "Information: \n Energy: " + energy + "\n Happiness " + happiness + "\n Weight: " + initialWeight + "g \n Age: " + ageMonths + "months and " + ageYears;
    }

    public void feed(){
        if(energy > 0 && energy < 10){
            energy++;
        }
        initialWeight++;
    }

    public void play(){
        if(happiness > 0 && happiness < 10){
            happiness++;
        }
        initialWeight--;
        if(initialWeight < 5){
            this.initialWeight = 5;
        }
    }
    public void updateStatus(){
        
    }
}
