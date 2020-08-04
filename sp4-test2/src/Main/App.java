package Main;

import java.util.Scanner;

import Main.DTO.RegisterRequest;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력하세요: ");
		String command = sc.nextLine();
		if(command.startsWith("new")) {
			// 의존객체 (클래스 안에 있는 객체)
			// dependency object
			/*
			String [] arg = command.split(" ");
			App a = new App();
			if(arg.length != 5){
				a.printHelp();
			}
			RegisterRequest req = new RegisterRequest();
			*/
			if(command.equals("new")) {
				System.out.println("회원등록");
			}else if(command.startsWith("change")) {
				System.out.println("변경");
			}else if(command.startsWith("list")) {
				System.out.println("리스트");
			}else if(command.startsWith("info")) {
				System.out.println("변경");
			}else if(command.startsWith("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
			}
		}
	}
	
	public static void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법: ");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println("list");	
		System.out.println("info  이메일");
	}
}