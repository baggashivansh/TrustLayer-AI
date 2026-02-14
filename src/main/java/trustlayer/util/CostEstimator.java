package trustlayer.util;

public class CostEstimator {

    public double estimate(int tokens) {
        return tokens * 0.0001;
    }
}
