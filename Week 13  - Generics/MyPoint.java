public class MyPoint<T>{
    private T x;
    private T y;
    public MyPoint(){

        this.x = null;
        this.y = null;
    }
     public MyPoint(T x, T y){
        this.x = x;
        this.y = y;
     }
     public T getX() {
         return x;
     }
     public void setX(T x) {
         this.x = x;
     }
     public T getY() {
         return y;
     }
     public void setY(T y) {
         this.y = y;
     }
     public void setXY(T x, T y)
     {
        this.x = x;
        this.y = y;
     }
     public String toString()
     {
        return ("("+this.x +","+this.y+")");
     }
     public<Y> void displayPoint(Y msg)
     {
      System.out.println(this.x + " and " + this.y + " Message = " + msg);
     }
    

}