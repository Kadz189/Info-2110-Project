import java.util.concurrent.*;

public class DictionBin extends DictionBase
{
   

    public DictionBin() throws Exception
    {
          super();
    }
    
    
    public  String translate(String eng) throws Exception
    {
                
        return translateB(eng, 0, dictionArr.length);
    }  

     private  String translateB ( String eng,int lo, int hi) throws Exception
    {
                int mid ,found =0;
                String returnval;
                int count = 0;
                returnval = "No comprehendo";
                            
                TimeUnit.NANOSECONDS.sleep(1);
                if (lo > hi)
                    returnval = "No comprehendo";
                    
                if(hi - lo == 1)
			return dictionArr[lo].equals(eng) ? eng : returnval;
		mid = (lo + hi)/2;
		
		if(eng.compareTo(dictionArr[mid].toString()) < 0) {
			return translateB(eng, 0, mid);
		} else if(eng.compareTo(dictionArr[mid].toString()) > 0) {
			return translateB(eng, mid, hi);			
		} else if (eng.compareTo(dictionArr[mid].toString()) == 0){
		    count++;	    
		}
		if (count == 0){
		 return returnval;   
		}
		   

		return eng;
		
    }

                
   }



