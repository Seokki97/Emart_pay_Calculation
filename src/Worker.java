class Worker extends PayCalculation{ //근무자들의 정보를 담아낸 클래스
    public void Hyun_song() {
        System.out.println("현송");
        selectKind(4,4,3,3,0,0,0);
    }
    public void Hee_jun() {
        System.out.println("희준");
        selectKind(5,5,0,0,0,10,8);
    }
    public void Chae_young() {
        System.out.println("채영");
        selectKind(0,0,0,4,10,0,0);
    }
    public void Jae_lim() {
        System.out.println("재림");
        selectKind(0,0,0,0,6,5,0);
          }
    public void Yu_won() {
        System.out.println("여원");
        selectKind(3,3,4,4,0,0,0);
    }
    public void Min_ji() {
        System.out.println("민지");
        selectKind(7,7,0,0,0,0,0);
    }
    public void Se_bin() {
        System.out.println("세빈");
        selectKind(0,0,0,4,4,3,0);
    }
    public void Chae_eun() {
        System.out.println("채은");
        selectKind(0,0,7,4,0,0,0);
        System.out.println( "이마트24 당산점" +month+ "월의 총 급여액은" +C1.totalPay+ "입니다." );
    }
}


