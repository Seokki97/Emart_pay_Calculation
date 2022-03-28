class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    static int pay = 9160;
    int mon_result=0, tue_result=0, wed_result=0,
            thur_result=0, fri_result=0, sat_result=0, sun_result=0 ;
    int monStart,tueStart,wedStart,
            thurStart,friStart,satStart,sunStart;
    int mon,tue,wed,thur,fri,sat,sun;
    int startDayInput;
    String name;
    int result=0;

    public void inputTotal(){
        share = startDayInput / 7;
        remainder = (startDayInput % 7);
        input(2022, 1, "토");
        leapYear();
        startFind();
        endFind();
    }

    public void startDayConcept() {
      inputTotal();
        monStart = SEVEN[0] - dayCount[0];
        tueStart = SEVEN[1] - dayCount[1];
        wedStart = SEVEN[2] - dayCount[2];
        thurStart = SEVEN[3] - dayCount[3];
        friStart = SEVEN[4] - dayCount[4];
        satStart = SEVEN[5] - dayCount[5];
        sunStart = SEVEN[6] - dayCount[6];

    }

    public void totalPay(){
        System.out.println(this.name+"의 총 급여는" +result+"입니다.");
        for(int i = 0 ; i < dayCount.length; i++){
            System.out.println(dayCount[i]);
        }
    }

    public PayCalculation(String name,int mon,int tue,int wed,
                          int thur, int fri, int sat, int sun, int startDayInput) {
        this.name = name;
        this.mon = mon; this.tue = tue; this.wed = wed; this.thur = thur;
        this.fri = fri; this.sat = sat; this.sun = sun; this.startDayInput = startDayInput;
    }
    public void result(){
        startDayConcept();

        mon_result = this.mon*monStart*pay; tue_result = this.tue*tueStart*pay;
        wed_result = this.wed*wedStart*pay; thur_result = this.thur*thurStart*pay;
        fri_result = this.fri*friStart*pay; sat_result = this.sat*satStart*pay;
        sun_result = this.sun*sunStart*pay;

        result = mon_result + tue_result + wed_result + thur_result
                +fri_result + sat_result + sun_result;

        totalPay();
    }
    }
