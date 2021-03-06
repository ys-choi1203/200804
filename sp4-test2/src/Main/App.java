package Main;

import java.util.Scanner;

import Main.DTO.RegisterRequest;
import Main.service.MemberListPrinter;
import Main.service.MemberRegisterService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력하세요: ");
		String command = sc.nextLine();
		while (true) {
			if (command.startsWith("new")) {
				// 의존객체 (클래스 안에 있는 객체)
				// dependency object

				String[] arg = command.split(" ");
				App a = new App();
				if (arg.length != 5) {
					a.printHelp();
					System.out.println();
					continue;
				}

				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				req.setName(arg[2]);
				req.setPassword(arg[3]);
				req.setConfirmPassword(arg[4]);
				boolean bl = req.isPasswordEqualConfirmPassword();
				if (!bl) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
				// dependency object
				MemberRegisterService mrs = new MemberRegisterService();
				mrs.regist(req);
			} else if (command.startsWith("change")) {
				System.out.println("변경");
			} else if (command.startsWith("list")) {
				MemberListPrinter listPrint = new MemberListPrinter();
				listPrint.printAll();
			} else if (command.startsWith("info")) {
				System.out.println("변경");
			} else if (command.startsWith("exit")) {
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