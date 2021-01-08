package com.xworkz.college.dto.dao;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeDAO {
	
	 void saveCollege(CollegeDTO collegeDTO);
	 
     void fetchCollege(int college_id);
     
     void updateCollege(CollegeDTO collegeDTO , int college_id);
}
