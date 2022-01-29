public class Exercise {
    private String name;
 //반환할거 = name startday , cutinday , pay, 월~일까지의 시간
    public void setName(int startDay, int cutinDay, int plusPay,
                        int mon, int tue, int wed, int thur, int fri, int sat, int sun){
    if(startDay >0){
        startDayPayResult();

        mon_result = mon*monStart*pay; tue_result = tue*tueStart*pay;
        wed_result = wed*wedStart*pay; thur_result = thur*thurStart*pay;
        fri_result = fri*friStart*pay; sat_result = sat*satStart*pay;
        sun_result = sun*sunStart*pay;

        plusPay = plusTime * pay;

        C1.result = mon_result + tue_result + wed_result + thur_result
                +fri_result + sat_result + sun_result + plusPay;

    }
    if( cutinDay>0){
        cutInPayResult();

        mon_result = mon*dayCount[0]*pay; tue_result = tue*dayCount[1]*pay;
        wed_result = wed*dayCount[2]*pay; thur_result = thur*dayCount[3]*pay;
        fri_result = fri*dayCount[4]*pay; sat_result = sat*dayCount[5]*pay;
        sun_result = sun*dayCount[6]*pay;

        plusPay = plusTime * pay;

        C1.result = mon_result + tue_result + wed_result + thur_result
                +fri_result + sat_result + sun_result+plusPay;
    }

        totalResult();
        return C1.result;

    }
    public void setName()


    public Worker(String name){
        setName(name);
    }
}
