package com.java.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
int weekDay;
int startTime;
String room;
String subject;
int duration;
List<Course> courses = new ArrayList();


	public int getWeekDay() {
	return weekDay;
}


public void setWeekDay(int weekDay) {
	this.weekDay = weekDay;
}


public int getStartTime() {
	return startTime;
}


public void setStartTime(int startTime) {
	this.startTime = startTime;
}


public String getRoom() {
	return room;
}


public void setRoom(String room) {
	this.room = room;
}


public String getSubject() {
	return subject;
}


public void setSubject(String subject) {
	this.subject = subject;
}


public int getDuration() {
	return duration;
}


public void setDuration(int duration) {
	this.duration = duration;
}


public List<Course> getCourses() {
	return courses;
}


public void setCourses(List<Course> courses) {
	this.courses = courses;
}


	public Course(int weekDay, int startTime, String room, String subject, int duration) {
		// TODO Auto-generated constructor stub
		super();
		this.duration=duration;
		this.room=room;
		this.startTime=startTime;
		this.subject=subject;
		this.weekDay=weekDay;
		
	}
	public void on() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1~7)：");
		int input = scanner.nextInt();
		int tmp = 0;
		int ttime = 0;
		int tdur = 0;
		String tcourse = null;
		String troom = null;
		boolean isavaliable = true;
		for(int i=0;i<courses.size();i++) {
			Course c = courses.get(i);
			if(input==c.getWeekDay()) {
				tmp = c.getWeekDay();
				ttime = c.getStartTime();
				tdur = c.getDuration();
				troom = c.getRoom();
				tcourse = c.getSubject();
				break;
			}
		}
		System.out.println("請輸入時(0~24)：");
		
		input = scanner.nextInt();
		if(input>=ttime && input<=(ttime+tdur)) {
			isavaliable = false;
		}
		if(isavaliable) {
			System.out.println("【有空檔】");
		}else {
			System.out.println("【有課：   "+troom+" "+tcourse+" 到"+(ttime+tdur)+"時】");
		}
	}
	public Course() {
		super();
	}
public Boolean isAvaliable(int weekDay, int startTime) {
		
		boolean a = false;
		if (this.weekDay == weekDay && this.startTime <= startTime && startTime <= (this.startTime + this.duration)) {
			a = false;
			
		} else if (this.weekDay == weekDay && this.startTime >= startTime
				&& startTime >= (this.startTime + this.duration)) {
			a = true;
		
		}
		return a;
	}

}
