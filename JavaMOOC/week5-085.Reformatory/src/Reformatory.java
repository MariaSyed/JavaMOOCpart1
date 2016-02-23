public class Reformatory {
    
    private int numberWeights;
    
    public Reformatory(){
    this.numberWeights = 0;
}
    public int weight(Person person) {
        this.numberWeights++;
        return person.getWeight();
        
    }
    public void feed(Person person){
        person.weight++;
    }
    
    public int totalWeightsMeasured(){
        return this.numberWeights;
    }

}
