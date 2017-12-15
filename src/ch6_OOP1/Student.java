package ch6_OOP1;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student() {
	}
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		
//		getTotal()/3f = 78.666664;
//		getTotal()/3f*10 + 0.5f = 787.16664;
//		(int)(getTotal()/3f*10+0.5f) = 787;
//		(int)(getTotal()/3f*10+0.5f) / 10f = 78.7;
		
	}
	public String info() {
		String inf = name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				;
		return inf;
	}
}