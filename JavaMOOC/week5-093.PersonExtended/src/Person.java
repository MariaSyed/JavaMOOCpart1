import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
        
    }
    
    
    public int age() {
        MyDate calendarDate = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR)); 
        return this.birthday.differenceInYears(calendarDate);
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public boolean olderThan(Person compared){
        MyDate calendarDate = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
        if ( this.birthday.differenceInDays(calendarDate) > compared.birthday.differenceInDays(calendarDate)){
            return true;
        }
        
        else {
            return false;
        }
    }
    
    
}

