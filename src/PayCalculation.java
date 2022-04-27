class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    private final int pay = 9160;
    int monResult=0, tueResult=0, wedResult=0,
            thurResult=0, friResult=0, satResult=0, sunResult=0 ;

    int monStart,tueStart,wedStart,
            thurStart,friStart,satStart,sunStart;
    String name;
    int startDayInput;
    int mon,tue,wed,thur,fri,sat,sun;
    int result=0;
    int plusPay; int minusPay;

    public PayCalculation(String name,int mon,int tue,int wed,
                          int thur, int fri, int sat, int sun,int startDayInput, int plusPay, int minusPay) {
        this.mon = mon; this.tue = tue; this.wed = wed; this.thur = thur;
        this.fri = fri; this.sat = sat; this.sun = sun;
        this.plusPay = plusPay; this.minusPay = minusPay;
        this.name = name; this.startDayInput =startDayInput;
    }

    public void inputTotal(){
        share = startDayInput / 7;
        remainder = (startDayInput % 7) -1;
        input(2022, 4, "금");
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

    public void showTotalPay(){
        /*for(int i = 0 ; i < dayCount.length; i++){
            System.out.print(calcCal.dayWeek[i]);
        }
        for(int j = 0 ; j < dayCount.length; j++){
            System.out.print(calcCal.dayCount[j]);
        }*/
      //  System.out.println(startDayInput);
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

    public void showPayResult(){
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
