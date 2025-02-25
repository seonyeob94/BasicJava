package kr.or.ddit.homework15;

import kr.or.ddit.util.ScanUtil;

public class Homework15 {
	public static void main(String[] args) {
		Homework15 hw = new Homework15();
		hw.process();
		
		
	}
	
	public void process() {
		while(true) {
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 구매");
			System.out.println("3. 상품 삭제");
			System.out.println("4. 상품 출력");
			// 상품 구매시 남은 수량이 0이라면 상품 삭제
			// 상품 추가시 수량을 1이상 입력하도록
			int sel = ScanUtil.nextInt("선택 :");
			
			if(sel==1) prodtAdd();
			if(sel==2) prodSale();
			if(sel==3) prodDelete();
			if(sel==4) printAll();
		}
		
	}
	
	Prod[] prodList = new Prod[50];
	int cnt;
	
	public void prodtAdd() {
		
		String name = ScanUtil.next("이름 : ");
		String type = ScanUtil.next("내용 : ");
		
		int amount;
		while(true) {
		amount = ScanUtil.nextInt("수량(1이상) : ");
		if(amount>0) break;
		System.out.println("수량은 1개 이상이어야 합니다");
		
		}
		
		Prod pf = new Prod();
		pf.setFname(name);
		pf.setType(type);
		pf.setAmount(amount);
		prodList[cnt++]=pf;
		
		System.out.println("상품이 추가되었습니다.");
		printAll();
		
	}
	
	public void prodSale() {
		printAll();
		if(cnt==0) {
			System.out.println("재고가 없습니다.");
			return;
		}
		
		int sel = ScanUtil.nextInt("상품선택 ")-1;
		if(sel<0||sel>=cnt) {
			System.out.println("잘못된 선택입니다.");
			return;
		}
		
		int sale =ScanUtil.nextInt("판매수량 : ");
		Prod pf = prodList[sel];
		
		if(sale>pf.getAmount()) {
			System.out.println("재고가 부족합니다. (현재 수량 :"+pf.getAmount()+")");
			return;
		}
		
		pf.setAmount(pf.getAmount()-sale);
		System.out.println("구매가 완료되었습니다. 남은 수량 : "+pf.getAmount());
		
		if(pf.getAmount()==0) {
			System.out.println("재고가 없어 품목이 삭제됩니다.");
			prodDeleteAa(sel);
		}
		

		printAll();
			
		
	}
	

	public void prodDelete() {
		printAll();
		if(cnt==0) {
			System.out.println("삭제할 품목이 없습니다");
			return;
		}
		int sel = ScanUtil.nextInt("폐기할 품목 : ")-1;
		if(sel<0||sel>=cnt) {
			System.out.println("잘못된 선택입니다.");
			return;
		}
		
		prodDeleteAa(sel);
		System.out.println("품목이 삭제되었습니다");
		printAll();
		
		
	}
	
	private void prodDeleteAa(int sel) {
		
		for(int i=sel;i<cnt;i++) {
			if(i==prodList.length-1) {
				prodList[i]=null;
			}
			else {
				prodList[i]=prodList[i+1];
			}
		}
		
		cnt--;
				
		
	}
	
	public void printAll() {
		System.out.println("번호\t이름\t종류\t수량");
		System.out.println("=================");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+". "+prodList[i]);
		}
		System.out.println("=================");
	}
}

class Prod{
	// 이름 내용 수량
	private String fname;
	private String type;
	private int amount;
	
	public String getFname() {
		return fname;
	}
	public String getType() {
		return type;
	}
	public int getAmount() {
		return amount;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return fname + "\t" + type + "\t" + amount;
	}
	
	
}