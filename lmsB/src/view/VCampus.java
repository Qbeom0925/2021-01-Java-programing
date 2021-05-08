package view;

import java.util.Scanner;
import java.util.Vector;

import control.CIndex;
import valueObject.OIndex;

public class VCampus {
	
	private Scanner scanner;	
	private CIndex cIndex;
	
	public VCampus(Scanner scanner) {
		this.scanner=scanner;
		this.cIndex = new CIndex();
	}

	public String show(String fileName) {
		System.out.println("소속 캠퍼스를 선택하세요.");
		
		Vector<OIndex> indices = cIndex.getAll(fileName);   // 여기서 오류남
		for(OIndex index: indices) {
			System.out.println(index.getId() + " " + index.getName());
		}		
		
		String id = this.scanner.next();
		for(OIndex index: indices) {
			if(index.getId().equals(id)) {
				return index.getFileName();
			}
		}
		return null;
	}

}