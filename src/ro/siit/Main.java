package ro.siit;

public class Main {

    public static void main(String[] args) {
        SalesRepresentative s1=new SalesRepresentative(10,500);
        SalesRepresentative s2=new SalesRepresentative(7,800);
        SalesRepresentative s3=new SalesRepresentative(10,530);
        SalesRepresentative s4=new SalesRepresentative(10,520);
        SalesRepresentative [] reps=new SalesRepresentative[4];

        reps[0]=s1;
        reps[1]=s2;
        reps[2]=s3;
        reps[3]=s4;
        for(SalesRepresentative s:reps)
            System.out.println(s);
        System.out.println("........................................");
        SalesRepresentative [] sortedReps = s1.sort(reps);
        for(SalesRepresentative s:sortedReps)
            System.out.println(s);
    }
}
