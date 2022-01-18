import java.util.Scanner;
class Worker extends PayCalculation{ //근무자들의 정보를 담아낸 클래스
    Scanner sc = new Scanner(System.in);
    Option C1 = new Option();
    public void cutInPayResult(){//중간에 끼는사람꺼의 메소드 종합
        endFind();
        startDayConcept();
        cutInPayCalculate();
    }
    public void startDayPayResult(){//시작날짜반영 메소드 총합
        endFind();
        startDayConcept();
        startDayPayCalculate();
    }
    public void totalResult(){//토탈결과값 출력메소드 총합
        C1.discrimin();
        countInitialization();
        C1.totalPay();
    }
    public void selectKind() { //어떤 근무형태로 했는지 선택
        System.out.println("추가 옵션이 있습니까? 1 < 중간에 들어온 경우, 2< 중간에 나간 경우 3< 없다.");
        select = sc.nextInt();
        System.out.println("현송의 근무시작일 혹은 나간일자을 입력해주세요");
        startDayInput = sc.nextInt();
        if (select == 1) {
            startDayPayResult();
            C1.result = mon_result + tue_result + wed_result + thur_result;
        } if (select == 2) {
            System.out.println("나간 일자를 입력해주세요");
            cutInPayResult();
            C1.result = mon_result + tue_result + wed_result + thur_result;
        } if (select == 3) {
            payCalculate();
            C1.result = mon_result + tue_result + wed_result + thur_result;
        }
        totalResult();
    }
    public void Hyun_song() {
        mon =4; tue =4; wed =3; thur =3;
        System.out.println("현송");
        selectKind();
    }
    public void Hee_jun() {
        mon = 5; tue = 5; sat = 10; sun = 8;
        System.out.println("희준");
        selectKind();
    }
    public void Chae_young() {
        thur = 4; fri = 10;
        System.out.println("채영");
        selectKind();
    }
    public void Jae_lim() {
        fri = 6; sat = 5;
        System.out.println("재림");
        selectKind();
          }
    public void Yu_won() {
        mon = 3; tue = 3; wed = 4; thur = 4;
        System.out.println("여원");
        selectKind();
    }
    public void Min_ji() {
        mon = 7; tue = 7;
        System.out.println("민지");
        selectKind();
    }
    public void Se_bin() {
        thur = 4; fri =4; sat = 3;
        System.out.println("세빈");
        selectKind();
    }
    public void Chae_eun() {
        wed = 7; thur =4;
        System.out.println("채은");
        selectKind();
        System.out.println( "이마트24 당산점" +month+ "월의 총 급여액은" +C1.totalPay+ "입니다." );
    }
}


