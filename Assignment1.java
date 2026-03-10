class Assignment1 {
public class Tester {

    public static void main(String[] args) {
        
        int year = 2023;   // You can change the input year
        
        int[] leapYears = UserMainCode.findLeapYears(year);
        
        for(int i = 0; i < leapYears.length; i++) {
            System.out.println(leapYears[i]);
        }
    }
}
public class UserMainCode {

    public static int[] findLeapYears(int year) {
        
        int[] result = new int[15];
        int count = 0;

        while(count < 15) {
            
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                result[count] = year;
                count++;
            }
            
            year++;
        }

        return result;
    }
}