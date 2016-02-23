public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i<amount){
        System.out.print("*");
        i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i <= amount){
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        // 40.2
        int i=1;
        while(size>0){
            size-=1;
            printWhitespaces(size);
            printStars(i);
            //System.out.println("");
            i++;
            
        }
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        while (height>0){
            height-=1;
            printWhitespaces(height);
            printStars(i);
            //System.out.println("");
            i+=2;
            
        }
        printWhitespaces((i-3-2)/2);
        printStars(3);
        //printWhitespaces((i-3-2)/2);
        //System.out.println("");
        printWhitespaces((i-3-2)/2);
        printStars(3);
        //printWhitespaces((i-3-2)/2);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
