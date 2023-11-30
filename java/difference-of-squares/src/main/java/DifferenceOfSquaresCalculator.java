class DifferenceOfSquaresCalculator {
    int sum1 = 0;
    int sum2 = 0;

    int computeSquareOfSumTo(int input) {
        if (input > 0) {
            sum1 += input;
            computeSquareOfSumTo(input - 1);
        }
        return (int) Math.pow(sum1, 2);
    }
    int computeSumOfSquaresTo(int input) {
        if (input > 0) {
            sum2 += (int) Math.pow(input, 2);
            computeSumOfSquaresTo(input - 1);
        }
        return sum2;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
