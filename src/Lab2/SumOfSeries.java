package Lab2;

// for summing up a series 1² + 2² + 3² + 4² + .... + n²
class Series {
    int endAt;

    int getSqSum(int startFrom) {
        int sum = 0;
        for(int i = 2; i<=endAt; i++) {
            sum += i;
        }
        return sum;
    }
}

public class SumOfSeries {
    public static void main(String []args)
    {
        Series s1 = new Series();
        s1.endAt = 10; // up to n, and n is saved in s1.n;
        System.out.println(s1.getSqSum(2));
    }
}
