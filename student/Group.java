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
	
		
	public ArrayList<Student> getStList() {
		return stList;
	}
	public void setStList(ArrayList<Student> stList) {
		this.stList = stList;
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
	
	public String convFromGroupToString(Group group) {
		ObjectMapper mapper= new ObjectMapper();		
		try {
			grJson = mapper.writeValueAsString(group);	
			
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}
		return grJson;
		}
	@Override
	public String toString() {
		return "Group name - " + name + ", stList = " + stList + ".";
	}
}

