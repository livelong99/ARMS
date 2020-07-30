
package CLASS;

abstract public class marks {
    public int term; 
    public int M[],Total;
    
    public marks()
    {
        M = new int[3];
        M[0] = 0;
        M[1] = 0;
        M[2] = 0;
        Total = 0;
        term = 0;
    }
    public abstract int Attcheck();
    public abstract void TakeM(int m);
    
    public String displayM()
    {
        return(M[0] + "             "+M[1]+"               "+M[2]+"            "+Total);
    }
}
