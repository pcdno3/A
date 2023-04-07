package com.day17;

abstract class Unit{
	protected int x, y;	//현재위치
	
	/**	이동하는 메서드를 구현한다*/ 
	abstract public void move(int x, int y);
	
	public void stop() {
		System.out.println("현재 위치에 정지합니다.");
	}
	
}

class Marine extends Unit{
	
	public void move(int x, int y) {
		//지정된 위치로 이동
		this.x=x;
		this.y=y;
		
		System.out.println("보병이 " + x + ", " + y + " 위치로 이동한다");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}



class Tank extends Unit{
	
	public void move(int x, int y) {
		//지정된 위치로 이동
		this.x=x;
		this.y=y;
		
		System.out.println("탱크가 " + x + ", " + y + " 위치로 이동한다");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
}

class DropShip extends Unit{
	public void move(int x, int y) {
		//지정된 위치로 이동
		this.x=x;
		this.y=y;
		
		System.out.println("수송선의 위치를 " + x + ", " + y + " 로 이동한다");
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	public void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}

public class StarCraftTest1 {

	public static void main(String[] args) { 
		
		Unit[] group = new Unit[4];
		
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new DropShip();
		
		for(Unit u : group) {
			u.move(100, 200);
		}//for
		Unit u = new Marine();
		if(u instanceof Marine) {
			Marine m = (Marine)u;
			m.stimPack();
		}
		
		System.out.println("\n====================");
		for(int i=0; i<group.length; i++) {
			if(group[i] instanceof Marine) {
				Marine m = (Marine)group[i];
				m.stimPack();
			}else if(group[i] instanceof Tank){
				Tank t = (Tank)group[i];
				t.changeMode();
			}else if(group[i] instanceof DropShip) {
				DropShip d = (DropShip)group[i];
				d.load();
				d.unload();
			}
		}
			
			System.out.println("\n==========================");
		for(Unit unit : group) {
			if(unit instanceof Marine) {
				Marine m = (Marine)unit;
				m.stimPack();
			}else if(unit instanceof Tank){
				Tank t = (Tank)unit;
				t.changeMode();
			}else if(unit instanceof DropShip) {
				DropShip d = (DropShip)unit;
				d.load();
				d.unload();
			}
		}
		
		
		
		
		
		
		
	}

}
