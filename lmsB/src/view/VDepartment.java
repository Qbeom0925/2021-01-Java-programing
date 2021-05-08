package view;

import java.util.Scanner;
import java.util.Vector;

import control.CIndex;
import valueObject.OIndex;

public class VDepartment {
	private Scanner scanner;	
	private CIndex cIndex;
	
	public VDepartment(Scanner scanner) {
		this.scanner=scanner;
		this.cIndex = new CIndex();
	}

	public String show(String collegeFileName) {
		System.out.println("학과를 선택하세요.");
		
		Vector<OIndex> indices = cIndex.getAll("src/data/"+collegeFileName);   // 여기서 오류남
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
