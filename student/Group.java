package student;

import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Group {
	
	private String name;
	
	public Group(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
		
	ArrayList <Student> stList = new ArrayList<Student>();
	
	public void addStudent(Student t){
		stList.add(t);		
	}
	public void removeStudent(double mark){
		Iterator <Student> iter = stList.iterator();
		while(iter.hasNext()){
			if(iter.next().getMark() < mark){
				iter.remove();
			}			
		}
		for(Object o: stList){
			System.out.println(o);
			}
		}
	
	String grJson = "";
	
	public String convFromStudToString(ArrayList <Student> stList) {
		ObjectMapper mapper= new ObjectMapper();		
		try {
			grJson = mapper.writeValueAsString(stList);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}
		return grJson;
		}
}

