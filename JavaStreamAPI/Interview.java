package JavaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Interview {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        Solution.Ques(list);
    }
}

class Solution {
    public static void Ques(List<Student> list) {

        // 1- Find list of students whose first name starts with alphabet A
        List<Student> students = list.stream().filter(std -> std.getFirstName().startsWith("A"))
                .collect(Collectors.toList());

        for (Student std : students) {
            System.out.println(std);
        }
        System.out.println();

        // 2- Group The Student By Department Names
        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(
                std -> std.getDepartmantName(),
                Collectors.mapping(student -> student.getFirstName(), Collectors.toList())));

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();

        // 3- Find the total count of student using stream

        long count = list.stream().count();
        System.out.println(count);

        System.out.println();

        // 4- Find the max age of student

        Student st = list.stream().max((student1, student2) -> student1.getAge() > student2.getAge() ? 1 : -1).get();

        System.out.println(st.getFirstName());

        System.out.println();

        // 5- Find all departments names
        List<String> names = list.stream().map(std -> std.getDepartmantName()).distinct().collect(Collectors.toList());

        System.out.println(names.toString());

        System.out.println();

        // 6- Find the count of student in each department

        Map<String, Long> depart = list.stream()
                .collect(Collectors.groupingBy(std -> std.getDepartmantName(), Collectors.counting()));

        for (Map.Entry m : depart.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println();

        // 7- Find the list of students whose age is less than 30

        List<Student> li = list.stream().filter(student -> student.getAge() > 30).collect(Collectors.toList());
        System.out.println(li);

        System.out.println();

        // 8- Find the list of students whose rank is in between 50 and 100
        List<Student> liStudents = list.stream()
                .filter(student -> (student.getRank() >= 50 && student.getRank() <= 100))
                .collect(Collectors.toList());
        System.out.println(liStudents);

        System.out.println();

        // 9- Find the average age of male and female students
        Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(
                student -> student.getGender(), Collectors.averagingInt(student -> student.getAge())));
        for (Map.Entry m : avgAge.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println();
        // 10- Find the department who is having maximum number of students

        java.util.Map.Entry<String, Long> maxStd = list.stream().collect(Collectors.groupingBy(
                std -> std.getDepartmantName(), Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(maxStd.getKey() + " " + maxStd.getValue());

        System.out.println();
        // 11- Find the Students who stays in Delhi and sort them by their names

        // Map<String, List<String>> delhiStudents = list.stream().collect(
        // Collectors.groupingBy(std -> std.getCity(),
        // Collectors.mapping(std -> std.getFirstName(), Collectors.toList())));
        // for(Map.Entry m:delhiStudents.entrySet()){
        // System.out.println(m.getKey()+" "+m.getValue());
        // }

        List<String> delhiStd = list.stream().filter(std -> std.getCity().equals("Karnataka"))
                .map(std -> std.getFirstName()).sorted().collect(Collectors.toList());
        System.out.println(delhiStd);

        System.out.println();
        // 12- Find the average rank in all departments

        Map<String, Double> avgRank = list.stream().collect(
                Collectors.groupingBy(std -> std.getDepartmantName(),
                        Collectors.averagingInt(std -> std.getRank())));
        for (Map.Entry m : avgRank.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println();
        // 13- Find the highest rank in each department

        Map<Object, Optional<Student>> highRank = list.stream().collect(
                Collectors.groupingBy(std -> std.getDepartmantName(),
                        Collectors.maxBy((std1, std2) -> std1.getRank() > std2.getRank() ? 1 : -1)));
        System.out.println(highRank);

        System.out.println();

        // 14- Find the list of students and sort them by their rank
        List<String> studentNames = list.stream().
                sorted((std1,std2)->std1.getRank()>std2.getRank()?1:-1).map(std->std.getFirstName())
                .collect(Collectors.toList());
        System.out.println(studentNames);        

        System.out.println();
        //15- Find the student who has second rank

        String secondNames = list.stream().
                sorted((std1,std2)->std1.getRank()>std2.getRank()?1:-1).map(std->std.getFirstName())
                .skip(1).findFirst().get();
        System.out.println(secondNames);        
    }
}

class Student {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String departmantName;

    private int joinedYear;

    private String city;

    private int rank;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
            int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
                + city + ", rank=" + rank + "]";
    }

}
