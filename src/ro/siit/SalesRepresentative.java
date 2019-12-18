package ro.siit;

public class SalesRepresentative {
    private int numberOfSales;
    private int quota;
    private int totalValue;

    public SalesRepresentative(int n, int q){
        numberOfSales=n;
        quota=q;
        totalValue=n*q;
    }

    public SalesRepresentative[] sort(SalesRepresentative[] reps){
        int i,j;
        SalesRepresentative temp;
        for(i=0;i<reps.length;i++){
            for(j=i;j<reps.length;j++)
                if(reps[i].totalValue<reps[j].totalValue){
                    temp=reps[i];
                    reps[i]=reps[j];
                    reps[j]=temp;
                }
        }
        return reps;
    }

    public String toString(){
        return "NumberOfSales:"+numberOfSales+", Quota: "+quota+", Total: "+totalValue;
    }
}
