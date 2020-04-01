package sample;
public class PlusBerekening implements Berekening {
    @Override
    public int bereken(int getal1, int getal2) {
        return getal1 + getal2;
    }
}
