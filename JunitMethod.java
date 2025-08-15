

public class JunitMethods {

    public boolean multiple(int num1){
        if(num1 %3 ==0 || num1%5 ==0){
            return true;
        } else
            return false;
    }

    public int checkLargest(int num1, int num2, int num3){
        int firstMax = Math.max(num1, num2);

        return Math.max(firstMax, num3);
    }

    public String swap(String word){
        char[] parameterWord = word.toCharArray();

        String part1 = word.substring(0,2);
        String part2 = word.substring(2,4);


        String rev = part2 + part1;

        return rev;


}
}
