import java.util.ArrayList;

public class DBgame implements DB{
	ArrayList<categ1>  gamescateg1=new ArrayList<categ1> ();
	ArrayList<categ2>  gamescateg2=new ArrayList<categ2> () ;
	@Override
	public boolean validation(Object g,int type) {
		
		if(type==1){
			categ1collect f=(categ1collect)g;
			if(!f.Question.equals("")&&!f.ch1.equals("")&&!f.ch2.equals("")&&!f.ch3.equals("")
						&&!f.ch4.equals("")&&!f.answer.equals("")){
					
					return true;
				}
			return false;	
			
		}else if(type==2){
			categ2collect q=(categ2collect)g;
			int n=0;
				if(q.Question.equals("")){
					return false;
				}else{
					return true;
			}
		}
		return true;
	}
	public categ1 getgamebyindexcateg1(int i){
		return gamescateg1.get(i-1);
		
	}
	public categ2 getgamebyindexcateg2(int i){
		return gamescateg2.get(i-1);
		
	}
	public void getallgamescateg1(){
		for(int i=0;i<gamescateg1.size();i++){
			categ1 d=new categ1();
			System.out.println(i+1+"-"+d.name);
		}
		
	}
	public void  getallgamescateg2(){
		for(int i=0;i<gamescateg2.size();i++){
			categ2 d=new categ2();
			System.out.println(i+1+"-"+d.name);
		}
		
	}
	public  void addcat1(categ1 q){
         gamescateg1.add(q);
		
	}
   public  void addcat2(categ2 q){
		
		gamescateg2.add(q);
	}
	

}
