package Session3;

public class DisplayPattern {
    public static void main(String[] args){
        int row, col;
        for(row = 1; row<=6;row++){
            for(col = 1; col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
