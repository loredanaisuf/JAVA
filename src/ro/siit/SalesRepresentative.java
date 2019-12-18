package ro.siit;

public class SalesRepresentative {
    private int numberOfSales;
    private int quota;
    private int totalValue;

    /**
     * this is the constructor
     * @param n : its value is assigned to numberOfSales field
     * @param q : its value it assigned to quota field
     * the product between n and q is assigned to totalValue field
     */
    public SalesRepresentative(int n, int q){
        numberOfSales=n;
        quota=q;
        totalValue=n*q;
    }

    /**
     *this is the method where I'm doing the sorting of an array of SalesRepresentative objects in descending order.
     * @param reps represents an array of SalesRepresentative
     * @return the array sorted
     */
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

    @Override
    public String toString(){
        return "NumberOfSales:"+numberOfSales+", Quota: "+quota+", Total: "+totalValue;
    }
}
