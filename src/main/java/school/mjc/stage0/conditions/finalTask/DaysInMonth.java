package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (month==1||month==3||month==4||month==5||month==6||month==7||month==8||month==9||month==10||month==11||month==12){
            System.out.println("30");
        }else if ((year%4==0 && month==2  && year%100!=0) || year%400==0 && month==2){
            System.out.println("29");
        }else if (month==2){
            System.out.println("28");
        }else {
            System.out.println("invalid date");
        }
    }
}
