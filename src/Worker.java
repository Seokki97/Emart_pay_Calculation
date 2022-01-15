import java.util.Scanner;
class Worker extends PayCalculation{ //근무자들의 정보를 담아낸 클래스
    Scanner sc = new Scanner(System.in);
    Option C1 = new Option();
    int cutIn=0;
    public void Hyun_song() {
        mon = 4;
        tue = 4;
        wed = 3;
        thur = 3;
        System.out.println("현송의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt() ;
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {

            endFind();
            startDayConcept();
            cutInPayCalculate();
           C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else{
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                //총결과
                startDayPayCalculate();
                C1.result = mon_result + tue_result + wed_result+ thur_result;

            } else {
                payCalculate();
                C1.result = mon_result + tue_result + wed_result+ thur_result;
            }
        }

        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else{
            if(startDayInput > 1) {
                endFind();
                //시작날짜 반영
                startDayConcept();
                startDayPayCalculate();
                C1.result = mon_result + tue_result + thur_result + sat_result +sun_result;
            }
            else{
                payCalculate();
                C1.result = mon_result + tue_result + wed_result+ thur_result + sat_result;
            }
        }
        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날짜
                startDayConcept();
                startDayPayCalculate();
                C1.result = thur_result+fri_result;
            } else{
                payCalculate();
                C1.result = thur_result + fri_result;
            }
        }
        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                //endFind();
                //근무시작날짜
                startDayConcept();
                startDayPayCalculate();
                C1.result =fri_result+sat_result;
            } else{
                payCalculate();
                C1.result = fri_result+sat_result;
            }
        }
        C1.discrimin();
        countInitialization();
    }
    public void Yu_won() {
        mon = 3;
        tue = 3;
        wed = 4;
        thur = 4;
        System.out.println("여원의 근무시작일을 입력해주세요");
        startDayInput = sc.nextInt();
        System.out.println("중간에 나갔습니까? 맞으면 1을 입력해주세요");
        cutIn = sc.nextInt();
        if(cutIn == 1) {
            endFind();
            startDayConcept();
            cutInPayCalculate();
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //근무시작날자
                startDayConcept();
                startDayPayCalculate();
                C1.result = mon_result+tue_result+wed_result+thur_result;
            }else{
                payCalculate();
                C1.result = mon_result + tue_result + wed_result + thur_result;
            }
        }
        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                //시작날짜 반영
                startDayConcept();
                startDayPayCalculate();
                C1.result = mon_result + tue_result;
            }else{
                payCalculate();
                C1.result = mon_result+ tue_result;
            }
        }
        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;
        }
        else {
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                startDayPayCalculate();
                C1.result = thur_result+fri_result+sat_result;

            }else{
                payCalculate();
                C1.result = thur_result + fri_result + sat_result;
            }
        }
        C1.discrimin();
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
            C1.result = mon_result + tue_result+ wed_result+thur_result;

        }
        else {
            if(startDayInput > 1) {
                endFind();
                startDayConcept();
                startDayPayCalculate();
                C1.result = wed_result+ thur_result;

            }else{
                payCalculate();
                C1.result = wed_result+ thur_result;
            }
        }
        C1.discrimin();
        countInitialization();
    }
    public void cutInWorker() {//대타자
    }
}


