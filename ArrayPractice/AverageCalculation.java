//Average Calculating 
public class AverageCalculation{
    public static void main(String[] args) {
        float [ ] totPhyMrks = {70f,56f,65f,92f,100f,20f,42f,84f};
        float sum = 0;
        float tonm = totPhyMrks.length;
        for (float elements : totPhyMrks){
            sum = elements+sum;
        }
        System.out.println(sum/tonm);
        
    }
}
