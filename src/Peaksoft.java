public class Peaksoft {
    String lesson;
    String foodName;

    public Peaksoft(String lesson, String foodName) {
        this.lesson = lesson;
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return " Peaksoft :" +
                " lesson : " + lesson + '\'' +
                " foodName : " + foodName;
    }
}
