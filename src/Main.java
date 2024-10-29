public class Main 
{  
    public static void main (String[] args) 
    {
    	Program list = new Program();
    	list.AddElem(21);
    	list.AddElem(74);
    	list.AddElem(32);
    	list.AddElem(6);
    	list.DelElem(74);
    	int a=0;
    	a = list.TakeElem(21);
    	list.Print();
    	System.out.println();
    	System.out.println(a);
    }
}
