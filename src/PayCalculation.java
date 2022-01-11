import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class PayCalculation { //실제 급여계산을 이루어주는 클래스
    Calendar C = new Calendar();
    StartDayFunction C1 = new StartDayFunction();
    static int pay = 9160;
    int mon=0, tue=0, wed=0,thur=0,fri=0,sat=0,sun=0;
    int mon_result=0, tue_result=0, wed_result=0,
            thur_result=0, fri_result=0, sat_result=0, sun_result=0 ;
    int monStart=0,tueStart=0,wedStart=0,
            thurStart=0,friStart=0,satStart=0,sunStart=0;
    int[] SEVEN2 = C.SEVEN;
    int[] dayCount2 = C1.dayCount;
    public void startDayConcept() { // 1일이 아닌 중간에 들어와서 근무를 시작한 경우의 메소드
        monStart = SEVEN2[0] - dayCount2[0];
        tueStart = SEVEN2[1] - dayCount2[1];
        wedStart = SEVEN2[2] - dayCount2[2];
        thurStart = SEVEN2[3] - dayCount2[3];
        friStart = SEVEN2[4] - dayCount2[4];
        satStart = SEVEN2[5] - dayCount2[5];
        sunStart = SEVEN2[6] - dayCount2[6];
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
        mon_result = mon*SEVEN2[0]*pay;
        tue_result = tue*SEVEN2[1]*pay;
        wed_result = wed*SEVEN2[2]*pay;
        thur_result = thur*SEVEN2[3]*pay;
        fri_result = fri*SEVEN2[4]*pay;
        sat_result = sat*SEVEN2[5]*pay;
        sun_result = sun*SEVEN2[6]*pay;
    }
    public void cutInPayCalculate() { //중간에 나간 사람, 즉 1일부터 ~x일까지의 급여량을 나타내는 메소드
        mon_result = mon*dayCount2[0]*pay;
        tue_result = tue*dayCount2[1]*pay;
        wed_result = wed*dayCount2[2]*pay;
        thur_result = thur*dayCount2[3]*pay;
        fri_result = fri*dayCount2[4]*pay;
        sat_result = sat*dayCount2[5]*pay;
        sun_result = sun*dayCount2[6]*pay;
    }
}