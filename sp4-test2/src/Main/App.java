package Main;

import java.util.Scanner;

import Main.DTO.RegisterRequest;
import Main.service.MemberListPrinter;
import Main.service.MemberRegisterService;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ɾ �Է��ϼ���: ");
		String command = sc.nextLine();
		while (true) {
			if (command.startsWith("new")) {
				// ������ü (Ŭ���� �ȿ� �ִ� ��ü)
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
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				}
				// dependency object
				MemberRegisterService mrs = new MemberRegisterService();
				mrs.regist(req);
			} else if (command.startsWith("change")) {
				System.out.println("����");
			} else if (command.startsWith("list")) {
				MemberListPrinter listPrint = new MemberListPrinter();
				listPrint.printAll();
			} else if (command.startsWith("info")) {
				System.out.println("����");
			} else if (command.startsWith("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
			}
		}
	}

	public static void printHelp() {
		System.out.println();
		System.out.println("��ɾ� ����: ");
		System.out.println("new �̸��� �̸� ��ȣ ��ȣȮ��");
		System.out.println("change �̸��� ������ ������");
		System.out.println("list");
		System.out.println("info  �̸���");
	}
}