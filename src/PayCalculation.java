class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    static int pay = 9160;
    int mon_result=0, tue_result=0, wed_result=0,
            thur_result=0, fri_result=0, sat_result=0, sun_result=0 ;
    int monStart,tueStart,wedStart,
            thurStart,friStart,satStart,sunStart;
    int mon,tue,wed,thur,fri,sat,sun;
    int startDayInput;
    Option C1 = new Option();

    public void inputTotal(){
        input();
        leapYear();
        startFind();
    }
    public void startDayConcept() { // 1일이 아닌 중간에 들어와서 근무를 시작한 경우의 메소드
        monStart = SEVEN[0] - dayCount[0];
        tueStart = SEVEN[1] - dayCount[1];
        wedStart = SEVEN[2] - dayCount[2];
        thurStart = SEVEN[3] - dayCount[3];
        friStart = SEVEN[4] - dayCount[4];
        satStart = SEVEN[5] - dayCount[5];
        sunStart = SEVEN[6] - dayCount[6];
    }

    public void startDayPayResult(){//시작날짜반영 메소드 총합
        endFind();
        startDayConcept();
    }
    public void totalResult(){//토탈결과값 출력메소드 총합
        C1.discrimin();
        countInitialization();
        C1.totalPay();
    }


    public PayCalculation(int mon,int tue,int wed,
                          int thur, int fri, int sat, int sun, int startDayInput) {
        this.mon = mon; this.tue = tue; this.wed = wed; this.thur = thur;
        this.fri = fri; this.sat = sat; this.sun = sun; this.startDayInput = startDayInput;

    }
    public void result(){
        startDayConcept();
        startDayPayResult();

        mon_result = this.mon*monStart*pay; tue_result = this.tue*tueStart*pay;
        wed_result = this.wed*wedStart*pay; thur_result = this.thur*thurStart*pay;
        fri_result = this.fri*friStart*pay; sat_result = this.sat*satStart*pay;
        sun_result = this.sun*sunStart*pay;

        C1.result = mon_result + tue_result + wed_result + thur_result
                +fri_result + sat_result + sun_result;

        totalResult();

        System.out.println(dayCount[1]);
        System.out.println(monStart);
        System.out.println(SEVEN[1]);
    }
    }
