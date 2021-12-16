package instatistics.model;

import java.util.ArrayList;


public class TimeStamp implements Field{
	
	ArrayList <Post> array = new ArrayList <Post>();
	public TimeStamp (ArrayList<Post> array) {
		this.array=array;
	}
	@Override
	public String NumberOfRepetition(String ObjectOfInterest) {
		int cont=0;
		for(int i=0;i<array.size();i++) {
			if(array.get(i).timestamp.contains(ObjectOfInterest)) {cont++;
			}
		}
		return Integer.toString(cont);
	}
	@Override
	public String Ranking(String[] input) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
