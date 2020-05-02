package model;

public class Department {
		private String DepartmentName;

		public Department(String departmentName) {
			super();
			DepartmentName = departmentName;
		}

		public String getDepartmentName() {
			return DepartmentName;
		}

		public void setDepartmentName(String departmentName) {
			DepartmentName = departmentName;
		}

		@Override
		public String toString() {
			return "Department [DepartmentName=" + DepartmentName + "]";
		}
		
		
}
