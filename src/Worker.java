import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Worker extends Option{ //근무자들의 정보를 담아낸 클래스
    Scanner sc = new Scanner(System.in);
    int cutIn=0;
    public void Jung_yun() {
        mon = 4;
        tue = 4;
        wed = 3;
        thur = 3;
        System.out.println("정연의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt() ;
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else{
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                //총결과
                startDayPayCalculate();
                result = mon_result + tue_result + wed_result+ thur_result;

            } else {
                payCalculate();
                result = mon_result + tue_result + wed_result+ thur_result;
            }
        }

        discrimin();
        countInitialization();
    }
    public void Hee_jun() {
        mon = 5;
        tue = 5;
        sat = 10;
        sun = 8;
        System.out.println("희준의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else{
            if(startDayInput > 1) {

                endFind();
                //시작날짜 반영
                startDayConcept();
                startDayPayCalculate();
                result = mon_result + tue_result + thur_result + sat_result +sun_result;
            }
            else{
                payCalculate();
                result = mon_result + tue_result + wed_result+ thur_result + sat_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Chae_young() {
        thur = 4;
        fri = 10;
        System.out.println("채영의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날짜
                startDayConcept();
                startDayPayCalculate();
                result = thur_result+fri_result;
            } else{
                payCalculate();
                result = thur_result + fri_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Jae_lim() {
        fri = 6;
        sat = 5;
        System.out.println("재림의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날짜
                startDayConcept();
                startDayPayCalculate();
                result =fri_result+sat_result;
            } else{
                payCalculate();
                result = fri_result+sat_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Su_yun() {
        sat = 6;
        sun = 8;
        System.out.println("수연의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날짜
                startDayConcept();
                startDayPayCalculate();
                result = sat_result +sun_result;
            } else{
                payCalculate();
                result = sat_result + sun_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Ga_eun() {
        mon = 3;
        tue = 3;
        wed = 4;
        thur = 4;
        System.out.println("가영의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날자
                startDayConcept();
                startDayPayCalculate();
                result = mon_result+tue_result+wed_result+thur_result;
            }else{
                payCalculate();
                result = mon_result + tue_result + wed_result + thur_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Min_ji() {
        mon = 7;
        tue = 7;
        System.out.println("민지의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //시작날짜 반영
                startDayConcept();
                startDayPayCalculate();
                result = mon_result + tue_result;
            }else{
                payCalculate();
                result = mon_result+ tue_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Se_bin() {
        thur = 4;
        fri =4;
        sat = 3;
        System.out.println("세빈의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                startDayPayCalculate();
                result = thur_result+fri_result+sat_result;

            }else{
                payCalculate();
                result = thur_result + fri_result + sat_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void Chae_eun() {
        wed = 7;
        thur =4;
        System.out.println("채은의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                startDayPayCalculate();
                result = wed_result+ thur_result;

            }else{
                payCalculate();
                result = wed_result+ thur_result;
            }
        }
        discrimin();
        countInitialization();
    }
    public void cutInWorker() {//대타자
    }
}


