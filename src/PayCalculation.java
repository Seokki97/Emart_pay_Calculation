class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    private int pay = 9160;
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
        remainder = (startDayInput % 7);
        input(2022, 3, "화");
        setLeapYear();
        startFind();
        endFind();
    }

    public void startDayConcept() {
      inputTotal();
        monStart = dayWeek[0] - dayCount[0];
        tueStart = dayWeek[1] - dayCount[1];
        wedStart = dayWeek[2] - dayCount[2];
        thurStart = dayWeek[3] - dayCount[3];
        friStart = dayWeek[4] - dayCount[4];
        satStart = dayWeek[5] - dayCount[5];
        sunStart = dayWeek[6] - dayCount[6];
    }

    public void showTotalPay(){
        System.out.println(this.name+"의 총 급여는" +result+"입니다.");
    }
    public void ChangePay(){
    if(plusPay>0){
        result += 9160*plusPay;
    }
    else if(minusPay>0){
        result -= 9160*minusPay;
        }
    }

    public PayCalculation(String name,int mon,int tue,int wed,
                          int thur, int fri, int sat, int sun, int startDayInput, int plusPay, int minusPay) {
        this.name = name;
        this.mon = mon; this.tue = tue; this.wed = wed; this.thur = thur;
        this.fri = fri; this.sat = sat; this.sun = sun; this.startDayInput = startDayInput;
        this.plusPay = plusPay; this.minusPay = minusPay;
    }

    public void result(){
        startDayConcept();

        monResult = this.mon*monStart*pay; tueResult = this.tue*tueStart*pay;
        wedResult = this.wed*wedStart*pay; thurResult = this.thur*thurStart*pay;
        friResult = this.fri*friStart*pay; satResult = this.sat*satStart*pay;
        sunResult = this.sun*sunStart*pay;

        result = monResult + tueResult + wedResult + thurResult
                +friResult + satResult + sunResult;

        ChangePay();

        showTotalPay();
        }
    }
