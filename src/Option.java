import java.util.Scanner;

class Option { //추가적인 기능(추가, 감소근무)을 나타내는 클래스
    Scanner sc = new Scanner(System.in);
    static int pay = 9160;
    String plusMinus;
    int result=0;
    int plusTime, minusTime;
    int plusPay=0, minusPay=0;
    public void plusPay() { //추가근무페이를 더해주는 메소드
        System.out.println("추가근무 시간을 입력해주세요");
        plusTime = sc.nextInt();
        plusPay = plusTime*pay;
    }
    public void minusPay() { //감소근무 pay를 빼주는 메소드
        System.out.println("근무감소 시간을 입력해주세요");
        minusTime = sc.nextInt();
        minusPay = minusTime*pay;

    }
    public void discrimin() { //총 결과값들을 출력해주는 메소드
        System.out.println("추가근무가 있으면 '추가', 근무 감소가 있다면 '감소', 없다면 0을 입력해주세요");
        plusMinus = sc.next();
        if(plusMinus.equals("추가")) {
            plusPay();
            System.out.println("급여는" +(result +plusPay) +"입니다.");
        }
        else if(plusMinus.equals("감소")) {
            minusPay();
            System.out.println("급여는" +(result -minusPay) +"입니다.");
        }
        else if(plusMinus.equals("0")) {
            System.out.println("급여는" +result+"입니다.");
        }

    }

}
