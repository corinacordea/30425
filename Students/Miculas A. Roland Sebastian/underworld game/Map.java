package underworld.models;

import underworld.utils.*;

public class Map {
	private int[] resourses;
	
	public Map(){
		resourses = new int[5];
		for(int i = 0; i < 5;i++){
			resourses[i] = Resourses.generateResourse();
		}
	}
	
	public void generateResourses(){
		resourses = new int[resourses.length +1];
		resourses[resourses.length-1] = Resourses.generateResourse();
	}
	
	public boolean consumeResource(int resource){
		for(int i = 0 ;i<resourses.length;i++){
			if(resourses[i] == resource){
				return true;
			}
		}
		return false;
	}
	
	public void ShowResourses(){
		for(int i = 0 ; i<resourses.length;i++){
			System.out.println(resourses[i]);
		}
	}
}
