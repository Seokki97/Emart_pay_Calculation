public class StartDayFunction extends Calendar {  //중간에 들어오거나, 중간에 나가는 사람을 계산해주는 클래스


    public void removeMonCount() { // 1일부터 input값까지의 월요일 갯수를 카운팅
        for (int i = 0; i < remainder; i++) {
            dayCount[i] += 1;
        }
    }

    public void removeTueCount() {// 1일부터 input값까지의 화요일 갯수를 카운팅
        for (int i = 1; i < remainder ; i++) {
            dayCount[i] += 1;
        }
    }

    public void removeWedCount() {// 1일부터 input값까지의 수요일 갯수를 카운팅
        for (int i = 2; i < 7; i++) {
            if (remainder == i) {
                for (int j = 2; j < i + 1; j++) {
                    dayCount[j] += 1;
                }
            }
        }
    }

    public void removeThurCount() {// 1일부터 input값까지의 목요일 갯수를 카운팅
        if (remainder == 6) {
            for (int i = 3; i < dayCount.length; i++) {
                dayCount[i] += 1;
            }
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

    public void removeFriCount() {// 1일부터 input값까지의 금요일 갯수를 카운팅
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

    public void removeSatCount() {// 1일부터 input값까지의 토요일 갯수를 카운팅
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

    public void removeSunCount() {// 1일부터 input값까지의 일요일 갯수를 카운팅
        for (int j = 2; j < 7; j++) {
            if (remainder == j) {
                dayCount[6] += 1;
                for (int k = 0; k < j - 1; k++) {
                    dayCount[k] += 1;
                }
            }
        }
    }

    public void endFind() { // input받은 요일과 같은 요일의 메소드를 불러옴
        if (this.firstDay.equals("월")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeMonCount();
        }
        if (this.firstDay.equals("화")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeTueCount();
        }
        if (this.firstDay.equals("수")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeWedCount();
        }
        if (this.firstDay.equals("목")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeThurCount();
        }
        if (this.firstDay.equals("금")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeFriCount();
        }
        if (this.firstDay.equals("토")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeSatCount();
        }
        if (this.firstDay.equals("일")) {
            for(int i = 0 ; i<dayCount.length; i++){
                dayCount[i] += share;
            }
            removeSunCount();
        }
    }
}

