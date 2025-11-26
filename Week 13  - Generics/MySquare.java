public class MySquare {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private MyPoint v4;

    public MySquare(MyPoint p1,MyPoint p2, MyPoint p3, MyPoint p4)
    {
        this.v1 = p1;
        this.v2 =p2;
        this.v3 = p3;
        this.v4 = p4;
    }
    public MySquare(int x1, int y1, int x2, int y2)
    {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y1);
        this.v3 = new MyPoint(x1,y2);
        this.v4 = new MyPoint(x2,y2);
    }
    public String toString()
    {
        return ("MySquare[v1" + v1+ ",v2"+ v2 + ",v3"+v3 + ",v4" + v4 + "]");
    }
    

}
