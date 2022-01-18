import java.util.Scanner;
class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    Scanner sc = new Scanner(System.in);
    static int pay = 9160;
    int mon=0, tue=0, wed=0,thur=0,fri=0,sat=0,sun=0;
    int mon_result=0, tue_result=0, wed_result=0,
            thur_result=0, fri_result=0, sat_result=0, sun_result=0 ;
    int monStart=0,tueStart=0,wedStart=0,
            thurStart=0,friStart=0,satStart=0,sunStart=0;
    int select;
    public void startDayConcept() { // 1일이 아닌 중간에 들어와서 근무를 시작한 경우의 메소드
        monStart = SEVEN[0] - dayCount[0];
        tueStart = SEVEN[1] - dayCount[1];
        wedStart = SEVEN[2] - dayCount[2];
        thurStart = SEVEN[3] - dayCount[3];
        friStart = SEVEN[4] - dayCount[4];
        satStart = SEVEN[5] - dayCount[5];
        sunStart = SEVEN[6] - dayCount[6];
    }
    public void startDayPayCalculate() { // 그에 따른 요일별 pay결과
        mon_result = mon*monStart*pay;
        tue_result = tue*tueStart*pay;
        wed_result = wed*wedStart*pay;
        thur_result = thur*thurStart*pay;
        fri_result = fri*friStart*pay;
        sat_result = sat*satStart*pay;
        sun_result = sun*sunStart*pay;
    }
    public void payCalculate() { //1일부터 정상적으로 일한 경우의 메소드
        mon_result = mon*SEVEN[0]*pay;
        tue_result = tue*SEVEN[1]*pay;
        wed_result = wed*SEVEN[2]*pay;
        thur_result = thur*SEVEN[3]*pay;
        fri_result = fri*SEVEN[4]*pay;
        sat_result = sat*SEVEN[5]*pay;
        sun_result = sun*SEVEN[6]*pay;
    }
    public void cutInPayCalculate() { //중간에 나간 사람, 즉 1일부터 ~x일까지의 급여량을 나타내는 메소드
        mon_result = mon*dayCount[0]*pay;
        tue_result = tue*dayCount[1]*pay;
        wed_result = wed*dayCount[2]*pay;
        thur_result = thur*dayCount[3]*pay;
        fri_result = fri*dayCount[4]*pay;
        sat_result = sat*dayCount[5]*pay;
        sun_result = sun*dayCount[6]*pay;
    }
    }


