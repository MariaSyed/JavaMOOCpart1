import java.util.ArrayList;

public class Variance {
    public static double sum(ArrayList<Integer> list) {
        int result = 0;
        int i = 0;
        while (i<list.size()){
            result += list.get(i);
            i++;
        }
                
        return result;
    } 
   
    public static double average(ArrayList<Integer> list) {
        double average = sum(list)/ (list.size()*1.0);
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        
        ArrayList<Double> squaredList = new ArrayList<Double>();
        double averageList = average(list);
        for ( int value : list ){
            double difference = value - averageList;
            double squaredValue = Math.pow(difference,2);
            squaredList.add(squaredValue);
            System.out.println(squaredList);
        }
        double result = 0;
        for ( double squaredValue : squaredList){
            result += squaredValue;
        }
        
        double variance = result / (list.size() - 1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
