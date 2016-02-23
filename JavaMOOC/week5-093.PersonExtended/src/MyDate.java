
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparing){
        if (earlier(comparing)==false){
        int difference = ((this.year * 365) + (this.month * 30) + this.day) - ((comparing.year*365) + (comparing.month * 30)+comparing.day );
        int realDifference = difference / 365;
        return realDifference - (realDifference%1);
                
    }
        else {
        int difference = ((comparing.year * 365) + (comparing.month * 30) + comparing.day) - ((this.year*365) + (this.month * 30)+this.day );
        int realDifference = difference / 365;
        return realDifference - (realDifference%1);
        }
    }
    
    public int differenceInDays(MyDate comparing){
       if (earlier(comparing)==false){
        int difference = ((this.year * 365) + (this.month * 30) + this.day) - ((comparing.year*365) + (comparing.month * 30)+comparing.day );
        return difference;
                
    }
        else {
        int difference = ((comparing.year * 365) + (comparing.month * 30) + comparing.day) - ((this.year*365) + (this.month * 30)+this.day );
        return difference;
        } 
    }
  
}