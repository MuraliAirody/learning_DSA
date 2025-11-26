public class NoStepsReduce {
    public static void main(String[] args) {
        System.out.println(noOfStepsToreduceNoToZero(8,0));
    }

    private static int noOfStepsToreduceNoToZero(int i, int steps) {

        if(i==0){
            return steps;
        }
        if(i%2==0){
            i=i/2;
            steps++;
        }else{
            i--;
            steps++;
        }

        return  noOfStepsToreduceNoToZero(i,steps);
    }
}
