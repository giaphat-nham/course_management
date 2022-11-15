package test;

import java.util.ArrayList;
import java.util.Objects;

import DAL.CourseInstructorDAL;
import DTO.CourseInstructorDTO;
import test.Test;

public class TestCourseInstructor {
	private static Test test = new Test();
	
	private static boolean equals(ArrayList<CourseInstructorDTO> list1, ArrayList<CourseInstructorDTO> list2) {
		if (list1.size()!=list2.size())
			return false;
		for (int i = 0 ; i < list1.size() ; i++) {
			if (list1.get(i).getCourseID() != list2.get(i).getCourseID() ||
					list1.get(i).getPersonID() != list2.get(i).getPersonID())
				return false;
		}
		return true;
	}
	
	private static void testList(ArrayList<CourseInstructorDTO> result) {
		test.addTest();
		ArrayList<CourseInstructorDTO> list = new ArrayList<CourseInstructorDTO>();
		result.forEach(rs -> {
			CourseInstructorDTO p = new CourseInstructorDTO();
			p.setCourseID(rs.getCourseID());
			p.setPersonID(rs.getPersonID());
			list.add(p);
		});
		
		if (list.isEmpty() && result.isEmpty()) {
			test.out("list()", true, "Duong thi hanh 1");
		}
		else if (!result.isEmpty() && !list.isEmpty() && equals(result,list)) {
			test.out("list()", true, "Duong thi hanh 2");
		}
		else {
			if ((!list.isEmpty() && result.isEmpty()) ||
					(list.isEmpty() && !result.isEmpty()))
				test.out("list()", false, "Duong thi hanh 1");
			else if (!result.isEmpty() && !list.isEmpty() && !equals(result,list))
				test.out("list()", false, "Duuong thi hanh 2");
		}
	}
	
	public static void main(String[] args) {
		//Tao test data
		ArrayList<CourseInstructorDTO> list1 = new ArrayList<CourseInstructorDTO>();
		ArrayList<CourseInstructorDTO> list2 = new ArrayList<CourseInstructorDTO>();
		list2.add(new CourseInstructorDTO(1,2));
		list2.add(new CourseInstructorDTO(3,2));
		
		//Goi test case
		testList(list1);
		testList(list2);
		
		
		//Tong ket
		test.result();
	}
}
