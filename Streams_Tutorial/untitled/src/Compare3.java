
    import java.util.*;

    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    // classic use of class for custom comparator
   /* class Checker1 implements Comparator<Student>{

        public int compare(Student a, Student b){
          *//*  int a1 = (int) (a.getCgpa() * 100);
            int b1 = (int) (b.getCgpa() * 100);
*//*
            if(a.getCgpa() == b.getCgpa()) {
                if(a.getFname().equals(b.getFname())){
                    return Integer.compare(a.getId(), b.getId());
                }
                return a.getFname().compareTo(b.getFname());
            }
            return Double.compare(b.getCgpa(), a.getCgpa());

            // using ternary with if
            *//*if(a.getCgpa() == b.getCgpa()){
                return a.getFname().equals(b.getFname()) ? a.getId() - b.getId() : a.getFname().compareTo(b.getFname());
            }
            return Double.compare(b.getCgpa(), a.getCgpa());*//*

           *//* return a1 != b1 ? b1 - a1 :
                    a.getFname().equals(b.getFname()) ? a.getId() - b.getId() : a.getFname().compareTo(b.getFname());*//*
        }
    }*/

    public class Compare3
    {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Student List: ");
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }
            System.out.println("Enter Answers List: ");
            int answersCases = studentList.size();
            List<String> answers = new ArrayList<>();
            while(answersCases>0){

                answers.add(in.next());

                answersCases--;
            }

            //custom comparator
            /*Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getFname)
                    .thenComparing(Student::getId);

            Collections.sort(studentList, comparator);*/
/*
            studentList.sort(new Checker1());
*/
            //Lambda
            Comparator<Student> comparator = (s1, s2) -> {
                if(s1.getCgpa() == s2.getCgpa()){
                    return s1.getFname().equals(s2.getFname()) ? s1.getId() - s2.getId() : s1.getFname().compareTo(s2.getFname());
                }
                return 0;
            };


            /*//using Streams
            Collections.sort(studentList,
                    Comparator.comparing(Student::getCgpa).reversed()
                            .thenComparing(Student::getFname)
                            .thenComparing(Student::getId)
            );*/

            for (Student st: studentList){
                System.out.println(st.getFname());
            }

            int missMatchCount = 0;
            for (int i = 0; i < answers.size(); i++){
                if(!studentList.get(i).getFname().equals(answers.get(i))){
                    String name = studentList.get(i).getFname();
                    System.out.println("MissMatched: "+ studentList.get(i).getId() + "| Found at index: " + i + "| Should be at index: " + answers.indexOf(name));
                    missMatchCount++;
                }
            }
            System.out.println(missMatchCount);
        }
    }

