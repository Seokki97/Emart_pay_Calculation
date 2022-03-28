import java.util.Scanner;
public class Calendar { //입력한 달에 월요일~일요일이 각 몇번 있는지를 나타내는 클래스
    int[] days = new int[12];
    int year, month, monthDay;
    int[] dayWeek = new int[7];
    String firstDay ;
    public void input(int year, int month, String firstDay) { //년 월, 시작요일을 입력받는 메소드
        this.year = year;
        this.month = month;
        this.firstDay= firstDay;
    }

    public void setLeapYear() { //윤년인지 아닌지 판별해주는 메소드
        if( year % 4==0) {
            days = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        }else {
            days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        }
        for(int i=0; i<dayWeek.length; i++) {
            dayWeek[i] = 4;
        }
    }

    public void startMon() { //input값에 따라 해당 월의 월요일의 개수를 counting
        if(monthDay == 31) {
            for(int i=0; i<3; i++) {
                dayWeek[i] +=1;
            }
            if(monthDay == 30) {
                for(int j =0; j<2 ; j++) {
                    dayWeek[j] +=1;
                }
            }
        }
    }

    public void startTue() {//input값에 따라 해당 월의 화요일의 개수를 counting
        if(monthDay == 31) {
            for(int i = 1; i < 4; i++) {
                dayWeek[i] +=1;
            }
            if(monthDay == 30) {
                for(int j =1; j<3; j++) {
                    dayWeek[j] +=1;
                }
            }
        }
    }

    public void startWed() {//input값에 따라 해당 월의 수요일의 개수를 counting
        if(monthDay == 31) {
            for(int i = 2; i<5; i++) {
                dayWeek[i] +=1;
            }
            if(monthDay == 30) {
                for(int j =2; j<4; j++) {
                    dayWeek[j] +=1;
                }
            }
        }
    }

    public void startThur() {//input값에 따라 해당 월의 목요일의 개수를 counting
        if(monthDay==31) {
            for(int i=3; i<6; i++) {
                dayWeek[i] +=1;
            }
            if(monthDay == 30) {
                for(int j=3; j<5; j++) {
                    dayWeek[j] +=1;
                }
            }
        }
    }

    public void startFri() {//input값에 따라 해당 월의 금요일의 개수를 counting
        if(monthDay==31) {
            for(int i=4; i<7; i++) {
                dayWeek[i] +=1;
            }
            if(monthDay==30) {
                for(int j=4; j<6; j++) {
                    dayWeek[j] +=1;
                }
            }
        }
    }

    public void startSat() {//input값에 따라 해당 월의 토요일의 개수를 counting
        if(monthDay==31) {
            for(int i=5; i<7; i++) {
                dayWeek[i]+=1;
            }
            dayWeek[0] += 1 ;
        }
        if(monthDay==30) {
            for(int j =5; j<7; j++) {
                dayWeek[j]+=1;
            }
        }
    }

    public void startSun() {//input값에 따라 해당 월의 일요일의 개수를 counting
        if(monthDay==31) {
            dayWeek[6] +=1;
            dayWeek[0] +=1;
            dayWeek[1] +=1;
            if(monthDay==30) {
                dayWeek[6] +=1;
                dayWeek[0] +=1;
            }
        }
    }

    public void startFind() { //input에 요일 입력을 하면 그에 따른 메소드가 실행
        monthDay = days[month-1];
        if(this.firstDay.equals("월"))	{
            startMon();
        }if(this.firstDay.equals("화"))	{
            startTue();
        }if(this.firstDay.equals("수"))	{
            startWed();
        }if(this.firstDay.equals("목"))	{
            startThur();
        }if(this.firstDay.equals("금"))	{
            startFri();
        }if(this.firstDay.equals("토"))	{
            startSat();
        }if(this.firstDay.equals("일"))	{
            startSun();
        }
    }
}
