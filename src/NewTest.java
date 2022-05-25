public class NewTest {
    private String workerName;
    private int startDay;
    private int payOption;
    PayCalculation1 payCalc = new PayCalculation1();
    public NewTest(String workerName, int startDay, int payOption){
        this.workerName = workerName;
        this.startDay = startDay;
        this.payOption = payOption;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getPayOption() {
        return payOption;
    }

    public void setPayOption(int payOption) {
        this.payOption = payOption;
    }
}
