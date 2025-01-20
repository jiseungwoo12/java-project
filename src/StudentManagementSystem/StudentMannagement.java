package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMannagement {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 학생 추가
    public void addStudent() {
        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();  // 이름을 입력받음
        System.out.println("영어 점수를 입력하세요.");
        int engscore = scanner.nextInt();
        scanner.nextLine();  // nextInt() 뒤에 남은 개행 문자를 처리하기 위해 호출
        System.out.println("수학 점수를 입력하세요");
        int mathscore = scanner.nextInt();
        scanner.nextLine();  // nextInt() 뒤에 남은 개행 문자를 처리하기 위해 호출

        // 학생 객체 생성
        Student student = new Student(name, engscore, mathscore);

        // 학생을 리스트에 추가
        students.add(student);

        // 추가된 학생 리스트 확인 (디버깅용)
        System.out.println("학생이 추가되었습니다.");
    }

    // 학생 목록 출력
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("학생이 없습니다.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
