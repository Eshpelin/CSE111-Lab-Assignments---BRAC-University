/**
 * 
 * 
 * Manages database
  
  */

public class StudentDatabase extends Student{
    
    Student [] records;
    
    /**
     * Umm data print kori
     */
    void printDatabase(){
        int c=0; /* jj*/
        while(c<records.length){ //5
            System.out.println(records[c].toString());
            ++c;
        }
    }
    /*
     *no parameter
     */
    void sortByName(){
        //System.out.println("parina");
      int i,j;
      Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")  
                if(records[j-1].name.compareTo(records[j].name)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    
    void sortByID(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")  
                if(records[j-1].id.compareTo(records[j].id)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    void sortBySection(){
      int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")  
                if(records[j-1].section>records[j].section){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    
    // to be honest, I am getting lost here myself :( 
    
    void sortByMark(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){
                if(records[j-1].mark > records[j].mark){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
}
