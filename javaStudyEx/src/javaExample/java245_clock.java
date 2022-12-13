package javaExample;

public class java245_clock {
	
	public static void main(String[] args) {
		
		
		Time t1 = new Time();
		t1.setHour(24);
		System.out.println(t1.getHour());
	}

}


// 시계 틀

class Time{
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() { return hour;}
	public int getMinute() { return minute;}
	public float getSecond() { return second;}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) { // 0보다 작거나 23보다 크면 변경하지않고 리턴 ( 0 ~ 23)
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}
	
	public void setSecound(float second) {
		if(second < 0.0f || second > 59.99f) {
			return;
		}
		this.second = second;
	}
	
}


