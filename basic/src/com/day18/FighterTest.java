package com.day18;

interface Attackable{	//지정된 대상을 공격하는 기능
	public abstract void attak(Unit unit);
}

interface Movable{
	void move(int x, int y);	//지정된 위치로 이동하는 기능
}
//인터페이스 끼리의 상속도 가능 - extends 키워드 사용, 다중 상속이 가능
interface Fightable extends Attackable, Movable{
	
}

abstract class Unit{
	protected int x;	//유닛의 위치 (x좌표)
	protected int y;	//유닛의 위치 (y좌표)
	protected int currentHP;	//유닉의 체력
	
	Unit(int x, int y, int currentHP){
		this.currentHP=currentHP;
		this.x=x;
		this.y=y;
	}
	
}

//상속과 구현을 동시에
class Fighter extends Unit implements Fightable{
	
	Fighter(int x, int y, int currentHP){
		super(x, y, currentHP);
		
	}
	public void attak(Unit unit) {
		System.out.println(unit.x + ", " + unit.y + "위치에 있고, " + unit.currentHP + "의 체력을 갖는 유닛을 공격한다.");
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x + ", " + y + "위치로 이동한다."); 
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 200);
		f.move(50, 70);
		
		
		//f가 50,70위치에 있고 체력이 150인 유닛 공격하고 60,80으로 이동
		Unit unit = new Fighter(50, 70, 150);
		f.attak(unit);
		f.move(60, 80);
		//60,80위치에 있고 체력 100인 또 다른 유닛 공격
		f.attak(new Fighter(60, 80, 100));
		
		//자식은 부모의 인스턴스이기도하다
		if(f instanceof Fighter) {
			System.out.println("f는 Fighter의 인스턴스이다");
		}
		if(f instanceof Unit) {
			System.out.println("f는 Unit의 인스턴스이다");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했다");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현했다");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f는 attackable 인터페이스를 구현했다");
		}
		
		
		if(f instanceof Object) {
			System.out.println("f는 Object 인스턴스 이기도하다");
		}

	}

}
