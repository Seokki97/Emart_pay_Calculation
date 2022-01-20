class PayCalculation extends StartDayFunction{ //실제 급여계산을 이루어주는 클래스
    static int pay = 9160;
    int mon_result=0, tue_result=0, wed_result=0,
            thur_result=0, fri_result=0, sat_result=0, sun_result=0 ;
    int monStart=0,tueStart=0,wedStart=0,
            thurStart=0,friStart=0,satStart=0,sunStart=0;
    int select;
    Option C1 = new Option();

    public void startDayConcept() { // 1일이 아닌 중간에 들어와서 근무를 시작한 경우의 메소드
        monStart = SEVEN[0] - dayCount[0];
        tueStart = SEVEN[1] - dayCount[1];
        wedStart = SEVEN[2] - dayCount[2];
        thurStart = SEVEN[3] - dayCount[3];
        friStart = SEVEN[4] - dayCount[4];
        satStart = SEVEN[5] - dayCount[5];
        sunStart = SEVEN[6] - dayCount[6];
    }

   public void cutInPayResult(){//중간에 끼는사람꺼의 메소드 종합
       endFind();
       startDayConcept();

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

    public int selectKind(int mon,int tue,int wed,
                          int thur, int fri, int sat, int sun) {
        System.out.println("추가 옵션이 있습니까? 1 < 중간에 들어온 경우, 2< 중간에 나간 경우 3< 없다.");
        select = sc.nextInt();
        System.out.println("근무시작일 혹은 나간일자을 입력해주세요");
        startDayInput = sc.nextInt();

        if (select == 1) {
            startDayPayResult();

            mon_result = mon*monStart*pay; tue_result = tue*tueStart*pay;
            wed_result = wed*wedStart*pay; thur_result = thur*thurStart*pay;
            fri_result = fri*friStart*pay; sat_result = sat*satStart*pay;
            sun_result = sun*sunStart*pay;

            C1.result = mon_result + tue_result + wed_result + thur_result
                    +fri_result + sat_result + sun_result;
        } if (select == 2) {
            cutInPayResult();

            mon_result = mon*dayCount[0]*pay; tue_result = tue*dayCount[1]*pay;
            wed_result = wed*dayCount[2]*pay; thur_result = thur*dayCount[3]*pay;
            fri_result = fri*dayCount[4]*pay; sat_result = sat*dayCount[5]*pay;
            sun_result = sun*dayCount[6]*pay;

            C1.result = mon_result + tue_result + wed_result + thur_result
                    +fri_result + sat_result + sun_result;
        } if (select == 3) {
            mon_result = mon*SEVEN[0]*pay; tue_result = tue*SEVEN[1]*pay;
            wed_result = wed*SEVEN[2]*pay; thur_result = thur*SEVEN[3]*pay;
            fri_result = fri*SEVEN[4]*pay; sat_result = sat*SEVEN[5]*pay;
            sun_result = sun*SEVEN[6]*pay;

            C1.result = mon_result + tue_result + wed_result + thur_result
                    +fri_result + sat_result + sun_result;
        }
        totalResult();
        return C1.result;
    }
    }
