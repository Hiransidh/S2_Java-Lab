class Student
        {
        int rollNo;
        String name;
        int marks;

        Student(int rollNo,String name,int marks)
                {
                this.rollNo =rollNo;
                this.name=name;
                this.marks=marks;
                }
        class Sports
                {
                String sportsName;
                int actPoint;
                Sports(String sportsName, int actPoint)
                        {
                        this.sportsName = sportsName;
                        this.actPoint = actPoint;
                        }
                }
        }
class main
        {
        public static void main(String args[])
                {

                Student student = new Student(1,"Hiran",80);
                Student.Sports sports =student.new Sports("Football", 10);
                System.out.println("--------------------------------------");
                System.out.println("Roll no : "+student.rollNo);
                System.out.println("Name : "+student.name);
                System.out.println("Marks : "+student.marks);
                System.out.println("--------------------------------------");
                System.out.println("Sports Name : "+sports.sportsName);
                System.out.println("Activity Points : "+sports.actPoint);
                }
        }
