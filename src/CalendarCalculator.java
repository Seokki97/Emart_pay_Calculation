public class CalendarCalculator extends StartDayFunction{
    int monResult=0, tueResult=0, wedResult=0,
            thurResult=0, friResult=0, satResult=0, sunResult=0 ;

    int monStart,tueStart,wedStart,
            thurStart,friStart,satStart,sunStart;

    int mon,tue,wed,thur,fri,sat,sun;
    int startDayInput;
    String name;
    int result=0;
    int plusPay; int minusPay;

    public void inputTotal(){
        share = startDayInput / 7;
        remainder = (startDayInput % 7) -1;
        input(2022, 8, "월");
        setLeapYear();
        startFind();
        endFind();
    }

    public void startDayConcept() {

        inputTotal();

        if(startDayInput == 1){
            monStart = dayWeek[0];
            tueStart = dayWeek[1];
            wedStart = dayWeek[2];
            thurStart = dayWeek[3];
            friStart = dayWeek[4];
            satStart = dayWeek[5];
            sunStart = dayWeek[6];
        }
        else{
            monStart = dayWeek[0] - dayCount[0];
            tueStart = dayWeek[1] - dayCount[1];
            wedStart = dayWeek[2] - dayCount[2];
            thurStart = dayWeek[3] - dayCount[3];
            friStart = dayWeek[4] - dayCount[4];
            satStart = dayWeek[5] - dayCount[5];
            sunStart = dayWeek[6] - dayCount[6];
        }

    }
}
