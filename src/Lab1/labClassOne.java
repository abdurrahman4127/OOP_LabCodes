package Lab1;

//array and its size
public class labClassOne {
    public static  void main(String[] args)
    {
        int []arr={1,2,3,4,5,6,7};
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            System.out.println(i);
            count+=i;
        }
        System.out.printf("length of array : %d",count);
    }
}
