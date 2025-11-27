public class OuterClass{
private String OuterClassMsg;
OuterClass()
{
    this.OuterClassMsg = "This is the constructor of OuterClass";
}
public String getOuterClassMsg()
{
    return this.OuterClassMsg;
}
public void setOuterClassMsg(String s)
{
    this.OuterClassMsg = s;
}
public void testMethodOC()
{
    innerClass ic = new innerClass();
    ic.testPrivateMethodInnerClass();
    ic.testPublicMethodInnerClass();
    System.out.println(ic.InnerClassMsg);

}

public void testMethodLocalInnerClass()
{
     int localVariable = 20;
     class MethodLocalInnerClass{
        int MLIC;
        MethodLocalInnerClass()
        {
            this.MLIC = 10;
        }
        public void testMLICMethod()
        {
            System.out.println(localVariable);
             System.out.println(this.MLIC);
         
              
        }
       }

       MethodLocalInnerClass MLICOb = new MethodLocalInnerClass();
    }
private void testPrivateMethidOC()
{

}
//public Inner Class
    public class innerClass{
    private String InnerClassMsg;
    innerClass()
    {
        this.InnerClassMsg = "This is Inner class Constructor";
    } 
    public void setInnerClassMsg(String s)
    {
        this.InnerClassMsg = s;
    }
    public String getInnerClassMsg()
    {
    return this.InnerClassMsg;
    }
    public void testPublicMethodInnerClass()
    {
       
       System.out.println("This is Public Method of inner class");
      
    }
      public void testMethodInnerClass()
    {
      System.out.println(OuterClassMsg);
      testPrivateMethidOC();
      testMethodOC();
    
    }
    private void testPrivateMethodInnerClass()
    {
        
    }
    }
//public Inner Class End
//Private Inner Class
private class PrivateInnerClass{
    private String PICMsg;
    //constructors
    //methods
}
//Private Inner Class End
}