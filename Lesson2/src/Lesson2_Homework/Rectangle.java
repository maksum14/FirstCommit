package Lesson2_Homework;

public class Rectangle {

	int height;
	int width;
	
	Rectangle(){
		this.height=10;
		this.width=20;
		
	}
	
	Rectangle(int h, int w){
		this.height=h;
		this.width=w;
	}
	
	public void squire(){
		
		int squire=this.height*this.width;
		System.out.println("����� ������������ = "+squire+" cm.��");
	}
	
	public void perimeter(){
		int squire=(this.height+this.width)*2;
		System.out.println("�������� ������������ = "+squire+" cm.��");
	}
	
}
