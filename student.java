class student
	{
		int rollno;
		student(int rollno)
		{
			this.rollno = rollno;
		}
		public static void main(String args[])
			{
				
				student s = new student(10);
				System.out.println(s.rollno);
			}
}