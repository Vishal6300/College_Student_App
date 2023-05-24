package entities;

import java.util.Set;

public class College {
		private int collegeId;
		private String collegeName;
		private String collegeAddress;
		private Set<Student> students;
		
		public int getCollegeId() {
			return collegeId;
		}
		public void setCollegeId(int collegeId) {
			this.collegeId = collegeId;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getCollegeAddress() {
			return collegeAddress;
		}
		public void setCollegeAddress(String collegeAddress) {
			this.collegeAddress = collegeAddress;
		}
		public Set<Student> getStudents() {
			return students;
		}
		public void setStudents(Set<Student> students) {
			this.students = students;
		}
		
		public College(int collegeId, String collegeName, String collegeAddress, Set<Student> students) {
			super();
			this.collegeId = collegeId;
			this.collegeName = collegeName;
			this.collegeAddress = collegeAddress;
			this.students = students;
		}
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress="
					+ collegeAddress + ", students=" + students + "]";
		}
		
		
}
