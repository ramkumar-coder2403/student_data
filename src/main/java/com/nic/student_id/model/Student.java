package com.nic.student_id.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "student_details")
	public class Student {
		
		

		


		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int roll_number, String student_name, String father_name, String date_of_birth,String gender,String blood_group,
				String college_name,String college_code,String graduation,String degree_name,String course_start,String course_end,
				String present_adress,String permanent_address,long mobile_number,String image) {
			
			super();
			
			this.roll_number = roll_number;
			this.student_name = student_name;
			this.date_of_birth = date_of_birth;
			this.gender = gender;
			this.blood_group = blood_group;
			this.college_name = college_name;
			this.college_code = college_code;
			this.graduation = graduation;
			this.degree_name = degree_name;
			this.course_start = course_start;
			this.course_end = course_end;
			this.present_adress = present_adress;
			this.permanent_address = permanent_address;
			this.mobile_number = mobile_number;
			this.image=image;
			
		}

		@Id
		private int roll_number;

		private String student_name;

		private String date_of_birth;
		private String gender;
		private String blood_group;
		private String college_name;
		private String college_code;
		private String graduation;
		private String degree_name;
		private String course_start;
		private String course_end;
		private String present_adress;
		private String permanent_address;
		private long mobile_number;
		private String image;
		

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			
			this.image = image;
		}

		public int getRoll_number() {
			return roll_number;
		}

		public void setRoll_number(int roll_number) {
			this.roll_number = roll_number;
		}

		public String getStudent_name() {
			return student_name;
		}

		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}

		public String getDate_of_birth() {
			return date_of_birth;
		}

		public void setDate_of_birth(String date_of_birth) {
			this.date_of_birth = date_of_birth;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBlood_group() {
			return blood_group;
		}

		public void setBlood_group(String blood_group) {
			this.blood_group = blood_group;
		}

		public String getCollege_name() {
			return college_name;
		}

		public void setCollege_name(String college_name) {
			this.college_name = college_name;
		}

		public String getCollege_code() {
			return college_code;
		}

		public void setCollege_code(String college_code) {
			this.college_code = college_code;
		}

		public String getGraduation() {
			return graduation;
		}

		public void setGraduation(String graduation) {
			this.graduation = graduation;
		}

		public String getDegree_name() {
			return degree_name;
		}

		public void setDegree_name(String degree_name) {
			this.degree_name = degree_name;
		}

		public String getCourse_start() {
			return course_start;
		}

		public void setCourse_start(String course_start) {
			this.course_start = course_start;
		}

		public String getCourse_end() {
			return course_end;
		}

		public void setCourse_end(String course_end) {
			this.course_end = course_end;
		}

		public String getPresent_adress() {
			return present_adress;
		}

		public void setPresent_adress(String present_adress) {
			this.present_adress = present_adress;
		}

		public String getPermanent_address() {
			return permanent_address;
		}

		public void setPermanent_address(String permanent_address) {
			this.permanent_address = permanent_address;
		}

		public long getMobile_number() {
			return mobile_number;
		}

		public void setMobile_number(long mobile_number) {
			this.mobile_number = mobile_number;
		}

		
}