
package CLASS;

public class Attendence extends marks {
    public int p,t,a;
    public double per;
    public Attendence()
    {
        super();
    }
   
    public void take(char b)
    {
        if(b =='a'||b == 'A')
        {
            a = a+1;
            t = t+1;
        } else {
            p = p+1;
            t = t+1;
        }
        per = (double)(p/t)*100;
    }
    
    public String display()
    {
        return(p + "              "+ a +"               "+ t + "           "+ per);
    }
    
    @Override
    public int Attcheck()
    {
        switch (term) {
            case 0:
                if(t<1)
                    return 0;
                else
                    return 1;
            case 1:
                if(t<2)
                    return 0;
                else
                    return 1;
            case 2:
                if(t<3)
                    return 0;
                else
                    return 1;
            default:
                return 1;
        }
    }
    @Override
    public void TakeM(int m)
    {
        if (term!=3)
        {
            if(per<75&&term==2)
            {
                m = m/2;
            }
            M[term] = m;
            Total = Total + m;
            term = term +1;
        }
        else
        {
            System.out.print("\t\t->Final Marks have already been Uploaded!<-\n");
        }
    }
}


