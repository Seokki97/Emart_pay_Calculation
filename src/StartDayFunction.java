public class StartDayFunction extends Calendar {  //중간에 들어오거나, 중간에 나가는 사람을 계산해주는 클래스
    int[] dayCount = {0, 0, 0, 0, 0, 0, 0};
    int share;
    int remainder;
    public int startDayInput = 0;

    public void endMon() { // 1일부터 input값까지의 월요일 갯수를 카운팅
        for (int i = 0; i < remainder; i++) {
            dayCount[i] += 1;
        }
    }

    public void endTue() {// 1일부터 input값까지의 화요일 갯수를 카운팅
        for (int i = 1; i < remainder + 1; i++) {
            dayCount[i] += 1;
        }
    }

    public void endWed() {// 1일부터 input값까지의 수요일 갯수를 카운팅
        for (int i = 2; i < 7; i++) {
            if (remainder == i) {
                for (int j = 2; j < i + 1; j++) {
                    dayCount[j] += 1;
                }
            }
        }
    }

    public void endThur() {// 1일부터 input값까지의 목요일 갯수를 카운팅
        if (remainder == 6) {
            for (int i = 3; i < dayCount.length; i++) {
                dayCount[i] += 1;
            } // 3 4 5 6  + 0
            dayCount[0] += 1;
        }
        for (int i = 2; i < 6; i++) {
            if (remainder == i) {
                for (int j = 3; j < i + 2; j++) {
                    dayCount[j] += 1;
                }
            }
        }
    }

    public void endFri() {// 1일부터 input값까지의 금요일 갯수를 카운팅
        if (remainder == 5) {
            for (int i = 4; i < dayCount.length; i++) {
                dayCount[i] += 1;
            }
            dayCount[0] += 1;
        }
        if (remainder == 6) {
            for (int i = 4; i < dayCount.length; i++) {
                dayCount[i] += 1;
            }
            dayCount[0] += 1;
            dayCount[1] += 1;
        }
        for (int i = 2; i < 5; i++) {
            if (remainder == i) {
                for (int j = 4; j < i + 3; j++) {
                    dayCount[j] += 1;
                }
            }
        }
    }

    public void endSat() {// 1일부터 input값까지의 토요일 갯수를 카운팅
        if (remainder == 2) {
            dayCount[5] += 1;
        }
        if (remainder == 3) {
            for (int i = 5; i < dayCount.length; i++) {
                dayCount[i] += 1;

            }
        }
        for (int i = 4; i < 7; i++) {
            if (remainder == i) {
                for (int j = 5; j < dayCount.length; j++) {
                    dayCount[j] += 1;
                }
                for (int k = 0; k < i - 3; k++) {
                    dayCount[k] += 1;
                }
            }
        }
    }

    public void endSun() {// 1일부터 input값까지의 일요일 갯수를 카운팅
        for (int j = 2; j < 7; j++) {
            if (remainder == j) {
                dayCount[6] += 1;
                for (int k = 0; k < j - 2; k++) {
                    dayCount[k] += 1;
                }
            }
        }
    }

    public void endFind() { // input받은 요일과 같은 요일의 메소드를 불러옴
        share = startDayInput / 7;
        remainder = (startDayInput % 7);
        for (int i = 0; i < dayCount.length; i++) {
            dayCount[i] += share;
        }
        if (first_day.equals("월")) {
            endMon();
        }
        if (first_day.equals("화")) {
            endTue();
        }
        if (first_day.equals("수")) {
            endWed();
        }
        if (first_day.equals("목")) {
            endThur();
        }
        if (first_day.equals("금")) {
            endFri();
        }
        if (first_day.equals("토")) {
            endSat();
        }
        if (first_day.equals("일")) {
            endSun();
        }
    }

    public void countInitialization() { //dayCount를 초기화해줘야 하기 때문에 만든 메소드
        for (int i = 0; i < 7; i++) {
            dayCount[i] = 0;
        }
    }
}

