package com.xworkz.Tester;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.dto.dao.CollegeDAO;
import com.xworkz.college.dto.dao.CollegeDAOImpl;

public class Tester {

	public static void main(String[] args) {
		
		CollegeDTO collegeDTO = new CollegeDTO(06,"JCE","Mysore",300,200,7);
		CollegeDAO daoimpl = new CollegeDAOImpl();
		daoimpl.saveCollege(collegeDTO);
         daoimpl.fetchCollege(02);
         daoimpl.updateCollege(collegeDTO, 05);
	}
}
//output
//Hibernate: insert into collegedb (CLOCATION, CNAME, NOOFBRANCHES, NOOFROOMS, NOOFSTUDENT, COLLEGE_ID) values (?, ?, ?, ?, ?, ?)
// select * from collegedb;
//-----------+-------+-----------+-------------+-----------+--------------+
//| college_id | cname | clocation | noofstudent | noofrooms | noofbranches |
//-----------+-------+-----------+-------------+-----------+--------------+
 //         1 | MIT   | Mysore    |         200 |       100 |            8 |
//-----------+-------+-----------+-------------+-----------+--------------+
