package TestKeyword;                                           //package keyword

public class JavaKeywords {                                    //public,class keywords 
     private int a;                                            // private
     protected String b;                                       //protected
     
     public void key(int a) {                                  //void,int 
    	 this.a=a;                                             //this
     }
    public String getKey() {                                  //String
    	return b;                                             //return
    }
    public void setKey(String b) { 
    	b=b;
    }
    
    void starPrint()throws Exception {                      //throws ,Exception
    	int a=5;
    	int b=4;
    	for(int i=1;i<=5;i++) {                             //for 
    		for(int j=1;j<=i;j++) {
    			System.out.print("*");                       //System,out,print
    		}
    		System.out.println();
    	}
    }
    void decisionMaking() {
    	int num =800;
    	if(num>1000) {                                           //if
    		System.out.println("Number is less than 1000");  
    		 
    	}else  {                                                // else
    		System.out.println("Number is greater than 1000");
    	}
    }
	public static void main(String[] args) {                    //static ,arg
		// TODO Auto-generated method stub
		try {                                                   //try
		JavaKeywords tk=new JavaKeywords();                     //new
		tk.key(10);    
		tk.setKey("Keywords in java");
		System.out.println(tk.getKey());
        tk.starPrint();
        tk.decisionMaking();
		}catch(Exception e){                                    //catch,Exception
			
			System.out.println(e);
			
		}
      
	}

}
