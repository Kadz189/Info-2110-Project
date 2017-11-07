import java.util.concurrent.*;    

public class DictionSeq extends DictionBase
{

    public DictionSeq() throws Exception
    {
         super();
    }
    
    
    public  String translate(String eng) throws Exception
    {       
        int count = 0;
        for (int i = 0; i < dictionArr.length; i++) {
            for (int j = 0; j < dictionArr[i].length; j++) {
                if (dictionArr[i][j].equals(eng)){ 
                    count++;
                }
              }
        }
        if (count==0){
            eng="Not found";            
        }
        return translateS(eng); 
    }    
    

   private String translateS (String eng) throws Exception
    {int ndx = 0, found =0;
     String returnval;
     while((ndx< this.getCount()) && (found==0))
     {
         TimeUnit.NANOSECONDS.sleep(1);
         //need to complete code here
         //to implement search
         //
         ndx ++;
        }
      
     if (found ==1)
        returnval = new String(this.getVal(ndx,1));
     else 
        returnval = "No comprehendo";
      return returnval;
    }

}
