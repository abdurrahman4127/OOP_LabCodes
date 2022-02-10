package Lab3_Constructor;

//constructor
class Series_ {
    int start;
    int end;


    //same as class' name (special function )
    // 'public' is obligatory so that it can be accessible
    //constructor for s1
    public Series_(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //constructor for s2
    public Series_(int start) {   //variable name is : start
        this.start = start;       //to specify, we added 'this.' because both variable and class property variable are same
    }


    //constructor for s3
    public Series_() {
        // goes in background as default
        // where start = 0; and n = 0; (by default)
        //java creates it itself, if we get nothing to pass
    }

    int getSqSum() {
        int sum = 0;

        for(int i = start; i<=end; i++) {
            sum += i;
        }
        return sum;
    }
}

public class labClassThree_Constructor {
    public static void main(String []args)
    {
        //giving both values inside it.
        Series_ s1 = new Series_(1,10); //class name is : "Series_" (not "Series")
        System.out.println("s1 : " + s1.getSqSum());

        //giving one value inside it.
        Series_ s2 = new Series_(10);
        s2.end = 20;
        System.out.println("s2 : " + s2.getSqSum());

        //giving no value inside it.
        Series_ s3 = new Series_();
        s3.start = 30;
        s3.end = 50;
        System.out.println("s3 : " + s3.getSqSum());
    }
}
