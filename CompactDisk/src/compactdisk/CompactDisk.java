package CompactDisk;

import java.io.*;
import java.util.*;

public class CompactDisk {

	private String titoloCD;
	private String casaDiscografica;
	private String[] nat;
	private String[] titoloTraccia;
	private int[] durataTracce;
        private int nt;
	public CompactDisk() 
        {
		titoloCD= "";
                casaDiscografica="";
                titoloTraccia= new String[40];
                nat= new String [40];
                durataTracce= new int [40];
                nt=0;
               
	}

	public CompactDisk(String tcd, String cd) 
        {
                titoloCD= tcd;
                casaDiscografica=cd;
                titoloTraccia= new String[40];
                nat= new String [40];
                durataTracce= new int [40];
		
	}
        
        //metodi getter
	public String getTitolo() 
        {
            
            return titoloCD;
		
	}

	public String getCasaDiscografica() 
        {
            
            return casaDiscografica;
		
	}
        
        //metodi setter
	public void setTitolo(String t) 
        {
		
            titoloCD=t;
            
	}

	public void setCasaDiscografica(String cd) 
        {
		
            casaDiscografica=cd;
            
	}
        
        //altri metodi
	public boolean addTraccia(String tcd, int dt, String a) 
        {
            if(nt<40)
            {
                nat[nt]=a;
                titoloTraccia[nt]=tcd;
                durataTracce[nt]=dt;
                return true;
                
            } 
              
	}

	public int durata() 
        {
		
	}

	public int minutiDurata() 
        {
		
	}

	public int secondiDurata() 
        {
		
	}

}
