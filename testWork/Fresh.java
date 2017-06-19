package testWork;

import java.util.ArrayList;

public class Fresh {
	
	ArrayList <IJuiceable> juice = new ArrayList <>();
	ArrayList <ISliceable> slice = new ArrayList <>();

	public void addToJuices(IJuiceable j){
	    try{
	      juice.add(j);
	    }catch(Exception e) {
				e.printStackTrace();
			}
	    }
	    
	public void addToSlices(ISliceable s){
	    try{
	      slice.add(s);
	    }catch(Exception e) {
				e.printStackTrace();
			}
	    }
	    
	public void makeFrash(){

	    for(IJuiceable j: juice){
	        j.makeJuice();
	        }
	    for(ISliceable s: slice){
	        s.makeSlices();
	        }
	    }

}
