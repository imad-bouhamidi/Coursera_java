package ensat.java;

public class Date {
private int day;
private int month;
private int years;

Date(int d, int m,int y){
day = d;
month =m;
years =y;
}

public String toString(){
	return ("date: "+day+"/"+month+"/"+years);
}
}
